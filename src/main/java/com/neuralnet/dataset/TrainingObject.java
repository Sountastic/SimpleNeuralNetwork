package com.neuralnet.dataset;

import com.neuralnet.network.Connection;

import java.util.List;

public class TrainingObject implements Animal {

    private final String name;
    private List<Double> features;
    private final boolean isViviparous;
    private final boolean isFourLegged;
    private final boolean hasWings;
    private final boolean hasBeak;
    private final boolean canSwim;

    public TrainingObject(String name,
                          boolean isViviparous, boolean isFourLegged,
                          boolean hasWings, boolean hasBeak, boolean canSwim) {
        this.name = name;
//        this.features = features;
        this.isViviparous = isViviparous;
        this.isFourLegged = isFourLegged;
        this.hasWings = hasWings;
        this.hasBeak = hasBeak;
        this.canSwim = canSwim;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Double> getFeatures() {
        features.add(isViviparous ? 1.0 : 0.0);
        features.add(isFourLegged ? 1.0 : 0.0);
        features.add(hasWings ? 1.0 : 0.0);
        features.add(hasBeak ? 1.0 : 0.0);
        features.add(canSwim ? 1.0 : 0.0);
        return features;
    }
}
