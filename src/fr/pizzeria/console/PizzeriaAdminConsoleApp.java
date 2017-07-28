package fr.pizzeria.console;

import java.util.Scanner;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n");
		System.out.println("***** Pizzeria Administration ***** ");

		System.out.println("1. Lister les pizzas ");
		System.out.println("2. Ajouter une nouvelle pizza  ");
		System.out.println("3. Mettre à jour une pizza ");
		System.out.println("4. Supprimer une pizza ");
		System.out.println("99. Sortir ");

		Scanner choixUser = new Scanner(System.in);

		System.out.print("Veuillez saisir un chiffre :");
		int choice = choixUser.nextInt();

		/*
		 * if (a==1) { System.out.println("Liste des pizzas "); }
		 * 
		 * if (a==2) { System.out.println("Ajout d'une nouvelle pizza "); } if (a==3) {
		 * System.out.println("Mise à jour d'une pizza "); } if (a==4) {
		 * System.out.println("Suppression d'une pizza "); } if (a==99) {
		 * System.out.println("Aurevoir "); }
		 */
		while (choice != 99) {

			switch (choice) {

			case 1: {
				System.out.println("Liste des pizzas");
				break;
			}

			case 2: {
				System.out.println("Ajout d'une nouvelle pizza ");
				break;
			}
			case 3: {
				System.out.println("Mise à jour d'une pizza ");
				break;
			}

			case 4: {
				System.out.println("Suppression d'une pizza ");
				break;
			}

			case 99: {
				System.out.println("Aurevoir ");
				break;
			}

			default:

			{
				System.out.println("vous n'avez selectionné‚ aucun choix ");
			}
				break;
			}
		}
			choixUser.close();
		
	}
}