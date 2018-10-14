package com.java.basics;

public class EmployeeRecord {

	
	double salary[] = {23500.0,	25080.0, 28760.0, 22340.0, 19890.0};
	
	public void calculateAvg(){
		double avg = 0;
		double totalSum = 0;
		for(double s : salary){
			totalSum += s;
		}
		avg = totalSum / salary.length;
		int lessCount = 0;
		int moreCount = 0;
		for(double s : salary){
			if(s >= avg){
				moreCount++;
			}else{
				lessCount++;
			}
		}
		System.out.println("Average salary of the employee is :"+avg);
		System.out.println("No.of Employess having salary Greater then Avg : "+moreCount);
		System.out.println("No.of Employess having salary Less then Avg : "+lessCount);
	}
	
	public static void main(String[] args) {
		EmployeeRecord record = new EmployeeRecord();
		record.calculateAvg();

	}

}
