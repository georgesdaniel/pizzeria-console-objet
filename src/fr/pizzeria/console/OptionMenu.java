package fr.pizzeria.console;

import fr.pizzeria.exception.StockageException;

public abstract class OptionMenu {
	
	public abstract void execute() throws StockageException;

}
