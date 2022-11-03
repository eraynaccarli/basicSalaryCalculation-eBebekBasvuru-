package emplooyeSystem.entity;

public class Emplooye {

	private String name;
	
	private String surname;
	
	private double salary;
	
	private int workHours ;
	
	private int hireYear ;
	

	public Emplooye(String name, String surname,double salary, int workHours, int hireYear) {
		super();
		this.name = name;
		this.surname = surname;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	public double tax(double salary) {
		
		if(salary > 1000) {
			double tax = (salary*3)/100;
			return tax;
		}
		else {
		
			return 0;
		}
	}
	
	public double bonus(int workHours) {
		double bonus;
		if(workHours > 40) {
			int overtimeWorking = workHours-40;
			bonus = overtimeWorking*30;
			return bonus;
		}
		else {
			return 0;
		}
		
	}
	
	public double raiseSalary(int hireYear) {
		int workingYear = 2021-hireYear;
		if(workingYear < 10) {
			return (this.salary*5)/100;
		}
		if(workingYear > 9 && workingYear < 20 ) {
			return (this.salary*10)/100;
		}
		if(workingYear > 19) {
			return (this.salary*15)/100;
		}
		else {
			return 0; 
		}
	}
	
	public String toString() {
		return "name-surname: " + name + " " + surname + "\n"
				+ "salary: " + salary + "\n" 
				+ "work hours: " + workHours + "\n"
				+ "hire year: " + hireYear;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

	public int getHireYear() {
		return hireYear;
	}

	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}

	
}
