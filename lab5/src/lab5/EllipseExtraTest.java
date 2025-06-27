package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EllipseExtraTest {
	
	@Test
    public void testCenterPoint0() {
		
		//a circle
		Point A = new Point(1, 1);
        Point B = new Point(1, 1);
		double d = 2.0;
        Ellipse e = new Ellipse(A, B, d);
		
		Point c = new Point(1, 1);
		assertEquals(c, e.get_center_point());
	}
	
	
	@Test
    public void testCenterPoint1() {

		Point A = new Point(1, 1);
        Point B = new Point(3, 9);
		double d = Math.PI;
        Ellipse e = new Ellipse(A, B, d);
		
		Point c = new Point(2, 5);
		assertEquals(c, e.get_center_point());
	}
	
	@Test
    public void testCenter0() {
		
		//a circle
		Point A = new Point(1, 1);
        Point B = new Point(1, 1);
		double d = 2.0;
        Ellipse e = new Ellipse(A, B, d);
        
		assertEquals(0.0, e.get_center());
	}
	
	@Test
    public void testCenter1() {
		
		Point A = new Point(1, 1);
        Point B = new Point(7, 9);
		double d = 5.253256578;
        Ellipse e = new Ellipse(A, B, d);
        
		assertEquals(5.0, e.get_center());
	}
	
	@Test
    public void testSemimajore0() {
		
		//a single point
		Point A = new Point(1, 1);
        Point B = new Point(1, 1);
		double d = 0.0;
        Ellipse e = new Ellipse(A, B, d);
		
		assertEquals(0.0, e.get_semimajor());
	}
	
	
	
	@Test
    public void testSemimajore1() {
		
		Point A = new Point(1, 1);
        Point B = new Point(1, 1);
		double d = Math.PI;
        Ellipse e = new Ellipse(A, B, d);
		
		assertEquals(0.5*Math.PI, e.get_semimajor());
	}
	
	
	@Test
    public void testSemiminor0() {
		
		//a circle
		Point A = new Point(1, 1);
        Point B = new Point(1, 1);
		double d = 2.0;
        Ellipse e = new Ellipse(A, B, d);
		
		assertEquals(1.0, e.get_semiminor());
	}
	
	
	@Test
    public void testSemiminor1() {
		
		Point A = new Point(1, 1);
        Point B = new Point(7, 9);
		double d = 26;
        Ellipse e = new Ellipse(A, B, d);
        
		
		assertEquals(12.0, e.get_semiminor());
	}
	
	
	@Test
    public void testEccentricity0() {
		
		//a circle
		Point A = new Point(1, 1);
        Point B = new Point(1, 1);
		double d = 2.0;
        Ellipse e = new Ellipse(A, B, d);
		
		assertEquals(0.0, e.get_eccentricity());
	}
	
	
	@Test
    public void testEccentricity1() {
		

		Point A = new Point(1, 1);
        Point B = new Point(7, 9);
		double d = 26;
        Ellipse e = new Ellipse(A, B, d);
		
		assertEquals(5.0/13.0, e.get_eccentricity());
	}
	
	@Test
    public void testPerimeter0() {
		
		//a circle
		Point A = new Point(1, 1);
        Point B = new Point(1, 1);
		double d = 2.0;
        Ellipse e = new Ellipse(A, B, d);
		
		assertEquals(2*Math.PI, e.get_perimeter());
	}
	
	@Test
    public void testPerimeter1() {
		
		Point A = new Point(1, 1);
        Point B = new Point(7, 9);
		double d = 26;
        Ellipse e = new Ellipse(A, B, d);
		
		assertEquals(2*Math.PI*Math.sqrt(156.5), e.get_perimeter());
	}
	
	
	
}
