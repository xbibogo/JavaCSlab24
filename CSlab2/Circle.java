//**********************************************************
//  Circle.java
//
//  Print the area of a circle with two different radii
//**********************************************************
import java.util.Scanner;

public class Circle
{
    public static void main(String[] args)
    {
     final double PI = 3.14159;
     
     int radius;
     double area1, area2;
     double circumference1, circumference2;
     Scanner scan = new Scanner(System.in);

     // Prompt for and read in the radius
     System.out.print ("Please enter a value for the radius: ");
     radius = scan.nextInt();

     // Calculate area and circumference and print the results
     area1 = PI * radius * radius;
     circumference1 = 2 * PI * radius;

     System.out.println("The area of a circle with radius " + radius +
                        " is " + area1);
     System.out.println ("The circumference of a circle with radius " +
			 radius + " is " + circumference1);

     // Double the radius then calculate area and circumference
     radius = 2 * radius;
     area2 = PI * radius * radius;
     circumference2 = 2 * PI * radius;

     System.out.println("The area of a circle with radius " + radius +
                        " is " + area2);
     System.out.println ("The circumference of a circle with radius " +
			 radius + " is " + circumference2);

     // Print the change in area and circumference
     System.out.println ("The change in area when the radius doubles is " +
			 area2/area1 + ".");
     System.out.println ("The change in circumference is " +
			 circumference2/circumference1 + ".");
    }
}
