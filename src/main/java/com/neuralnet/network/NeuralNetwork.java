package com.neuralnet.network;

import com.neuralnet.Functions.ActivateFunction;
import com.neuralnet.Functions.Sigmoid;

import java.util.LinkedList;
import java.util.List;

public class NeuralNetwork {
    private static final ActivateFunction DEFAULT_ACTIVATE_FUNCTION = new Sigmoid();
    private final List<NeuronLayer> layers = new LinkedList<>();
    private final List<Connection> inputs;

    public NeuralNetwork(List<Connection> inputs) {
        this.inputs = inputs;
    }

    public void addLayer(int numberOfNeurons) {
        if (layers.isEmpty()) addFirstLayer(numberOfNeurons);
        else addAnotherLayer(numberOfNeurons);
    }

    public void think() {
        for (NeuronLayer layer : layers) {
            layer.getNeurons().forEach(Neuron::process);
        }
    }

    public List<Connection> getOutput() {
        return getLastLayer().getOutputs();
    }

    private void addFirstLayer(int numberOfNeurons) {
        layers.add(new NeuronLayer(inputs, numberOfNeurons, DEFAULT_ACTIVATE_FUNCTION));
    }

    private void addAnotherLayer(int numberOfNeurons) {
        NeuronLayer lastLayer = getLastLayer();
        NeuronLayer newLayer = new NeuronLayer(lastLayer.getOutputs(), numberOfNeurons, DEFAULT_ACTIVATE_FUNCTION);
        layers.add(newLayer);
    }

    private NeuronLayer getLastLayer() {
        return layers.get(layers.size() - 1);
    }
}

