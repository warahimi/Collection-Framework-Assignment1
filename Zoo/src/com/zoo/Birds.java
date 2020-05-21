package com.zoo;

public class Birds implements Animals{

	private int id;
	private String name;
	private String color;
	
	
	public Birds(int id, String name, String color) {
		this.id = id;
		this.name = name;
		this.color = color;
	}


	@Override
	public String move() {
		return name + " Flie";
		
	}
	
	
	@Override
	public String toString() {
		return "Id: " + id + "\nName: " + name + "\nColor: " + color +"\nMoving Type: "+ move() + "\n";
	}
	

}
