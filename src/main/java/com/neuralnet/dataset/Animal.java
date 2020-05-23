package com.neuralnet.dataset;

import com.neuralnet.network.Connection;

import java.util.List;

public interface Animal {
    public String getSpecies();

    public List<Double> getFeatures();

}
