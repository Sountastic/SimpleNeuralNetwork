package com.neuralnet.dataset;

import com.neuralnet.network.Connection;

import java.util.ArrayList;
import java.util.List;

public class TrainingObject implements Animal {

    private final String species;
    private List<Double> features = new ArrayList<>();
    private final boolean isViviparous;
    private final boolean hasFurOrHair;
    private final boolean hasWings;
    private final boolean hasBeak;
    private final boolean canSwim;
    private final boolean isWarmBlooded;

    public TrainingObject(String name,
                          boolean isViviparous, boolean hasFurOrHair,
                          boolean hasWings, boolean hasBeak, boolean canSwim, boolean isWarmBlooded) {
        this.species = name;
        this.isViviparous = isViviparous;
        this.hasFurOrHair = hasFurOrHair;
        this.hasWings = hasWings;
        this.hasBeak = hasBeak;
        this.canSwim = canSwim;
        this.isWarmBlooded = isWarmBlooded;
    }

    @Override
    public String getSpecies() {
        return species;
    }

    @Override
    public List<Double> getFeatures() {
        features.add(isViviparous ? 1.0 : 0.0);
        features.add(hasFurOrHair ? 1.0 : 0.0);
        features.add(hasWings ? 1.0 : 0.0);
        features.add(hasBeak ? 1.0 : 0.0);
        features.add(canSwim ? 1.0 : 0.0);
        features.add(isWarmBlooded ? 1.0 : 0.0);
        return features;
    }
}
