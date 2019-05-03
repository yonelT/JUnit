package Exceptions;

public class ModifierPizzaException extends StockageException {

	public ModifierPizzaException() {
	}

	/**
	 * Exception possible lors de la création d'une pizza
	 * 
	 * @param message
	 */
	public ModifierPizzaException(String message) {
		super(message);
	}

}
