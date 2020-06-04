package com.javapapers.spring.mvc;

import java.util.ArrayList;
import java.util.List;
/*
 
 Our software gurus talk lot about layering
 Generally the layer will be like,
 controller -> Service -> Business -> DAO
 
 Just to demonstrate that we have this class
 */
public class AnimalService {

	private static List<Animal> animalList = new ArrayList<Animal>();

	static {
		animalList.add(new Animal(1, "Lion", "Wild", true, 100));
		animalList.add(new Animal(2, "Tiger", "Wild", true, 90));
		animalList.add(new Animal(3, "Goat", "Domestic", true, 20));
		animalList.add(new Animal(4, "Elephant", "Wild", true, 1000));
	}

	public List<Animal> getAnimalList() {
		//internally we will call business -> DAO
		return animalList;
	}

}
