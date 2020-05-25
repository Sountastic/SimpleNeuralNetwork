package com.neuralnetimpl.dataset;

public class TestSetFactory {
    public TestSet createAnimalTestSet() {
        TestSet animalSet = new TestSet(6, 2);
        animalSet.addTestCase(new double[]{0.0, 0.0, 1.0, 1.0, 1.0, 0.0}, new double[]{1.0, 0.0});
        return animalSet;
    }
}
