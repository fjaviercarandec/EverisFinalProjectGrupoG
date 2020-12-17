package com.everisProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everisProject.models.Answer;
import com.everisProject.models.Question;

@Repository
public interface AnswerRepositoryI extends JpaRepository<Answer, Long> {
	
	/**
	 * Obtiene la respuesta buscada por content(contenido)
	 * @param content
	 * @return Answer
	 */
	public Answer findByContent(final String content);
	
	/**
	 * Obtiene la respuesta buscada por idQuestion(Identificador de la pregunta)
	 * @param question
	 * @return Answer
	 */
	public Answer findByQuestion(final Question question);
	
}
