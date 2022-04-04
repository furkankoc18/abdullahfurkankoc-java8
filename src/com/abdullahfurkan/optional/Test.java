package com.abdullahfurkan.optional;

import java.util.Optional;

public class Test {

	public static void main(String[] args) {

		String[] str = new String[10];
		str[5] = "JAVA OPTIONAL CLASS EXAMPLE"; // 5. indexe set edildi.
		
		Optional<String> empty = Optional.empty(); // Optional class�n bo� instance d�nd�r�r.
		System.out.println(empty);

		Optional<String> value = Optional.of(str[5]); 	// Bo� olmayan Optional d�ner.

		System.out.println("Filtered value: " + value.filter((s) -> s.equals("Abc"))); // Eger de�er varsa Optional d�ner, di�er durumlarda empty d�ner.
		System.out.println("Filtered value: " + value.filter((s) -> s.equals("JAVA OPTIONAL CLASS EXAMPLE")));
		System.out.println("Getting value: " + value.get()); //Varsa Optional d�ner, yoksa NoSuchElementException f�rlat�r.
		System.out.println("Getting hashCode: " + value.hashCode()); // De�erin hashCode d�nd�r�r.
		System.out.println("Is value present: " + value.isPresent()); // E�er varsa true d�ner, di�er durumlarda false d�ner.
		System.out.println("Nullable Optional: " + Optional.ofNullable(str[5])); // E�er varsa bo� olmayan Optional d�ner, di�er durumlarda Optional empty d�ner
		System.out.println("orElse: " + value.orElse("Value is not present")); // Varsa de�eri d�nd�r�r, yoksa belirtilen de�eri d�nd�r�r.
		System.out.println("orElse: " + empty.orElse("Value is not present"));
		value.ifPresent(System.out::println); // Metot referans� kullanarak de�eri basar.

	}
}
