package day22;

import MyLibrary.Library;
import day21.Shoe;
import star.star;

import java.util.ArrayList;
import java.util.Arrays;

public class AnimalObject {

    public static void main(String[] args) {

        //to be able to create new object from class
        Animals animal1=new Animals();

        Shoe shoe1=new Shoe(); //since this is in different package it will use import keyword to get class information

        Library.stars();


//        animal1.type="dog";
//        animal1.name="dog1";
//        animal1.color="black;
//        animal1.age=5.5;

        //System.out.println(animal1);//day22.Animals@5cad8086 since we dont have any tostring method
        System.out.println(animal1.age);//0.0
        System.out.println(animal1.name);//null
        System.out.println(animal1.color);//null

        Library.stars();
        animal1.setAnimalInfo("dog" , 5.5 , "black" , "dog1");
        System.out.println(animal1.name);
        System.out.println(animal1.age);
        System.out.println(animal1.color);

        Library.stars();
        animal1.getAnimalInfo(); //dog1 , 5.5 , black , dog

        animal1.eating("watermelon");

        System.out.println(animal1);//day22.Animals@5cad8086 if you dont have tostrin method
        //after tostring method ;; this  will prints tostring
        // Name of animal : dog1 , age of animal : 5.5 , Color of Animal : black , Type of animal dog


        Shoe shoe2=new Shoe();
        shoe2.setShoeInfo("nike",8,"white");
        System.out.println(shoe2); //this will print to string of shoe



        Animals animals2=new Animals();
        animals2.setAnimalInfo("bird" , 2,"red","bird1");

        Animals animals3=new Animals();
        animals3.setAnimalInfo("cat" , 4 , "white" ,"cat1");

        Animals animals4=new Animals();
        animals4.setAnimalInfo("dog" , 1,"yellow" ,"dog2");


        Library.stars();
        ArrayList<Animals> animalList=new ArrayList<>();
        animalList.addAll(Arrays.asList(animal1,animals2,animals3,animals4));

        for (int i =0 ; i < animalList.size() ; i++){
            System.out.println(animalList.get(i).name);
        }


        for (Animals each : animalList){
            System.out.println(each.age);
        }

        //Animals []
        Animals [] animalsArr={animal1,animals2,animals3,animals4};

        String food1="banana";
        String food2="watermelon";
        String food3="bread";


        animal1.eating(food1);

        for ( Animals each: animalsArr){
            each.getType();
            each.eating(food3);
        }

        star.stars();


    }

    }

