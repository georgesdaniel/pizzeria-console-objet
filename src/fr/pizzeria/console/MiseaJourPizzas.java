package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.exception.StockageException;
import fr.pizzeria.exception.UpdatePizzaException;

public class MiseaJourPizzas extends OptionMenu {
	Scanner scanner = new Scanner(System.in);
	private IPizzaDao dao;

	public MiseaJourPizzas(IPizzaDao dao) {
		this.dao = dao;
	}

	public void execute() throws StockageException {
		System.out.println("Veuillez choisir la pizza à modifier.");
		String codePizza = scanner.next();

		codePizza = codePizza.toUpperCase();

		boolean resultat = dao.exist(codePizza);

		if (resultat == false) {
			throw new UpdatePizzaException("Cette pizza n'existe pas dans notre restaurant");
		}

		System.out.println("Veuillez saisir le code:");
		String code = scanner.next();

		System.out.println("Veuillez saisir le nom (sans espace):");
		String nom = scanner.next();

		System.out.println("Veuillez saisir le prix:");
		String prixStr = scanner.next();

		Double prix = Double.parseDouble(prixStr);

		Pizza q = new Pizza(code, nom, prix);
		dao.updatePizza(codePizza, q);
	}
}
