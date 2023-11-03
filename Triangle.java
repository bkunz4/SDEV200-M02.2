public class Triangle extends GeometricObject {

//data fields
  double side1 = 1.0;
  double side2 = 1.0;
  double side3 = 1.0;

//no-arg constructor that creates a default triangle
  public Triangle(double side1, double side2, double side3) {
    super();
    side1 = 1.0;
    side2 = 1.0;
    side3 = 1.0;
  }

//constructor that creates a rectangle with the specified sides
  public Triangle(double a, double b, double c, String color, boolean filled) {
    super(color, filled);
    side1 = a;
    side2 = b;
   side3 = c;
  }

//getter method for side1
  public double getSide1() {
    return side1;
  }

//setter method for side1
  public void setSide1(double side1) {
    this.side1 = side1;
  }

//getter method for side2
  public double getSide2() {
    return side2;
  }  

//setter method for side2
  public void setSide2(double side2) {
    this.side2 = side2;
  }

//getter method for side3
  public double getSide3() {
   return side3;
  }

//setter method for side3
  public void setSide3(double side3) {
    this.side3 = side3;
  }

  public void show() {
   System.out.println(side1+","+side2+","+side3+",");
  }

//method to calculate area of triangle
  public double getArea(){
    double s=(side1+side2+side3)/2;
    double area=s*(s-side1)*(s-side2)*(s-side3);
    return area;
  }

//method to calculate perimeter of triangle
  public double getPerimeter(){
   return (side1 + side2 + side3);
  }

//toString method that returns string representing sides of triangle
  public String toString() {
    super.toString();
    return "Triangle: side1 = " + side1 + " side2 = " + side2 +
    " side3 = " + side3;
      
  }
}
