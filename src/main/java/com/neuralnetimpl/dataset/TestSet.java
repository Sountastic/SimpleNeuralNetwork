package com.neuralnetimpl.dataset;

import com.neuralnetimpl.network.NeuralNetwork;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class TestSet {
    private final int inputLength;
    private final int outputLength;
    private List<TestCase> testCases = new ArrayList<>();

    public TestSet(int inputLength, int outputLength) {
        this.inputLength = inputLength;
        this.outputLength = outputLength;
    }

    public void run(NeuralNetwork neuralNetwork) {
        testCases.forEach(testCase -> {
            try {
                neuralNetwork.learn(testCase.input, testCase.output);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public void addTestCase(double[] input, double[] expectedOutput) {
        if (input.length == inputLength && expectedOutput.length == outputLength) {
            testCases.add(new TestCase(input, expectedOutput));
        } else {
            throw new InvalidParameterException("Wrong length of input data");
        }
    }
}
