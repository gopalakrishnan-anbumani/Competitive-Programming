package com.java.basics;

public class MarketingTeam extends Team implements Bonus{
	
	private int salesNumber;
	
	public MarketingTeam(String address, String name, int phoneNo, int empId, String dept, int salesNumber) {
		super(address, name, phoneNo, empId, dept);
		this.salesNumber = salesNumber;
	}

	@Override
	public long calculateBonusPayout(int actualSales, int targetSales) {
		float percentage = calculateSalesPercentage(actualSales, targetSales);
		
		if(percentage > 100){
			setRating("DIAMOND");
			return DIAMOND;
		}else if(percentage == 100){
			setRating("GOLD");
			return GOLD;
		}
		else if(percentage >= 90 && percentage < 100){
			setRating("SILVER");
			return SILVER;
		}else{
			setRating("Good Work, try to achieve more!.");
			return 0;
		}
	}

	private float calculateSalesPercentage(int actualSales, int targetSales) {
		float percentage = targetSales*100 / actualSales;
		return percentage;
	}
	
	@Override
	public int hashCode() {
		return this.getEmpId();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null || obj.getClass()!=this.getClass()){
			return false;
		}
		Team team = (Team) obj;
		if(team.getEmpId() != this.getEmpId()){
			return false;
		}
		return true;
	}
	
}
