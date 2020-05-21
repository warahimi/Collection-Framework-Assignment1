package com.zoo;

import java.util.ArrayList;
import java.util.List;

public class AnimalDetails {

	public static void main(String[] args) {
		
		//Birds Objects
		Birds b1 = new Birds(101, "Sparrow", "gray");
		Birds b2 = new Birds(102, "Parrot", "green");
		Birds b3 = new Birds(103, "Crow", "black");
		Birds b4 = new Birds(104, "Eagle", "black and white");
		Birds b5 = new Birds(105, "Hen", "red");
		
		//Mammal Objects
		Mammals m1 = new Mammals(106, "Cow", "brown");
		Mammals m2 = new Mammals(107, "Hourse", "white");
		Mammals m3 = new Mammals(108, "Lio", "brown");
		Mammals m4 = new Mammals(109, "Monkey", "black");
		Mammals m5 = new Mammals(110, "Sheep", "white");
		
		//Marin-Animals Objects
		MarinAnimals ma1 = new MarinAnimals(111, "fish", "red");
		MarinAnimals ma2 = new MarinAnimals(112, "Whoal", "black");
		MarinAnimals ma3 = new MarinAnimals(113, "Turtle", "brown");
		MarinAnimals ma4 = new MarinAnimals(114, "Snak", "black");
		MarinAnimals ma5 = new MarinAnimals(115, "Shark", "gray");
		
		//Retiles Objects
		Reptiles r1 = new Reptiles(116, "Snake", "brown");
		Reptiles r2 = new Reptiles(116, "Lizar", "black");
		Reptiles r3 = new Reptiles(116, "Turtule", "gray");
		Reptiles r4 = new Reptiles(116, "crocodiles", "black");
		Reptiles r5 = new Reptiles(116, "Skink", "green");


		//Birst List
		ArrayList<Birds> birdsList= new ArrayList<Birds>();
		birdsList.add(b1);
		birdsList.add(b2);
		birdsList.add(b3);
		birdsList.add(b4);
		birdsList.add(b5);
		
		//Mammals List
		ArrayList<Mammals> mammalsList = new ArrayList<Mammals>();
		mammalsList.add(m1);
		mammalsList.add(m2);
		mammalsList.add(m3);
		mammalsList.add(m4);
		mammalsList.add(m5);
		
		//Marine Animals List
		ArrayList<MarinAnimals> maList = new ArrayList<MarinAnimals>();
		maList.add(ma1);
		maList.add(ma2);
		maList.add(ma3);
		maList.add(ma4);
		maList.add(ma5);
		
		//Reptiles List
		ArrayList<Reptiles> reptilesList = new ArrayList<Reptiles>();
		reptilesList.add(r1);
		reptilesList.add(r2);
		reptilesList.add(r3);
		reptilesList.add(r4);
		reptilesList.add(r5);
		
		
		ArrayList<Animals> zooAnimals = new ArrayList<Animals>();
		zooAnimals.addAll(birdsList);
		zooAnimals.addAll(mammalsList);
		zooAnimals.addAll(maList);
		zooAnimals.addAll(reptilesList);
		
		//Printing Elements
		for(Animals animals : zooAnimals)
		{
			System.out.println(animals);
		}

	}

}
