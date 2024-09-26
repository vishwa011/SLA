package Tasks;
//Task 25.09.2024

//Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.

public class Employee {
	private String Name;
	private String Jobtittle;
	private double Salary;
	
	public Employee(String Name,String Jobtittle,double Salary) {
		this.Name=Name;
		this.Jobtittle=Jobtittle;
		this.Salary=Salary;
	}
	public String setName(String Name) {
		return Name;
	}
	public void getName(String Name) {
		this.Name=Name;
	}
	public String getJobtittle(String Jobtittle) {
		return Jobtittle;
	}
	public void setJOtittle(String Jobtittle) {
		this.Jobtittle=Jobtittle;
	}
	public double getSalary(double Salary) {
		return Salary;
	}
	public  void setSalary(double Salary) {
		this.Salary=Salary;
	}
	public void UpdateSalary(double Percentage) {
		Salary=Salary+(Salary*Percentage/100);
	}
	void display() {
		System.out.println("Employee Name :"+Name);
		System.out.println("Employee Job tittle :"+Jobtittle);
		System.out.println("Employee Salary :"+Salary);
	}
	public static void main(String args[]) {
		Employee Employee1=new Employee("jack","Developer",40000);
		Employee Employee2=new Employee("Reo","Tester",60000);
		
//		System.out.println("Employee1 Name :"+Employee1.Name+"Emp Job_tittle :"+Employee1.Jobtittle+"Emp Salary :"+Employee1.Salary);
//		System.out.println("Employee2 Name :"+Employee2.Name+"Emp Job_tittle :"+Employee2.Jobtittle+"Emp Salary :"+Employee2.Salary);
		
		Employee1.display();
		Employee2.display();
		
		Employee1.UpdateSalary(8);
		Employee2.UpdateSalary(8);
		
		System.out.println("After Update :");
		Employee1.display();
		Employee2.display();
		
	}
}
