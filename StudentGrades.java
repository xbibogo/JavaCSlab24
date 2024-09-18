

public class StudentGrades
{
    //--------------------------------------------------------
    // Print the table with a border and aligned columns;
    // use the + operator to do arithmetic and concatenation.
    //--------------------------------------------------------
    public static void main (String[] args)
    {
	// Print border
	System.out.println ("///////////////////\\\\\\\\\\\\\\\\\\\\"
			    + "\\\\\\\\\\\\\\\\\\");
	System.out.println ("==          Student Points          ==");
	System.out.println ("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\////"
			    + "///////////////");
	System.out.println();

	// Print table
	System.out.println ("Name\t\tLab\tBonus\tTotal");
	System.out.println ("----\t\t---\t-----\t-----");
	System.out.println ("Joe\t\t43\t7\t" + (43 + 7));
	System.out.println ("William\t\t50\t8\t" + (50 + 8));
	System.out.println ("Mary Sue\t39\t10\t" + (39 + 10));
	System.out.println ("Sarah\t\t46\t9\t" + (46 + 9));
	System.out.println ("Hank\t\t35\t6\t" + (36 + 6));
    }
}

