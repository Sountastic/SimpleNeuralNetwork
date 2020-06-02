package com.neuralnetimpl.dataset;

import com.neuralnetimpl.animals.Animal;
import com.neuralnetimpl.animals.AnimalObj;

public class TestSetFactory {
    public TestSet createAnimalTestSet() {
        AnimalObj animalObj = new AnimalObj(true, true, false, false, true, true);
        AnimalObj animalObj2 = new AnimalObj(false, false, false, false, true, false);
        TestSet animalSet = new TestSet(6, 2);
//        animalSet.addTestCase(new double[]{0.0, 0.0, 1.0, 1.0, 1.0, 0.0}, new double[]{1.0, 0.0});
        animalSet.addTestCase(animalObj.getFeatures(), animalObj.getSpecies());
        animalSet.addTestCase(animalObj2.getFeatures(), animalObj2.getSpecies());
        return animalSet;
    }
}
