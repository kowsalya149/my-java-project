package com.adapterpattern.birdsound;

public class Crow implements Bird {

	@Override
	public void fly() {

		System.out.println("Crow is flying");
	}

	@Override
	public void makeSound() {

		System.out.println("crow crow...");
	}

}