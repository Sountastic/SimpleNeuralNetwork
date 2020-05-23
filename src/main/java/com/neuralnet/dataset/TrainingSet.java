package com.neuralnet.dataset;

import java.util.HashSet;
import java.util.Set;

public class TrainingSet {


    public Set<TrainingObject> mammals() {
        Set<TrainingObject> mammalsSet = new HashSet<>();
        mammalsSet.add(new TrainingObject("mammal", true, true, false, false, true, true));
        mammalsSet.add(new TrainingObject("mammal", true, true, false, false, true, true));
        mammalsSet.add(new TrainingObject("mammal", true, true, false, false, true, true));
        return mammalsSet;
    }

    public Set<TrainingObject> fish() {
        Set<TrainingObject> fishSet = new HashSet<>();
        fishSet.add(new TrainingObject("fish", false, false, false, false, true, false));
        fishSet.add(new TrainingObject("fish", false, false, false, false, true, false));
        fishSet.add(new TrainingObject("fish", false, false, false, false, true, false));
        return fishSet;
    }

    public Set<TrainingObject> bird() {
        Set<TrainingObject> birdSet = new HashSet<>();
        birdSet.add(new TrainingObject("bird", false, false, true, true, false, true));
        birdSet.add(new TrainingObject("bird", false, false, true, true, false, true));
        birdSet.add(new TrainingObject("bird", false, false, true, true, false, true));
        return birdSet;
    }


}
