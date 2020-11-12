package com.zhw.id;

public class IdentifierGeneratorApplication {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(DefaultIdentifierGenerator.nextId());
			System.out.println(DefaultIdentifierGenerator.nextUUID());
		}



	}

}
