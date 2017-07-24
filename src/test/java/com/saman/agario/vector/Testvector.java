package com.saman.agario.vector;

public class Testvector {
	
	public static void main(String[] args) {
		
		Vector v1 = new Vector(2,3);
		Vector v2 = new Vector(5, 7);
		
		double result = v1.distanceTo(v2);
		
		System.out.println(result);
		
	}
	
}
