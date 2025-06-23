package lab5;

public class Main {

	public static void main(String[] args){
    Ellipse myellipse = new Ellipse(new Point(0,0), new Point(6,8), 16);
    System.out.println("c_point : (" + myellipse.get_center_point().x + "," + myellipse.get_center_point().y + ")");
    System.out.println("c : " + myellipse.get_center());
    System.out.println("a : " + myellipse.get_semimajor());
   System.out.println("b : " +  myellipse.get_semiminor());
    System.out.println(myellipse.get_eccentricity());
  }
}
