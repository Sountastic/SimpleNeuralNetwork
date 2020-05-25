package com.neuralnetimpl.network;


import com.neuralnetimpl.function.ActivateFunction;
import org.apache.commons.math3.linear.MatrixUtils;

public class SimpleMatrixNeuralNetwork implements NeuralNetwork {
    private SimpleMatrixLayer layer;
    private double learningRate;

    public SimpleMatrixNeuralNetwork(int numOfInputs, int numOfNodes, ActivateFunction activateFunction, double learningRate) {
        this.layer = new SimpleMatrixLayer(numOfInputs, numOfNodes, activateFunction);
        this.learningRate = learningRate;
    }

    @Override
    public double[] propagate(double[] input) {
        return layer.compute(input);
    }

    @Override
    public void learn(double[] input, double[] expectedOutput) throws Exception {
        double[] output = layer.compute(input);
        if (output.length != expectedOutput.length) {
            throw new Exception("Wrong length of output!");
        } else {
            double[][] updatedWeights = new double[output.length][input.length];
            for (int i = 0; i < output.length; i++) {
                double error = expectedOutput[i] - output[i];
                for (int j = 0; j < input.length; j++) {
                    updatedWeights[i][j] = input[j] * error * learningRate * layer.getWeights().getEntry(i, j);
                }
            }
            layer.setWeights(MatrixUtils.createRealMatrix(updatedWeights));
        }
    }
}
