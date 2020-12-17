package com.everisProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class GrupoGSysController {
	
	/**
	 * 
	 */
	@GetMapping("/indexView")
	public String showIndex() {
		return "index";
	}
	
	@GetMapping("/botView")
	public String showTellezBot(Model model) {
		model.addAttribute("respuesta", "¡Buenas! ¿Qué tal? Pregúntame lo que quieras. Te resolveré cualquier duda...de front lo dudo...");
		return"tellezBot";
	}
	
	@GetMapping("/*")
	public String showError() {
		return "error";
	}
}
