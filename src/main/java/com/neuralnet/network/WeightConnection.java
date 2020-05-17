package com.neuralnet.network;

public class WeightConnection implements Connection{
    private double weight;
    private double value;

    public WeightConnection() {
        weight = Math.random();
    }

    public WeightConnection(double weight) {
        this.weight = weight;
    }

    @Override
    public void setInput(Double input) {
        this.value = input;
    }

    @Override
    public Double getOutput() {
        System.out.println(toString());
        return value * weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "WeightConnection{" +
                "weight=" + weight +
                ", value=" + value +
                '}';
    }
}
