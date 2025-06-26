package lab5;

public class Rectangle {
    Point A;
    Point B;
    Point C;
    Point D;

    public Rectangle(){
        this.A = new Point(0,0);
        this.B = new Point(0,1);
        this.C = new Point(2,1);
        this.D= new Point(2,0);
    }   

    public Rectangle(Point A, Point B, Point C, Point D){
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }
    
    public double getWidth() {

        return A.distance(B);
    }

    public double getHeight() {
        return B.distance(C);
    }


    public double getArea() {
        return getWidth() * getHeight();
    }

    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }
    
    

}
