package fr.diginamic.TP11;

import java.util.Scanner;

import Exceptions.StockageException;

public abstract class MenuService {

	/**
	 * Pour gérer les cas d'utilisations
	 * 
	 * @param scanner
	 * @param dao
	 * @throws StockageException
	 */
	public abstract void executeUC(Scanner scanner, IPizzaDao dao) throws StockageException;

}
