public class Triangle extends GeometricObject{
	
	private double side1 = 1; 
	private double side2 = 1;
	private double side3 = 1;
	
	//sets the length of the first side
	public void setSide1(double a) {
		this.side1 = a;
	}

	//sets the length of the second side
	public void setSide2(double b) {
		this.side2 = b;
	}

	//sets the length of the third side
	public void setSide3(double c) {
		this.side3 = c;
	}
	
	//gets the length of the first side
	public double getSide1() {
		return this.side1;
	}

	//gets the length of the second side
	public double getSide2() {
		return  this.side2;
	}
	
	//gets the length of the third side
	public double getSide3() {
		 return this.side3;
	}

	//constructor for the default triangle
	public Triangle(){
		this.toString();
	}
	
	//creates a triangle with sides of length a,b,c
	public Triangle(double a, double b, double c) {
		setSide1(a);
		setSide2(b);
		setSide3(c);
	}	

	@Override //over rides the GeometricObject area method, calculates the perimeter of the given triangle
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	@Override //over rides the GeometricObject area method, calculates the area of the given triangle
	public double getArea() {
		double area = 0;
		double p = .5 * getPerimeter();
		area = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
		return area;
	}
	
	public String triangleToString(){
		String statement = "The first side is: " + getSide1() + "\nthe second side is: " + getSide2() + "\n the third side is: " + getSide3() + "\nthe area is: " + getArea() +"\nthe perimeter is: " + getPerimeter();
		System.out.print(statement);
		return statement;		
	}
	
	public static void main(String[] args){
		Triangle test = new Triangle(3.0, 4.0, 5.0);
		test.triangleToString();
	}




	

}
