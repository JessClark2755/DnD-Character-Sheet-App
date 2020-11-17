import java.awt.*;
import javax.swing.*;

public class Main {
	
	public static void main(String[] args) {	
		
		
		//JTextFields
		
		//NAME TEXTFIELD
		JTextField characterNameField = new JTextField();              // textfield for name
		characterNameField.setPreferredSize(new Dimension(170, 25));   // textfield size
		characterNameField.setBounds(0, 0, 170, 25);                   // textfield position in panel
		
		
		
		//JPanels = a container to hold other components
		
		//NAME PANEL
		JPanel characterNamePanel = new JPanel();         // panel for name
		//characterNamePanel.setBackground(Color.red);    // for debugging
		characterNamePanel.setBounds(100,90,170,25);      // position in frame
		characterNamePanel.setLayout(new BorderLayout()); // needed to work properly
				
		//ATTRIBUTES PANEL
		JPanel attributesPanel = new JPanel();            // panel for attributes
		//attributesPanel.setBackground(Color.blue);      // for debugging
		attributesPanel.setBounds(0,200,200,750);         // position in frame
		attributesPanel.setLayout(new BorderLayout());    // needed to work properly
		
		
		
		// JFrame = a GUI window to add components to
		
		JFrame frame = new JFrame(); // creates a frame
		
		//TITLE LINE
		frame.setTitle("D&D Character Sheet");                  // sets title of frame
		ImageIcon frameLogo = new ImageIcon("d&d logo0.png");   // create an ImageIcon
		frame.setIconImage(frameLogo.getImage());               // change icon of frame
		
		//BACKGROUND
		ImageIcon backgroundImage = new ImageIcon("characterSheetResized.png");                              // create ImageIcon
		BackgroundPanel bgPanel = new BackgroundPanel(backgroundImage.getImage(), BackgroundPanel.SCALED);   // create background with image
		frame.setContentPane(bgPanel);                                                                       // place background in frame
		frame.getContentPane().setBackground(Color.gray);                                                    // change background color of frame
		
		//DIMENSIONS AND SIZING
		frame.setResizable(false); //prevent resizing frame
		frame.setSize(950, 1200);  //sets x and y dimension of frame		
		 
		//FRAME SETTINGS
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit application on exit button
		frame.setVisible(true);                               // makes frame visible
		frame.setLayout(null);                                // needed to make other components work properly		
		
		//ADD TO FRAME
		characterNamePanel.add(characterNameField);    // add name textfield to name panel
		frame.add(characterNamePanel);                 // add name panel to frame
		//frame.add(attributesPanel);
		
	}
}
