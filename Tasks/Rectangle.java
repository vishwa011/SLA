package Tasks;

//Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.

public class Rectangle {
	private double Width;
	private double Height;
	
	public Rectangle(double Width,double Height) {
		this.Width=Width;
		this.Height=Height;
	}
	public double getWidth() {
		return Width;
	}
	public void setWidth(double Width) {
		this.Width=Width;
	}
	public double getHeight() {
		return Height;
	}
	public void setHeight(double Height) {
		this.Height=Height;
	}
	public  double area() {
		return Width*Height;
	}
	public double perimeter() {
		return 2*(Width*Height);
	}
	public static void main(String args[]) {
		Rectangle Num=new Rectangle(7,12);
		
		System.out.println("The area of Rectangle :"+Num.area());
		System.out.println("The perimeter of Rectangle :"+Num.perimeter());
		
		Num.setWidth(6);
		Num.setHeight(12);
		
		System.out.println("The area of rectangle :"+Num.area());
		System.out.println("The perimeter of Rectangle :"+Num.perimeter());
	}
}
