package com.everisProject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.everisProject.models.Answer;
import com.everisProject.models.Question;
import com.everisProject.services.TellezBotServiceI;


@Controller
public class GrupoGTellezBotController {
	
	@Autowired
	private TellezBotServiceI botService;
	
	private static Boolean control = Boolean.FALSE;
	private static Question ctrlQuestion = null;
	
	
	
	/**
	 * 
	 * @param question
	 * @param model
	 * @return String
	 */
	@PostMapping("/botRequest") 
	public String userQuestion(@ModelAttribute Question question, Model model) {
		boolean isVisible=Boolean.TRUE;
		
		Answer answer = botService.findAnswer(question.getContent());
		model.addAttribute("question", question.getContent());
		model.addAttribute("tu", "Humano: ");
		model.addAttribute("tellez", "TellezBot: ");

		if (!control) {
			if(answer!=null || !StringUtils.isEmpty(answer)) {
				isVisible=Boolean.FALSE;
				model.addAttribute("respuesta", answer.getContent());
				model.addAttribute("boolean", isVisible);
			}else{
				model.addAttribute("respuesta", "No tengo esa pregunta en mi BBDD, ¿me escribes la respuesta?");
				ctrlQuestion = question;
				control = Boolean.TRUE;
			}
		} else {
			control = Boolean.FALSE;
			model.addAttribute("respuesta", "Buena respuesta! Muchas gracias por enseñarme :). Preguntame de nuevo.");
			
			Answer aux = new Answer();
			aux.setContent(question.getContent());
			aux.setQuestion(ctrlQuestion);
			ctrlQuestion.setAnswer(aux);
			botService.addQuestingAndAnswer(aux, ctrlQuestion);
		}

		return "tellezBot";
	}
}