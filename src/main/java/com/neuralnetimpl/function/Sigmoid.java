package com.neuralnetimpl.function;

public class Sigmoid implements ActivateFunction {

    @Override
    public Double apply(Double x) {
        return 1 / (1 + Math.exp(-x));
    }
}
