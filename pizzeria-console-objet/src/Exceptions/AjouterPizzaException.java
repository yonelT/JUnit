package Exceptions;

public class AjouterPizzaException extends StockageException {

	public AjouterPizzaException() {
	}

	/**
	 * Constructor Exception possible lors de l'ajout d'une pizza
	 * 
	 * @param message
	 */
	public AjouterPizzaException(String message) {
		super(message);
	}

}
