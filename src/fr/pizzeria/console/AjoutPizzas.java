package fr.pizzeria.console;

import java.util.Scanner;

public class AjoutPizzas extends OptionMenu {
	Scanner scanner = new Scanner(System.in);
	
	private IPizzaDao dao;

	public AjoutPizzas(IPizzaDao dao) {
		this.dao = dao;
	}

	public void execute() {
		System.out.println("Ajout d'une nouvelle pizza");
		System.out.println("Veuillez saisir le code:");
		String code = scanner.next();

		System.out.println("Veuillez saisir le libellé (sans espace):");
		String libelle = scanner.next();

		System.out.println("Veuillez asaisir le prix:");
		String prixStr = scanner.next();
		
		double prix = Double.parseDouble(prixStr);
		
		Pizza p = new Pizza(code, libelle, prix);
		dao.saveNewPizza(p);
	}

}
