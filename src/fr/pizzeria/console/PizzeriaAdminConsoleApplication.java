package fr.pizzeria.console;


import java.util.Scanner;

import fr.pizzeria.exception.StockageException;

public class PizzeriaAdminConsoleApplication {

	public static void main(String[] args) {

		// Initialisation d'un tableau de 100 pizzas
		DaoMemoire dao = new DaoMemoire();
		
		// Initialisation du scanner qui va permettre de poser des questions à
		// l'utilisateur
		Scanner scanner = new Scanner(System.in);
		int choix = 0;
		do {
			afficherMenu();
			choix = scanner.nextInt();

			switch (choix) {
			case 1:
				 ListerPizzas InstanceListePizza = new ListerPizzas (dao);
				 InstanceListePizza.execute();
				break;
			
			case 2:
							
				AjoutPizzas InstanceAjoutPizza = new AjoutPizzas (dao);
				InstanceAjoutPizza.execute();
				break;
				
			case 3:
				MiseaJourPizzas InstanceMiseajourPizza = new MiseaJourPizzas (dao);
				try {
					InstanceMiseajourPizza.execute();
				} catch (StockageException e) {
					System.out.println(e.getMessage());
				}
				break;
			
			case 4:
				SuppressionPizzas InstanceSuppressionPizza = new SuppressionPizzas (dao);
				InstanceSuppressionPizza.execute();
				
				break;
			case 99:
				System.out.println("Au revoir !!!!.");
				break;
			default:
				System.out.println("Choix inexistant.");
				break;
			}

		} while (choix != 99);

		scanner.close();
	}

	private static void afficherMenu() {
		System.out.println("***** Pizzeria Administration *****");
		System.out.println("1. Lister les pizzas");
		System.out.println("2. Ajouter une nouvelle pizza ");
		System.out.println("3. Mettre à jour une pizza");
		System.out.println("4. Supprimer une pizza");
		System.out.println("99. Sortir");
		System.out.println("Veuillez sélectionner une option de menu:");
	}
}
