package com.clearfaun.algorythems;

import java.util.UUID;

/**
 * Created by SpencerDepas on 4/9/16.
 */
public class Pig extends Animal{

    public Pig(){
        mId = UUID.randomUUID();
        animalType = "Pig";
        numberOfLegs = 4;
    }
}
