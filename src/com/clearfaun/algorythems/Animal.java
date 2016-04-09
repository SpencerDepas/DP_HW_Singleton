package com.clearfaun.algorythems;

import java.util.UUID;

/**
 * Created by SpencerDepas on 4/9/16.
 */
public abstract class Animal {

    protected UUID mId;
    protected int age;
    protected String animalType;
    protected int numberOfLegs;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }



    public UUID getmId() {
        return mId;
    }

    public void setmId(UUID mId) {
        this.mId = mId;
    }




}
