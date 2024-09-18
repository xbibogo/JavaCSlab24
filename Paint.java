//**********************************************************
//  Paint.java
//
//  Determine how much paint is needed to paint the walls 
//  of a room given its length, width, and height
//**********************************************************
import java.util.Scanner;

public class Paint
{
    public static void main(String[] args)
    {
	final int COVERAGE = 350;  //paint covers 350 sq ft/gal
	final int DOOR_AREA = 20;  
	final int WINDOW_AREA = 15;

	Scanner scan = new Scanner(System.in);

        //declare integers length, width, and height;
	int length, width, height;

	// declare integers numDoors and numWindows
	int numDoors, numWindows;

        //declare double totalSqFt;
	double totalSqFt;

        //declare double paintNeeded;
	double paintNeeded;

        //Prompt for and read in the length of the room
	System.out.print ("Enter the length of the room: ");
	length = scan.nextInt();

        //Prompt for and read in the width of the room
	System.out.print ("Enter the width of the room: ");
	width = scan.nextInt();

        //Prompt for and read in the height of the room
	System.out.print ("Enter the height of the room: ");
	height = scan.nextInt();

	// Prompt for and read in the number of doors and windows
	System.out.print ("How many doors are in the room? ");
	numDoors = scan.nextInt();

	System.out.print ("How many windows are in the room? ");
	numWindows = scan.nextInt();

        //Compute the total square feet to be painted--think
        //about the dimensions of each wall
	totalSqFt = 2 * width * height + 2 * length * height;

	// Subtract off the area of the windows and doors
	totalSqFt = totalSqFt - numDoors * DOOR_AREA - numWindows * WINDOW_AREA;
 
        //Compute the amount of paint needed
	paintNeeded = totalSqFt / COVERAGE;

        //Print the length, width, and height of the room and the
        //number of gallons of paint needed.
	System.out.println();
	System.out.println (paintNeeded + " gallons of paint are needed to "
			    + "paint a room " + width + " feet wide by ");
	System.out.println(length + " feet long by " + height + " feet high with "
		   + numDoors + " doors and " + numWindows + " windows.");
    }
}
