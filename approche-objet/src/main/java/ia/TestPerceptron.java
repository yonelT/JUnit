package ia;

import org.neuroph.core.data.DataSet;
import org.neuroph.nnet.MultiLayerPerceptron;

public class TestPerceptron {

	public static void main(String[] args) {
		// Création du perceptron avec 2 entrées, 2 neuronnes cachés et 1 sortie
		MultiLayerPerceptron perceptron = new MultiLayerPerceptron(2, 2, 1);

		// Etape 1: l'apprentissage avec un data set de 2 entrées et une sortie
		DataSet trainingSet = new DataSet(2, 1);
		trainingSet.addRow(new double[] { 1, 0 }, new double[] { 1 });
		trainingSet.addRow(new double[] { 0, 1 }, new double[] { 1 });
		trainingSet.addRow(new double[] { 0, 0 }, new double[] { 0 });
		trainingSet.addRow(new double[] { 1, 1 }, new double[] { 1 });

		for (int i = 0; i < 50; i++) {
			perceptron.learn(trainingSet);
		}

		// Etape 2: Realisation des tests
		perceptron.setInput(1, 0);
		perceptron.calculate();
		System.out.println(perceptron.getOutput()[0]);

		perceptron.setInput(0, 1);
		perceptron.calculate();
		System.out.println(perceptron.getOutput()[0]);

		perceptron.setInput(1, 1);
		perceptron.calculate();
		System.out.println(perceptron.getOutput()[0]);

		perceptron.setInput(0, 0);
		perceptron.calculate();
		System.out.println(perceptron.getOutput()[0]);

	}

}
