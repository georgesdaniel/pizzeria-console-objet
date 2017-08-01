package fr.pizzeria.console;

import java.util.Scanner;

public class MiseaJourPizzas extends OptionMenu {
	Scanner scanner = new Scanner(System.in);
	private IPizzaDao dao;

	public MiseaJourPizzas(IPizzaDao dao) {
		this.dao = dao;
	}

	public void execute() {
		System.out.println("Veuillez choisir la pizza à modifier.");
		String codePizza = scanner.next();
		int indexPizza = -1;
		for (int i = 0; i < pizzas.length; i++) {
			if (pizzas[i].getCode().equals(codePizza)) {
				indexPizza = i;
				break;
			}
		}

		if (indexPizza != -1) {
			System.out.println("Veuillez saisir le code:");
			String code = scanner.next();

			System.out.println("Veuillez saisir le nom (sans espace):");
			String nom = scanner.next();

			System.out.println("Veuillez saisir le prix:");
			String prixStr = scanner.next();

			Double prix = Double.parseDouble(prixStr);

			pizzas[indexPizza] = new Pizza(code, nom, prix);
		} else {
			System.out.println("Code inexistant :" + codePizza);
		}
	}
}