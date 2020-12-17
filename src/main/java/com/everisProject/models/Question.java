package com.everisProject.models;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Modelado entidad Question
 * @author grupoG
 *
 */
@Entity
@Table(name="T_QUESTION")
public class Question implements Serializable {

	/** SERIAL ID */
	private static final long serialVersionUID = 1L;
	
	/** Identificador pregunta (PK) */
	private long idQuestion;
	
	/** Contenido de la pregunta */
	private String content;
	
	/** Respuesta asociada a la pregunta */
	private Answer answer;
	
	/**
	 * 
	 * @return long
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getIdQuestion() {
		return idQuestion;
	}
	/**
	 * 
	 * @param idQuestion
	 */
	public void setIdQuestion(long idQuestion) {
		this.idQuestion = idQuestion;
	}
	
	/**
	 * 
	 * @return String
	 */
	@Column(name = "content_question", nullable = false)
	public String getContent() {
		return content;
	}
	/**
	 * 
	 * @param content
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	/**
	 * 
	 * @return Answer
	 */
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "answer_id", referencedColumnName = "idAnswer")
	public Answer getAnswer() {
		return answer;
	}
	/**
	 * 
	 * @param answer
	 */
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	
}
