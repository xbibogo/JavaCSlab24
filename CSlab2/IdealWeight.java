//*********************************************************************
// IdealWeight.java
//
// Computes the ideal weight for both males and females. For males,
// the ideal weight is 106 pounds plus 6 pounds for every inch over
// 5 feet and for females it is 100 pounds plus 5 pounds for every 
// inch over 5 feet.
//*********************************************************************

import java.util.Scanner;

public class IdealWeight
{
    //---------------------------------------------------------
    // Read in a user's height and compute the ideal weight.
    //---------------------------------------------------------
    public static void main (String[] args)
    {
	final int INCHES_PER_FT = 12;
	final double PERCENT_ALLOWANCE = 0.15;

	int feet, inches;
	int totalInches;
	int femaleWt;
	int maleWt;
	int allowance;

	Scanner scan = new Scanner(System.in);

	System.out.println ("Please enter your height in feet and inches...");
	System.out.print ("Feet: ");
	feet = scan.nextInt();
	System.out.print ("Inches: ");
	inches = scan.nextInt();

	totalInches = feet * INCHES_PER_FT + inches;

	maleWt = 106 + 6 * (totalInches - 5 * INCHES_PER_FT);
	femaleWt = 100 + 5 * (totalInches - 5 * INCHES_PER_FT);

	System.out.println ("The ideal weight for a " + feet + " foot "
			    + inches + " male is " + maleWt + " pounds.");
	allowance = (int) (PERCENT_ALLOWANCE * maleWt);
	System.out.println ("A weight in the range " + (maleWt - allowance) +
			    " to " + (maleWt + allowance) + " is okay."); 
	System.out.println ("The ideal weight for a " + feet + " foot " +
			    inches + " female is " + femaleWt + " pounds.");
	allowance = (int) (PERCENT_ALLOWANCE * femaleWt);
	System.out.println ("A weight in the range " + (femaleWt - allowance) +
			    " to " + (femaleWt + allowance) + " is okay."); 
    }
}
