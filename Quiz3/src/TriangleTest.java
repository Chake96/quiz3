import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test //tests to make sure the area is calculated properly
	public void testArea() {
		Triangle testTriangle = new Triangle(3.0, 4.0, 5.0);
		assertTrue(testTriangle.getArea() == 6);
		
		
	}
	
	@Test //tests that the perimeter is added correctly
	public void testPerimeter() {
		Triangle testTriangle = new Triangle();
		assertTrue(testTriangle.getPerimeter()== 3);
	}
	
	@Test //testing the triangle prints correctly
	public void testToString(){
		Triangle testTriangle = new Triangle(3.0,4.0,5.0);
			assertEquals(testTriangle.triangleToString(), "The first side is: 3.0\nthe second side is: 4.0\n the third side is: 5.0\nthe area is: 6.0\nthe perimeter is: 12.0");
	}
}
