import javax.swing.*;
import java.awt.*;

public class Shapes extends JPanel {

	// Custom paint method for drawing shapes
	@Override
	public void paintComponent(Graphics page) {
		super.paintComponent(page);

		// Declare size constants
		final int MAX_SIZE = 300;
		final int PAGE_WIDTH = 600;
		final int PAGE_HEIGHT = 400;

		// Declare variables
		int x, y; // x and y coordinates of upper-left corner of each shape
		int width, height; // width and height of each shape

		// Set the background color
		setBackground(Color.yellow);

		// Set the color for the first rectangle
		page.setColor(Color.blue);

		// Assign the corner point and width and height
		x = 400;
		y = 40;
		width = 50;
		height = 200;
		page.fillRect(x, y, width, height);

		// Set the color for an oval inside the first rectangle
		page.setColor(Color.magenta);

		// Assign the corner point and width and height
		x = 410;
		y = 50;
		width = 30;
		height = 180;
		page.fillOval(x, y, width, height);

		// Set the color for a rectangle overlapping the first rectangle
		page.setColor(Color.green);

		// Assign the corner point and width and height
		x = 350;
		y = 20;
		width = 55;
		height = 25;
		page.fillRect(x, y, width, height);

		// Set the color for an oval not overlapping any of the other shapes
		page.setColor(Color.pink);

		// Assign the corner point and width and height
		x = 20;
		y = 100;
		width = 100;
		height = 100;
		page.fillOval(x, y, width, height);
	}

	// Main method to run the program
	public static void main(String[] args) {
		// Create a new JFrame window
		JFrame frame = new JFrame("Shapes Drawing");

		// Set the window's size
		frame.setSize(600, 400);

		// Add an instance of the Shapes panel
		frame.add(new Shapes());

		// Set default close operation
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Make the window visible
		frame.setVisible(true);
	}
}