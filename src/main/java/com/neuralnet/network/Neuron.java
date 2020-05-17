package com.neuralnet.network;

import com.neuralnet.Functions.ActivateFunction;

import java.util.List;

public class Neuron {
    private final ActivateFunction activateFunction;
    private final List<Connection> inputs;
    private final Connection output = new WeightConnection();

    public Neuron(ActivateFunction activateFunction, List<Connection> inputs) {
        this.activateFunction = activateFunction;
        this.inputs = inputs;
    }

    public void process() {
        Double weightInput = inputs.stream().mapToDouble(Connection::getOutput).sum();
        output.setInput(activateFunction.apply(weightInput));
    }

    public List<Connection> getInputs() {
        return inputs;
    }

    public Connection getOutput() {
        return output;
    }
}
