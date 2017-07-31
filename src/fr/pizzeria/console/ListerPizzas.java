package fr.pizzeria.console;

public class ListerPizzas extends OptionMenu {
	
	private Pizza[] pizzas;

	//Le Constructeur
	public ListerPizzas (Pizza[] pizzas) {
		this.pizzas = pizzas;
	}

	public void execute() {

		System.out.println("Liste des pizzas");
		for (int i = 0; i < pizzas.length; i++) {
			if (pizzas[i] != null) {
				System.out.println(
						pizzas[i].getCode() + " > " + pizzas[i].getLibelle() + " - Prix: " + pizzas[i].getPrix());
			}
		}
		System.out.println("--------------------------------------------------");

	}

}
