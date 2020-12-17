package com.everisProject;

import java.util.HashMap;
import java.util.Map;

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
		
		Map<String,String> alumnosDual1 = new HashMap<String,String>();
		alumnosDual1.put("Ana Maria Blanco Escudero", "(Sotero Hernandez) Una chica sumamente participativa. ¡La arquitecta del equipo!");
		alumnosDual1.put("Angel Garcia Aranda", "(Vedruna) Ángel haz acto de presencia. ¡Analista técnico! ");
		alumnosDual1.put("Abraham Barrera Herrera", "(Alixar) Ágil como una pantera, silencioso pero atento. Abraham será el analista funcional del equipo. ");
		alumnosDual1.put("Francisco Garcia Macias", "(Salesianos San Ignacio) No hace ruido pero éste gaditano sabe bien dónde tocar. ");
		alumnosDual1.put("Irene Rengel Ruiz", "(Salesianos San Ignacio) Carácter, constancia y trabajo. Irene, ¿le metemos caña al equipo?");
		alumnosDual1.put("Salvador Muñoz Cordero", "(Alixar) Siempre atento en las sombras. Demosle un poquito de luz a Salva, serás el analista funcional.");
		alumnosDual1.put("David Gomez Rodriguez", "(Jacaranda) Si fuese fútbol David, serías el cerebro. ");
		alumnosDual1.put("Jose Antonio Gonzalez Arboledas", "(Vedruna) Jose, como trabajo no te falta... ¡serás el analista técnico del equipo!");
		alumnosDual1.put("Luis Rosell Gonzalez", "(Salesianos San Ignacio) En serio Luis, aún no me lo creo... Bueno, como en el fondo te quiero... te ha tocado ser analista funcional.");
		alumnosDual1.put("Miguel Alcantara Montero", "(Salesianas) Un diamante en bruto es usted señor Miguel.");
		alumnosDual1.put("Jose Carlos Fernandez Balbuena", "(Hermanos Machado) Jose, que sí se te escucha Venga, serás el analista técnico. Por hablar.");
		alumnosDual1.put("Noelia Galindo Garcia", "(Sotero Hernandez) if(Noelia == \"Profesionalidad\"){ System.out.println(\"TOP\") } ");
		alumnosDual1.put("Alberto Ruiz Gomez", "(Salesianos San Ignacio) Otro diamante oculto. Pura eficacia. ¡Te libras por los pelos! ");
		alumnosDual1.put("Eduardo Vega de los Santos", "(Sotero Hernandez) Actitud, actitud, actitud, actitud. Vaya máquina. Serás analista funcional.");
		alumnosDual1.put("Juan Francisco Corrales Marquez", "(Vedruna) Hola Juanfran, ¡vaya como has mejorado! peeeero, has empezado a participar tarde Serás el analista técnico.");
		alumnosDual1.put("Raul Morales Ruiz", "(Jacaranda) ¡Con soldados como tú iba yo a la guerra! ¡Vamos Raúl!");
		alumnosDual1.put("Alicia Garcia Luque", "(Sotero Hernandez) Y he aquí una chica que impulsiva, tanto que no me ha fallado a ningún ejercicio. Relájate, no tienes roles en el grupo Alicia.");
		alumnosDual1.put("Joaquin Borrego Fernandez", "(Vedruna) Matemático, filósofo y COMPAÑERO.");
		alumnosDual1.put("Manuel Corona Lasarte", "(Salesianas) El único dispuesto a todo realmente, incansable. Serás el analista funcional.");
		alumnosDual1.put("David Pineda Hidalgo", "(Hermanos Machado) El dado te ha seleccionado David, serás el analista técnico.");
		alumnosDual1.put("Alvaro Rueda Sanchez", "(Jacaranda) ¿Te falta algo por estudiar al mismo tiempo señor? ¡Vaya crack!");
		alumnosDual1.put("Cristian Manzano Pineda", "(Alixar) Menos mal que no te me has ido ¡ Dale caña que puedes con todo CRACK! Serás analista funcional.");
		alumnosDual1.put("Álvaro Díaz Gonzalez", "(Vedruna) Eres como esos buenos futbolistas que saben que con andar ya tienen el notable. ¡Dale a por más Álvaro!");
		alumnosDual1.put("Alejandro Lopez Oncala", "(Hermanos Machado) Callado, trabajador, te llamas como yo... tienes todos los alicientes para ser analista técnico amigo. ");
		alumnosDual1.put("Isabel Maria Orozco Puerto", "(Sotero Hernandez) Gaditana y para front-end... un cerebro ultra creativo que perdemos en back-end. Puro ingenio.");
		alumnosDual1.put("Javier Carande Cabeza", "(Alixar) De esos jugadores que uno siempre quiere en su equipo. ");
		alumnosDual1.put("Samuel Robles Rivas", "(Salesianas) ¡Hoy no es viernes señor! Hoy también se puede hablar Serás analista funcional.");
		alumnosDual1.put("Fernando Vazquez Boza", "(Hermanos Machado) Un alumno diez al que voy a hacer participar más de lo usual");
		alumnosDual1.put("Pablo Gomez Melendez", "(Hermanos Machado) Puro nervio y ganas. Pues venga, serás analista funcional.");
		alumnosDual1.put("Francisco Jose Caro Carazo", "(Salesianas) Otro de los que saben que andando también se llega... ¡apunta más alto que llegas! Eres analista técnico.");
		alumnosDual1.put("Yi Xiang Chen", "(Jacaranda) Máxima eficacia. Si hay un detalle pequeño, Yi está atento a ello.");
		
		for (Map.Entry<String,String> alumno : alumnosDual1.entrySet()) {
			
		Question quest11 = new Question();
		quest11.setContent(alumno.getKey());
		Answer answ11 = new Answer();
		answ11.setContent(alumno.getValue());
		answ11.setQuestion(quest11);
		quest11.setAnswer(answ11);
		tellezBotService.addQuestingAndAnswer(answ11, quest11);
		
		}
	}

}

