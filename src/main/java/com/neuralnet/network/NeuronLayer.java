package com.neuralnet.network;

import com.neuralnet.Functions.ActivateFunction;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NeuronLayer {
    private List<Connection> inputs;
    private List<Neuron> neurons;
    private List<Connection> outputs;

    public NeuronLayer(List<Connection> inputs, int amountOfNeurons, ActivateFunction activateFunction) {
        this.inputs = inputs;
        this.neurons = IntStream.range(0, amountOfNeurons)
                .mapToObj(i -> new Neuron(activateFunction, inputs))
                .collect(Collectors.toList());
        this.outputs = neurons.stream()
                .map(Neuron::getOutput)
                .collect(Collectors.toList());
    }

    public List<Connection> getInputs() {
        return inputs;
    }

    public List<Neuron> getNeurons() {
        return neurons;
    }

    public List<Connection> getOutputs() {
        return outputs;
    }
}
