package com.adapterpattern.birdsound;

public class Sparrow implements Bird {

	@Override
	public void fly() {

		System.out.println("Sparrow is flying");
	}

	@Override
	public void makeSound() {

		System.out.println("Sparrow chirp chirp...");
	}

}