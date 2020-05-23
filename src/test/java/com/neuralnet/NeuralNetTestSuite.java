package com.neuralnet;

import com.neuralnet.dataset.TrainingObject;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class NeuralNetTestSuite {

    @Test
    public void testTrainingObjectGetFeatures() {

        //Given
        TrainingObject object = new TrainingObject("mammal", true, true, false,
                false, true, true);
        //When
        List<Double> result = object.getFeatures();
        int resultSize = result.size();
        //Then
        Assert.assertEquals(6, resultSize);
    }
}
