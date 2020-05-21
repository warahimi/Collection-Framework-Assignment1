package com.zoo;

public class Reptiles implements Animals{
	private int id;
	private String name;
	private String color;
	
	

	public Reptiles(int id, String name, String color) {
		this.id = id;
		this.name = name;
		this.color = color;
	}
	
	@Override
	public String move() {
		return name + " Crows";
		
	}
	
	@Override
	public String toString() {
		return "Id: " + id + "\nName: " + name + "\nColor: " + color +"\nMoving Type: "+ move() + "\n";
	}
	

}
