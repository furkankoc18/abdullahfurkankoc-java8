package com.abdullahfurkan.optional;

import java.util.Optional;

public class Test {

	public static void main(String[] args) {

		String[] str = new String[10];
		str[5] = "JAVA OPTIONAL CLASS EXAMPLE"; // 5. indexe set edildi.
		
		Optional<String> empty = Optional.empty(); // Optional classýn boþ instance döndürür.
		System.out.println(empty);

		Optional<String> value = Optional.of(str[5]); 	// Boþ olmayan Optional döner.

		System.out.println("Filtered value: " + value.filter((s) -> s.equals("Abc"))); // Eger deðer varsa Optional döner, diðer durumlarda empty döner.
		System.out.println("Filtered value: " + value.filter((s) -> s.equals("JAVA OPTIONAL CLASS EXAMPLE")));
		System.out.println("Getting value: " + value.get()); //Varsa Optional döner, yoksa NoSuchElementException fýrlatýr.
		System.out.println("Getting hashCode: " + value.hashCode()); // Deðerin hashCode döndürür.
		System.out.println("Is value present: " + value.isPresent()); // Eðer varsa true döner, diðer durumlarda false döner.
		System.out.println("Nullable Optional: " + Optional.ofNullable(str[5])); // Eðer varsa boþ olmayan Optional döner, diðer durumlarda Optional empty döner
		System.out.println("orElse: " + value.orElse("Value is not present")); // Varsa deðeri döndürür, yoksa belirtilen deðeri döndürür.
		System.out.println("orElse: " + empty.orElse("Value is not present"));
		value.ifPresent(System.out::println); // Metot referansý kullanarak deðeri basar.

	}
}
