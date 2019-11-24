package com.class25;

public class Test {

	public static void main(String[] args) {
		System.out.println("Creating an object of Employee class");
		Employee emp = new Employee();
		emp.salary = 70000;
		Employee.companyName = "Syntax";
		emp.work();
		emp.getPaid();
		System.out.println("----creating an object of a Scrum Team class-----");
		ScrumTeam sm = new ScrumTeam();
		sm.salary = 90000;
		sm.work();
		sm.getPaid();
		sm.artifacts = "product Backlog, Sprint Backlog BurnDown chart";
		sm.ceremonies = "Sprint Demo Planning,retro,daily StandUp";
		sm.attendScrumMeetings();
		System.out.println("---Creating an object of a developer class------");
		Developer dev = new Developer();
		dev.salary = 130000;
		dev.work();
		dev.getPaid();
		dev.code();
		dev.artifacts = "Spring Backlog";
		dev.ceremonies="Spring Demo,Planing,retro,daily stand up";
		dev.attendScrumMeetings();

	}

}
