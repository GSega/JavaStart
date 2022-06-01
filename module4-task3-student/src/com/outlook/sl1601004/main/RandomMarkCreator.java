package com.outlook.sl1601004.main;

import java.util.Random;

public class RandomMarkCreator {

	public static Integer[] makeItRandom(Integer[] array) {
		Random rand = new Random();
		Integer[] generated = new Integer[array.length];
		for (int i = 0; i < array.length; i++) {
			generated[i] = rand.nextInt(10);
		}

		return generated;

	}
}
