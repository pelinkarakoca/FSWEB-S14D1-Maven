package com.workintech.developers;

public class HRManager extends Employee{
	private JuniorDeveloper[] juniorDevelopers;
	private MidDeveloper[] midDevelopers;
	private SeniorDeveloper[] seniorDevelopers;
	public HRManager(int id, String name, int salary){
		super(id, name, salary);
		juniorDevelopers = new JuniorDeveloper[10];
		midDevelopers = new MidDeveloper[10];
		seniorDevelopers = new SeniorDeveloper[10];
	}
	@Override
	public void work (){
		setSalary(2500);
		System.out.println("HRManager starts to working");
	}
	public void addEmployee(JuniorDeveloper juniorDeveloper, int index){
		if(index >= juniorDevelopers.length){
			System.out.println("Index is out of array length");
			return;
		}
		if(juniorDevelopers[index] == null) juniorDevelopers[index] = juniorDeveloper;
		else System.out.println("This lot is not empty");
	}
	public void addEmployee(MidDeveloper midDeveloper,  int index){
		if(index >= midDevelopers.length){
			System.out.println("Index is out of array length");
			return;
		}
		if(midDevelopers[index] == null) midDevelopers[index] = midDeveloper;
		else System.out.println("This lot is not empty");
	}
	public void addEmployee(SeniorDeveloper seniorDeveloper,  int index){
		if(index >= seniorDevelopers.length){
			System.out.println("Index is out of array length");
			return;
		}
		if(seniorDevelopers[index] == null) seniorDevelopers[index] = seniorDeveloper;
		else System.out.println("This lot is not empty");
	}
}
