import javax.swing.*;
import java.awt.*;

public class Colors extends JPanel {

	// Custom painting method
	@Override
	public void paintComponent(Graphics page) {
		super.paintComponent(page);  // Ensures proper painting behavior

		// Declare size constants
		final int PAGE_WIDTH = 600;
		final int PAGE_HEIGHT = 400;

		// Declare variables
		int x, y; // x and y coordinates of the upper-left corner of each shape
		int width, height; // width and height of each shape

		// Define a custom color
		Color myColor = new Color(2486921); // Custom color based on integer value
        //The integer 2486921 (in decimal) can be represented as 0x25FF59 in hexadecimal
		// Extract red, green, and blue components of the color
		int redCode = myColor.getRed();
		int greenCode = myColor.getGreen();
		int blueCode = myColor.getBlue();

		// Set the background color and fill the panel with white
		setBackground(Color.white);
		page.setColor(Color.white);
		page.fillRect(0, 0, PAGE_WIDTH, PAGE_HEIGHT);

		// Set the custom color for the rectangle
		page.setColor(myColor);

		// Assign the corner point and width and height, then draw the rectangle
		x = 200;
		y = 125;
		width = 200;
		height = 150;
		page.fillRect(x, y, width, height);

		// Set the color for the text and display the RGB values
		page.setColor(Color.black);
		page.drawString("Red: " + redCode, x + 20, y + 50);
		page.drawString("Green: " + greenCode, x + 20, y + 75);
		page.drawString("Blue: " + blueCode, x + 20, y + 100);
	}

	// Main method to create and display the window
	public static void main(String[] args) {
		// Create a new JFrame
		JFrame frame = new JFrame("Colors Example");

		// Set the size of the frame (window)
		frame.setSize(600, 400);

		// Add an instance of the Colors panel to the frame
		frame.add(new Colors());

		// Set default close operation
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Make the frame visible
		frame.setVisible(true);
	}
}