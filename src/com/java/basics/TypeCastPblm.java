package com.java.basics;

public class TypeCastPblm {
	
	int billId;
	int custId;
	double billAmount;
	double discountedBillAmount;
	
	public TypeCastPblm() {
	}
	
	public TypeCastPblm(int billId, int custId){
		this.billId = billId;
		this.custId = custId;
	}

	private double calculateBillAmount(double billAmount){
		return (billAmount - billAmount * (double) 2/100);
	}
	
	public static void main(String[] args) {
		TypeCastPblm typeCastPblm = new TypeCastPblm(1, 1);
		System.out.println("Total Bill amount = "+typeCastPblm.calculateBillAmount(15000.50));
	}

}
