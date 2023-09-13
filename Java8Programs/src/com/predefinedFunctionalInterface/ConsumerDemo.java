package com.predefinedFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<String> c =(name) -> System.out.println(name + ", Good Evening");
		c.accept("Teja");
		c.accept("Trivin");
		c.accept("Krish");
		List<Integer> number = Arrays.asList(10,20,30,40);
		number.forEach(i->System.out.println(i));
		
	}

}
