package fr.diginamic.TP11;

import java.util.Scanner;

import Exceptions.StockageException;

public abstract class MenuService {

	public abstract void executeUC(Scanner scanner, IPizzaDao dao) throws StockageException;

}
