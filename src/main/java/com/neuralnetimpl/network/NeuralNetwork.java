package com.neuralnetimpl.network;

public interface NeuralNetwork {
    double[] propagate(double... inputs);
    void learn(double[] input, double[] expectedOutput) throws Exception;
}
