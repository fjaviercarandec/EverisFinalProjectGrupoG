package com.everisProject.models;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Modelado entidad Answer
 * @author grupoG
 *
 */
@Entity
@Table(name="T_ANSWER")
public class Answer implements Serializable {

	/** SERIAL ID */
	private static final long serialVersionUID = 1L;
	
	/** Identificador respuesta (PK) */
	private long idAnswer;
	
	/** Contenido de la pregunta */
	private String content;
	
	/** Pregunta asociada a la respuesta */
	private Question question;
	
	/**
	 * 
	 * @return long
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getIdAnswer() {
		return idAnswer;
	}
	/**
	 * 
	 * @param idAnswer
	 */
	public void setIdAnswer(long idAnswer) {
		this.idAnswer = idAnswer;
	}
	
	/**
	 * 
	 * @return String
	 */
	@Column(name = "content_answer", nullable = false)
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
	 * @return Question
	 */
	@OneToOne(mappedBy = "answer", cascade = CascadeType.ALL)
	public Question getQuestion() {
		return question;
	}
	/**
	 * 
	 * @param question
	 */
	public void setQuestion(Question question) {
		this.question = question;
	}
}
