package com.abdullahfurkan.functionalinterfaces;

@FunctionalInterface
public interface Sayable {

	//abstract method
	void say(String msg);
	
	// Herhangi bir Object s�n�f� metotlar�n� i�erebilir.
	String toString();
	int hashCode();
	boolean equals(Object obj);
}
