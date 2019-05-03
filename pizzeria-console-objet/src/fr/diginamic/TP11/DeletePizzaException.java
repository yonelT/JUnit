package fr.diginamic.TP11;

import Exceptions.StockageException;

/**
 * Exception possible lors de la suppression d'une pizza
 * 
 * @author Diginam
 *
 */
public class DeletePizzaException extends StockageException {

	public DeletePizzaException(String message) {
		super(message);
	}

}
