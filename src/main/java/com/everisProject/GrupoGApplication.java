package com.everisProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.everisProject.models.Answer;
import com.everisProject.models.Question;
import com.everisProject.services.TellezBotServiceI;

@SpringBootApplication
public class GrupoGApplication implements CommandLineRunner {
	
	@Autowired
	private TellezBotServiceI tellezBotService;

	public static void main(String[] args) {
		SpringApplication.run(GrupoGApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//Instanciación de clase Question
		Question quest1 = new Question();
		
		//pregunta 1
		quest1.setContent("¿Quien eres?");
		Answer answ1 = new Answer();
		answ1.setContent("Soy TellezBot, la verdadera identidad de Tellez, una súper máquina creada para la codificación, "
				+ "resolución de errores, formación y lo más importante, destruir a mi verdadero enemigo, "
				+ "Luis el archienemigo del back-end.\n");
		answ1.setQuestion(quest1);
		quest1.setAnswer(answ1);
		tellezBotService.addQuestingAndAnswer(answ1, quest1);
		
		//pregunta 2
		Question quest2 = new Question();
		quest2.setContent("hola");
		Answer answ2 = new Answer();
		answ2.setContent("Hola, ¿Qué tal?");
		answ2.setQuestion(quest2);
		quest2.setAnswer(answ2);
		tellezBotService.addQuestingAndAnswer(answ2, quest2);
		
		//pregunta 3
		Question quest3 = new Question();
		quest3.setContent("¿como te llamas?");
		Answer answ3 = new Answer();
		answ3.setContent("Mi nombre es Bot, TellezBot");
		answ3.setQuestion(quest3);
		quest3.setAnswer(answ3);
		tellezBotService.addQuestingAndAnswer(answ3, quest3);
		
		//pregunta 4
		Question quest4 = new Question();
		quest4.setContent("¿te gusta el futbol?");
		Answer answ4 = new Answer();
		answ4.setContent("Por supuesto");
		answ4.setQuestion(quest4);
		quest4.setAnswer(answ4);
		tellezBotService.addQuestingAndAnswer(answ4, quest4);
		
		//pregunta 5
		Question quest5 = new Question();
		quest5.setContent("¿de que equipo eres?");
		Answer answ5 = new Answer();
		answ5.setContent("Del Sevilla! ome pofavó!");
		answ5.setQuestion(quest5);
		quest5.setAnswer(answ5);
		tellezBotService.addQuestingAndAnswer(answ5, quest5);
		
		//pregunta 6
		Question quest6 = new Question();
		quest6.setContent("viva el betis!");
		Answer answ6 = new Answer();
		answ6.setContent("¬_¬ mira.... vamos a llevarnos bien ¿¡eh!?");
		answ6.setQuestion(quest6);
		quest6.setAnswer(answ6);
		tellezBotService.addQuestingAndAnswer(answ6, quest6);
		
		//pregunta 7
		Question quest7 = new Question();
		quest7.setContent("¿eres chico o chica?");
		Answer answ7 = new Answer();
		answ7.setContent("Soy undefined");
		answ7.setQuestion(quest7);
		quest7.setAnswer(answ7);
		tellezBotService.addQuestingAndAnswer(answ7, quest7);
		
		//pregunta 8
		Question quest8 = new Question();
		quest8.setContent("¿eres una maquina?");
		Answer answ8 = new Answer();
		answ8.setContent("Lo que soy es UN MÁQUINA ");
		answ8.setQuestion(quest8);
		quest8.setAnswer(answ8);
		tellezBotService.addQuestingAndAnswer(answ8, quest8);
		
		//pregunta 9
		Question quest9 = new Question();
		quest9.setContent("¿estas programado para matar?");
		Answer answ9 = new Answer();
		answ9.setContent("Solo a los de front, MUUUAAHAHAHAHAHA");
		answ9.setQuestion(quest9);
		quest9.setAnswer(answ9);
		tellezBotService.addQuestingAndAnswer(answ9, quest9);
		
		//pregunta 10
		Question quest10 = new Question();
		quest10.setContent("adios");
		Answer answ10 = new Answer();
		answ10.setContent("Hasta luego Lucar");
		answ10.setQuestion(quest10);
		quest10.setAnswer(answ10);
		tellezBotService.addQuestingAndAnswer(answ10, quest10);
	}

}

