package com.neuralnet;

import com.neuralnet.dataset.TrainingObject;
import com.neuralnet.dataset.TrainingSet;
import com.neuralnet.network.Connection;
import com.neuralnet.network.NeuralNetwork;
import com.neuralnet.network.WeightConnection;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AppRunner {
    public static void main(String[] args) {
        List<Connection> in = new LinkedList<>();
        NeuralNetwork network = new NeuralNetwork(in);
        List<Double> features = null;
        network.addLayer(1);
        in.add(new WeightConnection());
        in.add(new WeightConnection());
        in.add(new WeightConnection());
        in.add(new WeightConnection());
        in.add(new WeightConnection());
        in.add(new WeightConnection());
        System.out.println(in.size());

        network.think();
        List<Connection> out = network.getOutput();
        System.out.println(out);


        Set<TrainingObject> mammalsSet = new TrainingSet().mammals();
        for (TrainingObject object : mammalsSet) {
            features = object.getFeatures();
            for (int n = 0; n < features.size(); n++)
                in.get(n).setInput(features.get(n));
            network.think();
        }

        System.out.println("FeaturesSize" + features.size());

        in.get(0).setInput(features.get(0));

    }
}
