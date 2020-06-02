package com.neuralnetimpl.animals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalObj implements Animal {
    private final double[] features = new double[6];
    private final boolean isViviparous;
    private final boolean hasFurOrHair;
    private final boolean hasWings;
    private final boolean hasBeak;
    private final boolean canSwim;
    private final boolean isWarmBlooded;
    private final double[] fish = {0.0, 0.0};
    private final double[] mammal = {0.0, 1.0};
    private final double[] bird = {1.0, 0.0};


    public AnimalObj(boolean isViviparous, boolean hasFurOrHair,
                     boolean hasWings, boolean hasBeak, boolean canSwim, boolean isWarmBlooded) {

        this.isViviparous = isViviparous;
        this.hasFurOrHair = hasFurOrHair;
        this.hasWings = hasWings;
        this.hasBeak = hasBeak;
        this.canSwim = canSwim;
        this.isWarmBlooded = isWarmBlooded;
    }


    @Override
    public double[] getSpecies() {
        if (Arrays.equals(features, new double[]{1.0, 1.0, 0.0, 0.0, 1.0, 1.0})) return mammal;
        if (Arrays.equals(features, new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0})) return fish;
        if (Arrays.equals(features, new double[]{0.0, 0.0, 1.0, 1.0, 0.0, 1.0})) return bird;
        return new double[0];
    }

    @Override
    public double[] getFeatures() {
        features[0] = isViviparous ? 1.0 : 0.0;
        features[1] = hasFurOrHair ? 1.0 : 0.0;
        features[2] = hasWings ? 1.0 : 0.0;
        features[3] = hasBeak ? 1.0 : 0.0;
        features[4] = canSwim ? 1.0 : 0.0;
        features[5] = isWarmBlooded ? 1.0 : 0.0;
        return features;
    }
}
