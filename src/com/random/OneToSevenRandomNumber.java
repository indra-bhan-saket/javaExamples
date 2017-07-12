package com.random;

import java.util.Random;

public class OneToSevenRandomNumber {

	public static void main(String[] args) {
		OneToSevenRandomNumber obj = new OneToSevenRandomNumber();
		System.out.println(obj.random1to7());

	}

	int random1to7() {
		int i;
		i = 5 * random1to5() + random1to5();
		if (i < 22)
			return i % 7 + 1;
		return random1to7();
	}

	int random1to5() {
		return new Random().nextInt(5);
	}

}
