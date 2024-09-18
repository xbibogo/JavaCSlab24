import javax.swing.*;
import java.awt.*;

public class Coords extends JPanel {

	@Override
	public void paintComponent(Graphics page) {
		super.paintComponent(page); // Ensures the panel is cleared before drawing

		// Declare size constants
		final int MAX_SIZE = 300;
		final int PAGE_WIDTH = 600;
		final int PAGE_HEIGHT = 400;

		// Declare variables
		int x, y; // x and y coordinates of the upper-left corner of each shape
		int width, height; // width and height of each shape

		// Set the background color
		setBackground(Color.yellow);

		// Set the color for the middle rectangle
		page.setColor(Color.blue);

		// Assign the corner point and width and height of the middle rectangle
		x = PAGE_WIDTH / 2 - 75;
		y = PAGE_HEIGHT / 2 - 50;
		width = 150;
		height = 100;
		page.fillRect(x, y, width, height);

		// Assign color and corner point for the upper-left rectangle
		page.setColor(Color.red);
		x = 0;
		y = 0;
		page.fillRect(x, y, width, height);

		// Assign color and corner point for the upper-right rectangle
		page.setColor(Color.black);
		x = PAGE_WIDTH - 150;
		y = 0;
		page.fillRect(x, y, width, height);

		// Assign color and corner point for the lower-left rectangle
		page.setColor(Color.green);
		x = 0;
		y = PAGE_HEIGHT - 100;
		page.fillRect(x, y, width, height);

		// Assign color and corner point for the lower-right rectangle
		page.setColor(Color.magenta);
		x = PAGE_WIDTH - 150;
		y = PAGE_HEIGHT - 100;
		page.fillRect(x, y, width, height);
	}

	// Main method to create the window and add the custom panel
	public static void main(String[] args) {
		// Create a new JFrame
		JFrame frame = new JFrame("Coordinates Example");

		// Set the size of the frame (window)
		frame.setSize(600, 400);

		// Add an instance of the Coords panel to the frame
		frame.add(new Coords());

		// Set default close operation
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Make the frame visible
		frame.setVisible(true);
	}
}


