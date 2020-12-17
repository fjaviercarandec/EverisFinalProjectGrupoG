package com.everisProject.services;

import com.everisProject.models.Answer;
import com.everisProject.models.Question;

public interface TellezBotServiceI {
	/**
	 * Busca la repuesta por la pregunta
	 * @param questing
	 * @return Answer
	 */
	public Answer findAnswer(final String question);
	
	/**
	 * Guarda la repuesta y la pregunta que no tiene
	 * almacenada en la base de datos
	 * @param answer
	 * @param questing
	 * @return Boolean
	 */
	public Boolean addQuestingAndAnswer(final Answer answer, final Question question);
}
