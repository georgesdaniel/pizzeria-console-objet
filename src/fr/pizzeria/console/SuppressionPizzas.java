package fr.pizzeria.console;

import java.util.Scanner;

public class SuppressionPizzas extends OptionMenu {
	Scanner scanner = new Scanner(System.in);
	private IPizzaDao dao;

	public SuppressionPizzas (IPizzaDao dao) {
		this.dao = dao;
	}

	public void execute() {
		System.out.println("Veuillez choisir la pizza à supprimer.");
		String codePizza = scanner.next();
		

	}
}
