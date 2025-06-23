package cscb07;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import cscb07.Triangle;

/**
 * Unit test for simple App.
 */
public class TriangleTest {
    @Test
    public void testPerimeter() {
      Triangle t1 = new Triangle(new Point(0,0), new Point(0,1), new Point(1,0));
      assertEquals(t1.perimeter(), 3.414213562373095);
    }
    @Test
    public void testIsEquilateral() {
      Triangle t1 = new Triangle(new Point(0,0), new Point(Math.sqrt(5),0), new Point(Math.sqrt(5)/2,Math.sqrt(15)/2));
      assertTrue(t1.isEquilateral());
    }
    @Test
    public void testIsNotEquilateral() {
      Triangle t1 = new Triangle(new Point(0,0), new Point(Math.sqrt(5),0), new Point(Math.sqrt(5)/2,Math.sqrt(15)/3));
      assertFalse(t1.isEquilateral());
    }
}
