package com.app.geometry;

import java.util.Scanner;

public class PointerMaster {
	int x;
	int y;
	
	public PointerMaster() {
		// TODO Auto-generated constructor stub
	}
	public PointerMaster(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	
	

	public void accept(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x ");
		this.x= sc.nextInt();
		System.out.println("enter y ");
		this.y= sc.nextInt();
		
	 }
	
	
	
	 public boolean isEqual(PointerMaster p2)//this-> p1
	 {
		 if(this.x==p2.x && this.y==p2.y) {
			 
			 return true;
		 }else {
			 return false;
		 }
		 
	 }
	 public void calculateDistance(PointerMaster p2)// this->p1
	 {
		 
		 double distance=Math.sqrt(Math.pow(p2.x - this.x, 2) + Math.pow(p2.y - this.y, 2));
			System.out.println("Distance ="+distance);
	 }
	 
	 
	 public String getDetails() {
			
			
			return "values = "+x+ "and" +y;
			
		}
}
