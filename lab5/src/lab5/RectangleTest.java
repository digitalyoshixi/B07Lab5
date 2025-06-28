package lab5;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    public void testDefaultConstructorWidth() {
        Rectangle r = new Rectangle();
        assertEquals(1.0, r.getWidth());
    }

    @Test
    public void testDefaultConstructorHeight() {
        Rectangle r = new Rectangle();
        assertEquals(2.0, r.getHeight());
    }

    @Test
    public void testDefaultConstructorArea() {
        Rectangle r = new Rectangle();
        assertEquals(2.0, r.getArea());
    }

    @Test
    public void testDefaultConstructorPerimeter() {
        Rectangle r = new Rectangle();
        assertEquals(6.0, r.getPerimeter());
    }
    
    @Test
    public void testParameterizedGetWidth() {
        Point pA = new Point(10, 20);
        Point pB = new Point(10, 25);
        Point pC = new Point(18, 25);
        Point pD = new Point(18, 20);
        Rectangle r = new Rectangle(pA, pB, pC, pD);
        assertEquals(5.0, r.getWidth());
    }

    @Test
    public void testParameterizedGetHeight() {
        Point pA = new Point(10, 20);
        Point pB = new Point(10, 25);
        Point pC = new Point(18, 25);
        Point pD = new Point(18, 20);
        Rectangle r = new Rectangle(pA, pB, pC, pD);
        assertEquals(8.0, r.getHeight());
    }

    @Test
    public void testParameterizedGetArea() {
        Point pA = new Point(0, 0);
        Point pB = new Point(0, 4);
        Point pC = new Point(5, 4);
        Point pD = new Point(5, 0);
        Rectangle r = new Rectangle(pA, pB, pC, pD);
        assertEquals(20.0, r.getArea());
    }

    @Test
    public void testParameterizedGetPerimeter() {
        Point pA = new Point(0, 0);
        Point pB = new Point(0, 4);
        Point pC = new Point(5, 4);
        Point pD = new Point(5, 0);
        Rectangle r = new Rectangle(pA, pB, pC, pD);
        assertEquals(18.0, r.getPerimeter());
    }
}