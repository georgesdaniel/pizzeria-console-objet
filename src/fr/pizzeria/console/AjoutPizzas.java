package fr.pizzeria.console;

import java.util.Scanner;

public class AjoutPizzas extends OptionMenu {
	Scanner scanner = new Scanner(System.in);
	private Pizza[] pizzas;

	public AjoutPizzas(Pizza[] pizzas) {
		this.pizzas = pizzas;
	}

	public void execute() {
		System.out.println("Ajout d'une nouvelle pizza");
		System.out.println("Veuillez saisir le code:");
		String code = scanner.next();

		System.out.println("Veuillez saisir le libellé (sans espace):");
		String nom = scanner.next();

		System.out.println("Veuillez saisir le prix:");
		String prixStr = scanner.next();
		
		double prix = Double.parseDouble(prixStr);

		for (int i = 0; i < pizzas.length; i++) {
			if (pizzas[i] == null) {
				pizzas[i] = new Pizza(code, nom, prix);
				break;
			}
		}
	}

}
