package cscb07;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import cscb07.Point;

/**
 * Unit test for simple App.
 */
public class PointTest {
    @Test
    public void testDistance() {
      Point p1 = new Point(0,0);
      Point p2 = new Point(1,0);
      assertEquals(p1.distance(p2), 1);
    }
    @Test
    public void testHash() {
      Point p1 = new Point(2,2);
      assertEquals(p1.hashCode(), 16);
    }
    @Test
    public void testEquals() {
      Point p1 = new Point(2,2);
      Point p2 = new Point(2,2);
      assertTrue(p1.equals(p2));
    }
    @Test
    public void testNotEquals() {
      Point p1 = new Point(2,2);
      Point p2 = new Point(2,1);
      assertFalse(p1.equals(p2));
    }
    @Test
    public void testNullEquals() {
      Point p1 = new Point(2,2);
      assertFalse(p1.equals(null));
    }
    @Test
    public void testSelfEquals() {
      Point p1 = new Point(2,2);
      assertTrue(p1.equals(p1));
    }
    @Test
    public void testTypeEquals() {
      Point p1 = new Point(2,2);
      int a = 20;
      assertFalse(p1.equals(a));
    }
    @Test
    public void testXNotEquals() {
      Point p1 = new Point(2,2);
      Point p2 = new Point(1,2);
      assertFalse(p1.equals(p2));
    }
}
