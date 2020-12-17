package com.everisProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everisProject.models.Question;

@Repository
public interface QuestionRepositoryI extends JpaRepository<Question, Long> {
	
	/**
	 * Obtiene la pregunta buscada por content(contenido)
	 * @param content
	 * @return Question
	 */
	public Question findByContent(final String content);
	
	/**
	 * Obtiene la pregunta buscada por idQuestion(Identificador de la pregunta)
	 * @param idQuestion
	 * @return Question
	 */
	public Question findByIdQuestion(final long idQuestion);

}
