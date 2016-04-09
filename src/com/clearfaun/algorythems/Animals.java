package com.clearfaun.algorythems;

import java.util.ArrayList;

/**
 * Created by SpencerDepas on 4/9/16.
 */
public class Animals {

    private static Animals sAnimals;
    private ArrayList<Animal> myAnimals;


    private Animals(){}

    public static synchronized Animals getInstance(){
        if(sAnimals == null){
            sAnimals = new Animals();
        }
        return sAnimals;
    }

    public ArrayList<Animal> getMyAnimals(){
        if(myAnimals == null){
            myAnimals = new ArrayList<Animal>();
        }

        return myAnimals;
    }

    public void setMyAnimals(ArrayList<Animal>myAnimals){
        this.myAnimals = myAnimals;
    }

    public void addMyAnimal(Animal animal){
        myAnimals.add(animal);
    }

    public void deleteAnimal(Animal animal){
        for(int i = 0 ; i < myAnimals.size(); i ++ ){
            if(animal.getmId() == myAnimals.get(i).getmId()){
                myAnimals.remove(i);
            }
        }


    }

}
