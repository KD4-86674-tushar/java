package com.app.geometry;

public class Point2D {

	public static void main(String[] args) {

		
		PointerMaster p1= new PointerMaster();
		p1.accept();
		
		PointerMaster p2= new PointerMaster();
		p2.accept();
		
		p1.calculateDistance(p2);
		
		System.out.println("value = " +p1.getDetails());
		System.out.println("value = " +p2.getDetails());

	}

}
