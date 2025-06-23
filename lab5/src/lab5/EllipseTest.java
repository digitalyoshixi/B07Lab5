package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EllipseTest {
	private static final double TOLERANCE = 1e-6; // for checking equality with floats

	@Test
    public void testFociOnXAxis() {
        // Foci at (-1,0) and (1,0), total distance = 6
        Point A = new Point(-1, 0);
        Point B = new Point(1, 0);
        double totalDistance = 6;
        Ellipse e = new Ellipse(A, B, totalDistance);

        // Center point should be (0,0)
        Point center = e.get_center_point();
        assertEquals(0.0, center.x, TOLERANCE);
        assertEquals(0.0, center.y, TOLERANCE);

        // Distance from A to center = 0
        assertEquals(1.0, e.get_center(), TOLERANCE);

        // Semi-major axis a = totalDistance / 2 = 3
        assertEquals(3.0, e.get_semimajor(), TOLERANCE);

        // Semi-minor axis b = sqrt(a^2 - c^2) = sqrt(9 - 1) = sqrt(8)
        assertEquals(Math.sqrt(8), e.get_semiminor(), TOLERANCE);

        // Eccentricity = c / a = 1 / 3
        assertEquals(1.0/3.0, e.get_eccentricity(), TOLERANCE);

        // Perimeter approximation = 2*pi*sqrt((a^2 + b^2)/2)
        double a = e.get_semimajor();
        double b = e.get_semiminor();
        double expectedPerimeter = 2 * Math.PI * Math.sqrt((a*a + b*b) / 2);
        assertEquals(expectedPerimeter, e.get_perimeter(), TOLERANCE);
    }
	
	@Test
	public void testFociOnYAxis() {
		// Foci at (0,2) and (0,4), total distance = 10
        Point A = new Point(0, 2);
        Point B = new Point(0, 4);
        double totalDistance = 10;
        Ellipse e = new Ellipse(A, B, totalDistance);

        // Center point should be (0,3)
        Point center = e.get_center_point();
        assertEquals(0.0, center.x, TOLERANCE);
        assertEquals(3.0, center.y, TOLERANCE); 

        // Distance from A to center = 1
        assertEquals(1.0, e.get_center(), TOLERANCE);

        // Semi-major axis a = totalDistance / 2 = 5
        assertEquals(5.0, e.get_semimajor(), TOLERANCE);

        // Semi-minor axis b = sqrt(25 - 1) = sqrt(24)
        assertEquals(Math.sqrt(24), e.get_semiminor(), TOLERANCE);

        // Eccentricity = c / a = 1 / 5
        assertEquals(1.0/5.0, e.get_eccentricity(), TOLERANCE);

        // Perimeter check
        double a = e.get_semimajor();
        double b = e.get_semiminor();
        double expectedPerimeter = 2 * Math.PI * Math.sqrt((a*a + b*b) / 2);
        assertEquals(expectedPerimeter, e.get_perimeter(), TOLERANCE);
	}
	
	@Test
    public void testEllipseIsCircle() { // coincident foci = circle
        // Foci coincide at (2,3), total distance = 10
        Point A = new Point(2, 3);
        Point B = new Point(2, 3);
        double totalDistance = 10;
        Ellipse e = new Ellipse(A, B, totalDistance);

        // Center point should be (0,0) relative to A and B calculation
        Point center = e.get_center_point();
        assertEquals(2.0, center.x, TOLERANCE);
        assertEquals(3.0, center.y, TOLERANCE);

        // Distance from A to center = 0
        assertEquals(0.0, e.get_center(), TOLERANCE);

        // Semi-major axis a = 5
        assertEquals(5.0, e.get_semimajor(), TOLERANCE);

        // Semi-minor axis b = sqrt(25 - 0) = 5
        assertEquals(5.0, e.get_semiminor(), TOLERANCE);

        // Eccentricity = 0
        assertEquals(0.0, e.get_eccentricity(), TOLERANCE);

        // Perimeter = 2*pi*sqrt((25 + 25)/2) = 10*pi
        assertEquals(10 * Math.PI, e.get_perimeter(), TOLERANCE);
    }
	
	@Test
    public void testDiagonalFoci() {
        // Foci at (1,1) and (4,5), total distance
        Point A = new Point(1, 1);
        Point B = new Point(4, 5);
        double a = Math.hypot(4-1, 5-1);
        double totalDistance = 2 * a; // fun with math
        Ellipse e = new Ellipse(A, B, totalDistance);

        // Center point
        Point center = e.get_center_point();
        assertEquals(2.5, center.x, TOLERANCE);
        assertEquals(3.0, center.y, TOLERANCE);

        // Check semi-major
        assertEquals(a, e.get_semimajor(), TOLERANCE);

        // Check semi-minor = sqrt(a^2 - c^2)
        double c = e.get_center();
        double expectedB = Math.sqrt(a*a - c*c);
        assertEquals(expectedB, e.get_semiminor(), TOLERANCE);

        // Eccentricity = c / a
        assertEquals(c / a, e.get_eccentricity(), TOLERANCE);

        // Perimeter
        double expectedPerimeter2 = 2 * Math.PI * Math.sqrt((a*a + expectedB*expectedB)/2);
        assertEquals(expectedPerimeter2, e.get_perimeter(), TOLERANCE);
    } // god i love the Pythagorean Theorem!!

}
