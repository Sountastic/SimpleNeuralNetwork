package com.neuralnet;

import com.neuralnet.network.Connection;
import com.neuralnet.network.NeuralNetwork;
import com.neuralnet.network.WeightConnection;

import java.util.LinkedList;
import java.util.List;

public class AppRunner {
    public static void main(String[] args) {
        List<Connection> in = new LinkedList<>();
        NeuralNetwork network = new NeuralNetwork(in);
        network.addLayer(1);
        in.add(new WeightConnection());
        in.add(new WeightConnection());
        in.add(new WeightConnection());
        System.out.println(in.size());

        in.get(0).setInput(1.0);
        in.get(1).setInput(0.0);
        in.get(2).setInput(0.0);

        network.think();
        List<Connection> out = network.getOutput();
        System.out.println(out);
    }
}
