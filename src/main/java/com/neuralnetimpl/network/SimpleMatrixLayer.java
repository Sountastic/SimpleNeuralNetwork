package com.neuralnetimpl.network;

import com.neuralnetimpl.function.ActivateFunction;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

import java.util.Arrays;

public class SimpleMatrixLayer implements Layer {
    private RealMatrix weights;
    private ActivateFunction activateFunction;


    public SimpleMatrixLayer(int inputs, int nodes, ActivateFunction activateFunction) {
        this(initWithRandomWeights(nodes, inputs), activateFunction);
    }

    public SimpleMatrixLayer(RealMatrix weights, ActivateFunction activateFunction) {
        this.weights = weights;
        this.activateFunction = activateFunction;
    }

    private static RealMatrix initWithRandomWeights(int rows, int columns) {
        double[][] matrix = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[j][i] = Math.random();
            }
        }
        return MatrixUtils.createRealMatrix(matrix);
    }


    @Override
    public double[] compute(double[] input) {
        RealMatrix inputMatrix = MatrixUtils.createColumnRealMatrix(input);
        double[] weighedInputsArray = weights.multiply(inputMatrix).getColumn(0);
        return Arrays.stream(weighedInputsArray)
                .map(v -> activateFunction.apply(v))
                .toArray();
    }

    public RealMatrix getWeights() {
        return weights;
    }

    public void setWeights(RealMatrix weights) {
        this.weights = weights;
    }

    public ActivateFunction getActivateFunction() {
        return activateFunction;
    }

    public void setActivateFunction(ActivateFunction activateFunction) {
        this.activateFunction = activateFunction;
    }

    @Override
    public String toString() {
        return "SimpleMatrixLayer{" +
                "weights=" + weights +
                ", activateFunction=" + activateFunction +
                '}';
    }
}
