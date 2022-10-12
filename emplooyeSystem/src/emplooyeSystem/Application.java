package emplooyeSystem;

import java.util.Scanner;

import emplooyeSystem.entity.Emplooye;

public class Application {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Name: ");
	String nameInput = sc.nextLine();
	
	System.out.println("Surname: ");
	String surnameInput = sc.nextLine();
	
	System.out.println("Salary: ");
	String salaryInput = sc.nextLine();
	double salary = Double.parseDouble(salaryInput);
	
	
	System.out.println("Work hours: ");
	String workHoursInput = sc.nextLine();
	int workHours = Integer.parseInt(workHoursInput);
	
	
	System.out.println("Hire year: ");
	String hireYearInput = sc.nextLine();
	int hireYear = Integer.parseInt(hireYearInput);
	

	Emplooye eray = new Emplooye(nameInput, surnameInput, salary, workHours, hireYear);
	
	System.out.println(eray.toString());
	String menu = (
			"-------------------------------------\n" +
			"Welcome " + nameInput  + "\n"
			+ "-------------------------------------\n"
			+ "1- view salary values\n"
			+ "2- exit\n"
			+ "your choice --> ");
	System.out.print(menu);
	
	String input = sc.nextLine();
	if(input.equals("1")) {
		System.out.println( 
						  "-------------------------------------\n" 
						+ "tax: " + eray.tax(eray.getSalary()) + "TL" + "\n"
						+   "bonus: " + eray.bonus(eray.getWorkHours()) + "TL" + "\n"
						+   "raise salary: " + eray.raiseSalary(eray.getHireYear()) + "TL");
	}
	if(input.equals("2")) {
		System.out.println("Good Bye " + nameInput);
		System.exit(0);
	}
	
	}
	
}
