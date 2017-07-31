package fr.pizzeria.console;

import java.util.Scanner;

public class SuppressionPizzas extends OptionMenu {
	Scanner scanner = new Scanner(System.in);
	private Pizza[] pizzas;

	public SuppressionPizzas (Pizza[] pizzas) {
		this.pizzas = pizzas;
	}

	public void execute() {
		System.out.println("Veuillez choisir la pizza à supprimer.");
		String codePizza = scanner.next();
		int indexPizza = -1;
		for (int i = 0; i < pizzas.length; i++) {
			if (pizzas[i].getCode().equals(codePizza)) {
				indexPizza = i;
				break;
			}
		}

		if (indexPizza != -1) {
			pizzas[indexPizza] = null;
		} else {
			System.out.println("Code inexistant :" + codePizza);
		}

	}
}
