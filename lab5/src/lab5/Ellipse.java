package lab5;

public class Ellipse {
	Point A;
	Point B;
	double distance;
	
	public Ellipse(Point A, Point B, double distance) {
    // getting the two foci
		this.A = A;
		this.B = B;
    this.distance = distance;
	}

  public Point get_center_point(){
	return new Point((B.x-A.x)/2, (B.y-A.y)/2);
  }

  public double get_center(){
    return Math.sqrt(Math.pow((A.x-B.x)/2, 2) + Math.pow((A.y-B.y)/2, 2));
  }

  public double get_semimajor() {
	  return this.distance/2;
  }
  
  public double get_semiminor() {
	  return Math.sqrt(Math.pow(this.get_semimajor(), 2) - Math.pow(this.get_center(), 2));
  }

  public double get_eccentricity(){
	double a = this.get_semimajor();
	double b = this.get_semiminor();
    return 1/a * Math.sqrt(Math.pow(a, 2) - Math.pow(b, 2));
  }
}
