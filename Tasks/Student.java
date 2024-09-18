package Tasks;

 class Students {
	int studentId;
	String studentName;
	int Subject1,Subject2,Subject3,Subject4,Subject5;
	
	void displaydetails(){
		System.out.println("Student ID :"+studentId);
		System.out.println("StudentNmae :"+studentName);
		System.out.println("Subject1 :"+Subject1);
		System.out.println("Subject2 :"+Subject2);
		System.out.println("Subject3 :"+Subject3);
		System.out.println("Subject4 :"+Subject4);
		System.out.println("Subject5 :"+Subject5);
	}
	
}
 class Student{
		public static void main(String args[]) {
			Students student=new Students();
			
			student.studentId = 101;
			student.studentName ="vishwa";
			student.Subject1 = 85;
			student.Subject2 = 80;
			student.Subject3 = 65;
			student.Subject4 = 93;
			student.Subject5 = 96;
			
			student.displaydetails();
		}
	}
