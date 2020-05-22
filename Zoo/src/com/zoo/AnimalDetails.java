package com.zoo;

import java.util.ArrayList;
import java.util.Arrays;
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
		List<Birds> bList = Arrays.asList(b1, b2,b3,b4,b5);
		
		//Mammals List
		List<Mammals> mList = Arrays.asList(m1, m2, m3,m4,m5);
		
		//Marine Animals List
		List<MarinAnimals> maList = Arrays.asList(ma1,ma2,ma3,ma4,ma4);
		
		//Reptiles List
		 List<Reptiles> rList = Arrays.asList(r1,r2,r3,r4,r5);
		
		 
		
		List<Animals> zooAnimals = new ArrayList<Animals>();
		zooAnimals.addAll(bList);
		zooAnimals.addAll(mList);
		zooAnimals.addAll(maList);
		zooAnimals.addAll(rList);
		
		//Printing Elements
		for(Animals animals : zooAnimals)
		{
			System.out.println(animals);
		}

	}

}
