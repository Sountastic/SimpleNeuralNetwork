package com.neuralnetimpl;

import com.neuralnetimpl.dataset.TestSetFactory;
import com.neuralnetimpl.function.Sigmoid;
import com.neuralnetimpl.network.NeuralNetwork;
import com.neuralnetimpl.network.SimpleMatrixNeuralNetwork;

public class AppMain {
    TestSetFactory testSetFactory = new TestSetFactory();
    NeuralNetwork neuralNetwork = new SimpleMatrixNeuralNetwork(6,2,new Sigmoid(),0.05);

}
