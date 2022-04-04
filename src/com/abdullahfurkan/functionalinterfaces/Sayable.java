package com.abdullahfurkan.functionalinterfaces;

@FunctionalInterface
public interface Sayable {

	//abstract method
	void say(String msg);
	
	// Herhangi bir Object sýnýfý metotlarýný içerebilir.
	String toString();
	int hashCode();
	boolean equals(Object obj);
}
