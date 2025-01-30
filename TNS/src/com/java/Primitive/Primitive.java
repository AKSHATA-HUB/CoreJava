package com.java.Primitive;

public class Primitive {

	public static void main(String[] args) {
		byte byteMax=127;
		byte byteMin=-128;
		System.out.println("min range of byte "+ byteMin);
		System.out.println("Max range of byte "+ byteMax);

		//short ------ 2 byte
		short shortMax=32767;
		short shortMin=-32768;
		System.out.println("min range of short "+ shortMin);
		System.out.println("Max range of short "+ shortMax);

		//int ---- 4 byte
		int intMax=2147483647;
		int intMin=-2147483648;
		
		//long----8
		long longMin=-9223372036854775808L;
		long longMax=9223372036854775807L;
	}

}
