package com.clearfaun.algorythems;

import java.util.UUID;

/**
 * Created by SpencerDepas on 4/9/16.
 */
public class Cow extends Animal {

    public Cow(){
        mId = UUID.randomUUID();
        animalType = "Cow";
        numberOfLegs = 4;
    }
}
