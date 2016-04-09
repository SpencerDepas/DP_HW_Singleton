package com.clearfaun.algorythems;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here



        //I have a several farms
        //some with pigs
        //some with cows
        //they are all animals
        //when I am doing booking It is good o have acess to them all from one place


        //Farms cowshop has cows
        Cow bigFatCow = new Cow();


        //farm pigHouse has pigs
        Pig smallButDeliciousPig = new Pig();

        //when new animals are created I add them to my sAnimal singleton class
        //that I can access from anywhere
        //first I create the singleton class
        //it if is the first time making the list it will return a new class
        //it is not the first time it will return the old class
        Animals sAnimals = Animals.getInstance();

        //lets get the list of animals
        ArrayList<Animal> myAnimals = sAnimals.getMyAnimals();

        //lets put the cows and pigs in

        myAnimals.add(bigFatCow);
        myAnimals.add(smallButDeliciousPig);

        //lets print out animals

        for(int i = 0 ; i < myAnimals.size(); i ++){
            System.out.println(myAnimals.get(i).animalType);
        }
        System.out.println("");
        //output
        //Cow
        //Pig


        //what happens when we are in a new class or create a new singleton class?with a new name?
        Animals newSingletonClass = Animals.getInstance();
        ArrayList<Animal> newAnimalInstance = sAnimals.getMyAnimals();

        //what happens when we print this list ?
        for(int i = 0 ; i < newAnimalInstance.size(); i ++){
            System.out.println(newAnimalInstance.get(i).animalType);
        }
        System.out.println();
        //output
        //Cow
        //Pig

        //we can also delete animals
        newAnimalInstance.remove(bigFatCow);


        for(int i = 0 ; i < newAnimalInstance.size(); i ++){
            System.out.println(newAnimalInstance.get(i).animalType);
        }
        //output
        //Pig
    }
}
