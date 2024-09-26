package Codes;

public class Employee1 {
	private String Name;
	private String Jobtittle;
	private int Salary;
	
	public Employee1(String Name,String Jobtittle,int Salary) {
		this.Name=Name;
		this.Jobtittle=Jobtittle;
		this.Salary=Salary;
	}
	//factory method
	private static Employee1 createEmployee1(String Name,String Jobtittle,int Salary) {
		return new Employee1(Name,Jobtittle,Salary);
	}
	private void UpdateSalary(double Percentage) {
		this.Salary=(int) (Salary+(Salary*Percentage/100));
	}
	void display() {
		System.out.println("Employee Name :"+Name);
		System.out.println("Employee Job :"+Jobtittle);
		System.out.println("Employee Salary :"+Salary);
	}
	
	
	public static void main(String args[]) {
		Employee1 Emp=Employee1.createEmployee1("Tony", "HR", 60000);
		Employee1 Emp1=Employee1.createEmployee1("Jack", "Frontend-Developer", 15000);
		Employee1 Emp2=Employee1.createEmployee1("Mark", "BackEnd-Developer", 25000);
		Employee1 Emp3=Employee1.createEmployee1("Smeeth", "Tester", 10000);
		
		
//		System.out.println("Employee Name :"+Emp.Name+"Employee Job"+Emp.Jobtittle+"Employee Salary :"+Emp.Salary);
//		System.out.println("Employee Name :"+Emp1.Name+"Employee Job"+Emp1.Jobtittle+"Employee Salary :"+Emp1.Salary);
		
		Emp.display();
		Emp1.display();
		Emp2.display();
		Emp3.display();
		
		Emp.UpdateSalary(12);
		Emp1.UpdateSalary(12);
		Emp2.UpdateSalary(12);
		Emp3.UpdateSalary(12);
		
		System.out.println("After Update :");
		Emp.display();
		Emp1.display();
		Emp2.display();
		Emp3.display();
		
	}
}
