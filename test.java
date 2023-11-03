public class test {
public static void main(String[] args) {
  
//creates object
Triangle my = new Triangle(1,1.5,1,"yellow", true);

//calls method to get the area 
System.out.println("The area of triangle is " +my.getArea());

//calls method to get the perimeter 
System.out.println("The perimeter of triangle is " +my.getPerimeter());

//calls getter method getColor()
System.out.println("The color of the triangle is " +my.getColor());

//calls getter method isFilled()
System.out.println("Triangle is filled? " +my.isFilled());
}
}