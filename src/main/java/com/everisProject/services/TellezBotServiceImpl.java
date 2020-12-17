package com.everisProject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.everisProject.models.Answer;
import com.everisProject.models.Question;
import com.everisProject.repositories.AnswerRepositoryI;
import com.everisProject.repositories.QuestionRepositoryI;

@Service
public class TellezBotServiceImpl implements TellezBotServiceI{

	@Autowired
	private QuestionRepositoryI questionRepository;
	@Autowired
	private AnswerRepositoryI answerRepository;
	
	@Override
	public Answer findAnswer(String question) {
		//Almacena la repuesta
		Answer answer=null;
		
		//Busca si existe la pregunta y comprueba nulidad.
		if (!StringUtils.isEmpty(question) && questionRepository.findByContent(question)!=null) {
			//La pregunta no esta vacía, buscamos la repuesta
			answer = answerRepository.findByQuestion(questionRepository.findByContent(question));
		} else if (StringUtils.isEmpty(question)) {
			//No ha introducido la pregunta
			answer=null;
		} else {
			//No existe la pregunta
			answer=null;
		}
		
		return answer;
	}

	@Override
	public Boolean addQuestingAndAnswer(Answer answer, Question question) {
		//Guarda si lo ha echo o no
		Boolean doIt= false;
		
		//Comprueba nulidad
		if (answer!=null && question!=null) {
			//Añade repuesta
			answerRepository.save(answer);
			//Añade pregunta
			questionRepository.save(question);
			//Indica que lo ha hecho 
			doIt = Boolean.TRUE;
		} else {
			//Indica que no lo ha hecho
			doIt = Boolean.FALSE;
		}
		
		//Devuelve doIt
		return doIt;
		
		
	}

}
