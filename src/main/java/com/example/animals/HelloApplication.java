package com.example.animals;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();
        Animal myRabbit = new Rabbit();
        myAnimal.animalSound();
        myPig.animalSound();
        myPig.animalSize();
        myPig.animalName();
        myDog.animalSound();
        myDog.animalSize();
        myDog.animalName();
        myRabbit.animalSound();
        myRabbit.animalSize();
        myRabbit.animalName();
    }
}
