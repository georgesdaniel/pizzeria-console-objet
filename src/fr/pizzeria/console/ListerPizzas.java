package fr.pizzeria.console;

public class ListerPizzas extends OptionMenu {
	
	private IPizzaDao dao;

	//Le Constructeur
	public ListerPizzas (IPizzaDao dao) {
		this.dao = dao;
	}

	public void execute() {

		System.out.println("Liste des pizzas");
		for (int i = 0; i < dao.findAllPizzas().length ; i++) {
			if (dao.findAllPizzas()[i] != null) {
				System.out.println(
						dao.findAllPizzas()[i].getCode() + " > " + dao.findAllPizzas()[i].getLibelle() + " - Prix: " + dao.findAllPizzas()[i].getPrix());
			}
		}
		System.out.println("--------------------------------------------------");

	}

}
