//*****************************************************************
//  PieChart.java
//
//  Draws a pie chart showing percentage of household income
//  spent on various expenses.
//*****************************************************************

import javax.swing.JApplet;
import java.awt.*;

public class PieChart extends JApplet
{
    public void paint (Graphics page)
    {
	final int DEGREES_IN_CIRCLE = 360;
	final int APPLET_WIDTH = 600;
	final int APPLET_HEIGHT = 400;

	int x, y;          // corner point for the pie chart
	int diameter;      // diameter of the pie chart
	int startAngle;    // starting angle for a pie slice
	int arcAngle;      // arc angle for a pie slice

	diameter = 200;
	x = (APPLET_WIDTH - diameter)/2;
	y = (APPLET_HEIGHT - diameter)/2;

	setBackground (Color.white);

	// Draw rent and utilities slice
	page.setColor (Color.blue);
	startAngle = 0;
	arcAngle = (int) (0.35 * DEGREES_IN_CIRCLE);
	page.fillArc (x, y, diameter, diameter, startAngle, arcAngle);
	page.drawString ("Rent and Utilities (35%)", x + diameter - 15, y + 30);

	// Draw transportation slice
	page.setColor (Color.green);
	startAngle = startAngle + arcAngle;
	arcAngle = (int) (0.15 * DEGREES_IN_CIRCLE);
	page.fillArc (x, y, diameter, diameter, startAngle, arcAngle);
	page.drawString ("Transportation (15%)", x - 120, y + 50);

	// Draw food slice
	page.setColor (Color.cyan);
	startAngle = startAngle + arcAngle;
	arcAngle = (int) (0.15 * DEGREES_IN_CIRCLE);
	page.fillArc (x, y, diameter, diameter, startAngle, arcAngle);
	page.drawString ("Food (15%)", x - 70, y + 140);

	// Draw educational slice
	page.setColor (Color.red);
	startAngle = startAngle + arcAngle;
	arcAngle = (int) (0.25 * DEGREES_IN_CIRCLE);
	page.fillArc (x, y, diameter, diameter, startAngle, arcAngle);
	page.drawString ("Educational (25%)", x + 100, y + diameter + 20); 

	// Draw miscellaneous slice
	page.setColor (Color.orange);
	startAngle = startAngle + arcAngle;
	arcAngle = (int) (0.10 * DEGREES_IN_CIRCLE);
	page.fillArc (x, y, diameter, diameter, startAngle, arcAngle);
	page.drawString ("Miscellaneous (10%)", x + diameter, y + 150);
    }
}
