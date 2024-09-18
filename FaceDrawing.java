import javax.swing.*;
import java.awt.*;

public class FaceDrawing extends JPanel {

	@Override
	protected void paintComponent(Graphics page) {
		super.paintComponent(page); // Call the superclass method to ensure proper painting

		// Declare size constants
		final int PAGE_WIDTH = 600;
		final int PAGE_HEIGHT = 400;

		// Declare variables
		int x, y, x2, y2;    // x and y coordinates for locations of shapes
		int width, height; // width and height of each shape
		int startAngle, arcAngle; // start and sweep of arc

		// Set the background color
		setBackground(Color.blue);

		// Draw head
		page.setColor(Color.yellow);
		width = 170;
		height = 200;
		x = (PAGE_WIDTH - width) / 2;
		y = (PAGE_HEIGHT - height) / 2;
		page.fillOval(x, y, width, height);

		// Draw ears
		width = 40;
		height = 70;
		page.fillOval(x - 25, y + 70, width, height); // Left ear
		page.fillOval(x + 155, y + 70, width, height); // Right ear

		// Draw eyes with pupils
		page.setColor(Color.green);
		width = 30;
		height = 30;
		x = x + 40;
		y = y + 70;
		page.fillOval(x, y, width, height); // Left eye
		page.setColor(Color.black);
		page.fillOval(x + 7, y + 7, 16, 16); // Left pupil

		page.setColor(Color.green);
		x = x + 60;
		page.fillOval(x, y, width, height); // Right eye
		page.setColor(Color.black);
		page.fillOval(x + 7, y + 7, 16, 16); // Right pupil

		// Draw nose
		x = x - 15;
		y = y + 30;
		x2 = x - 10;
		y2 = y + 40;
		page.setColor(Color.black);
		page.drawLine(x, y, x2, y2); // First line of nose
		x = x2 + 10;
		y = y2 + 5;
		page.drawLine(x2, y2, x, y); // Second line of nose

		// Draw mouth
		page.setColor(Color.red);
		x = x - 40;
		width = 80;
		height = 30;
		startAngle = 180;
		arcAngle = 180;
		page.drawArc(x, y, width, height, startAngle, arcAngle);
	}

	public static void main(String[] args) {
		// Create a new JFrame
		JFrame frame = new JFrame("Face Drawing");

		// Set the size of the frame (window)
		frame.setSize(600, 400);

		// Add an instance of the FaceDrawing panel to the frame
		frame.add(new FaceDrawing());

		// Set the default close operation
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Make the frame visible
		frame.setVisible(true);
	}
}