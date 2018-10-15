package com.java.basics;

public class Chocolate {
	
	private int barCode;
	private String name;
	private int weight;
	private int cost;
	
	public Chocolate(){
		barCode = 101;
		name = "Cadbury";
		weight = 12;
		cost = 10;
	}

	public static void main(String[] args) {
		Chocolate chocolate = new Chocolate();
		System.out.println("Constructor Values");
		System.out.println("Chocolate: \n BarCode =" + chocolate.getBarCode() + ", Name="
				+ chocolate.getName() + ", Weight=" + chocolate.getWeight() + ", Codt="
				+ chocolate.getCodt());
		chocolate.setBarCode(123);
		chocolate.setCodt(12);
		chocolate.setName("5Star");
		chocolate.setWeight(100);
		System.out.println("Setter  Values Values");
		System.out.println("Chocolate: \n BarCode =" + chocolate.getBarCode() + ", Name="
				+ chocolate.getName() + ", Weight=" + chocolate.getWeight() + ", Codt="
				+ chocolate.getCodt());
	}

	public int getBarCode() {
		return barCode;
	}

	public void setBarCode(int barCode) {
		this.barCode = barCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getCodt() {
		return cost;
	}

	public void setCodt(int codt) {
		this.cost = codt;
	}

}
