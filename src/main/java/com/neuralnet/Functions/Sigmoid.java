package com.neuralnet.Functions;

public class Sigmoid implements ActivateFunction {
    @Override
    public Double apply(Double x) {
        return 1 / (1 + Math.exp(-x));
    }
}

