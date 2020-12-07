import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main {
	
	static String characterName = "";						//name entered by user 
	static int strengthValue;
	static int dexterityValue;
	static int constitutionValue;
	static int intelligenceValue;
	static int wisdomValue;
	static int charismaValue;
	
	public static void main(String[] args) {	
		SearchDB db = new SearchDB();
		DiceRoller diceRoller = DiceRoller.createInstance();		//Rolls the dice
		// JFrame = a GUI window to add components to
		
	     JFrame frame = new JFrame(); // creates a frame
		
	    //JTextFields
		
		//NAME TEXTFIELD
		JTextField characterNameField = new JTextField();              // textfield for name
		characterNameField.setPreferredSize(new Dimension(170, 25));   // textfield size
		characterNameField.setBounds(0, 0, 170, 25);                   // textfield position in panel
		
		//HitPoints TEXTFIELD
		JTextField HitPointsField = new JTextField();                  // textfield for HP 
		HitPointsField.setPreferredSize(new Dimension(0, 0));          // textfield size
		HitPointsField.setBounds(0, 0, 350, 100);                      // textfield position in panel
		
		//JPanels = a container to hold other components
		
		//NAME PANEL
		JPanel characterNamePanel = new JPanel();         // panel for name
		//characterNamePanel.setBackground(Color.red);    // for debugging
		characterNamePanel.setBounds(75,65,170,25);       // position in frame
		characterNamePanel.setLayout(new BorderLayout()); // needed to work properly
				
		//ATTRIBUTES PANEL
		JPanel attributesPanel = new JPanel();            // panel for attributes
		//attributesPanel.setBackground(Color.blue);      // for debugging
		attributesPanel.setBounds(0,200,200,750);         // position in frame
		attributesPanel.setLayout(new BorderLayout());    // needed to work properly
		
		//HitPoints PANEL
		JPanel HitPointsPanel = new JPanel();             // panel for name
		//characterNamePanel.setBackground(Color.red);    // for debugging
		HitPointsPanel.setBounds(350,274,233,30);         // position in frame
		HitPointsPanel.setLayout(new BorderLayout());     // needed to work properly
		
		//attribute text fields
		JTextField strengthField = new JTextField();
		strengthField.setPreferredSize(new Dimension(0, 0));
		strengthField.setBounds(79, 170, 20, 20);
		
		JTextField dexterityField = new JTextField();
		dexterityField.setPreferredSize(new Dimension(0, 0));
		dexterityField.setBounds(79, 244, 20, 20);
		
		JTextField constitutionField = new JTextField();
		constitutionField.setPreferredSize(new Dimension(0, 0));
		constitutionField.setBounds(79, 318, 20, 20);
		
		JTextField intelligenceField = new JTextField();
		intelligenceField.setPreferredSize(new Dimension(0, 0));
		intelligenceField.setBounds(79, 392, 20, 20);
		
		JTextField wisdomField = new JTextField();
		wisdomField.setPreferredSize(new Dimension(0, 0));
		wisdomField.setBounds(79, 466, 20, 20);
		
		JTextField charismaField = new JTextField();
		charismaField.setPreferredSize(new Dimension(0, 0));
		charismaField.setBounds(79, 540, 20, 20);
		
		//MENU 
		JMenuBar menubar = new JMenuBar();
		
		JMenu dice = new JMenu("Roll Dice");			  // Menu for dice rolling
		menubar.add(dice);
		
		JMenuItem die4 = new JMenuItem("Size 4");
		dice.add(die4);									 // roll four-sided die
		
		JMenuItem die6 = new JMenuItem("Size 6");		 // add dice rolling sizes
		dice.add(die6);
		
		JMenuItem die8 = new JMenuItem("Size 8");
		dice.add(die8);
		
		JMenuItem die10 = new JMenuItem("Size 10");
		dice.add(die10);
		
		JMenuItem die12 = new JMenuItem("Size 12");
		dice.add(die12);
		
		JMenuItem die20 = new JMenuItem("Size 20");
		dice.add(die20);
		
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
		frame.setLayout(null);      // needed to make other components work properly
		
		//ADD TO FRAME
		characterNamePanel.add(characterNameField);    // add name textfield to name panel
		frame.add(characterNamePanel); // add name panel to frame
		frame.add(strengthField);
		frame.add(dexterityField);
		frame.add(constitutionField);
		frame.add(intelligenceField);
		frame.add(wisdomField);
		frame.add(charismaField);
		frame.setJMenuBar(menubar);
		HitPointsPanel.add(HitPointsField);         // add name Hitpoints to Hitpoints panel
		frame.add(HitPointsPanel);                 // add hitpoints to frame
		frame.setJMenuBar(menubar);
		
		//Action Listeners
		
		characterNameField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				characterName = characterNameField.getText();
				System.out.println(characterName); //testing
			}
		});
		
		strengthField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = strengthField.getText();
				strengthValue = Integer.parseInt(input);
				System.out.println(strengthValue); //testing
			}
		});
		
		dexterityField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = dexterityField.getText();
				dexterityValue = Integer.parseInt(input);
				System.out.println(dexterityValue); //testing
			}
		});
		
		constitutionField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = constitutionField.getText();
				constitutionValue = Integer.parseInt(input);
				System.out.println(constitutionValue); //testing
			}
		});
		
		intelligenceField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = intelligenceField.getText();
				intelligenceValue = Integer.parseInt(input);
				System.out.println(intelligenceValue); //testing
			}
		});
		
		wisdomField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = wisdomField.getText();
				wisdomValue = Integer.parseInt(input);
				System.out.println(wisdomValue); //testing
			}
		});
		
		charismaField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = charismaField.getText();
				charismaValue = Integer.parseInt(input);
				System.out.println(charismaValue); //testing
			}
		});
		
		/*
		 * Action listener class for when the user 
		 * selects a die to roll from the menu
		 */
		class DiceAction implements ActionListener {
			
	    	@Override
	    	public void actionPerformed(ActionEvent e) {
	    		int roll;
	    		if(e.getSource() == die4) 
	    			roll = diceRoller.getRoll(4);
	    		else if (e.getSource() == die6)
	    			roll = diceRoller.getRoll(6);
	    		else if (e.getSource() == die8)
	    			roll = diceRoller.getRoll(8);
	    		else if (e.getSource() == die10)
	    			roll = diceRoller.getRoll(10);
	    		else if (e.getSource() == die12)
	    			roll = diceRoller.getRoll(12);
	    		else
	    			roll = diceRoller.getRoll(20);
	    		JOptionPane.showMessageDialog(null, "Roll: " + roll);
	    	}
	    }
		
		die4.addActionListener(new DiceAction());
		die6.addActionListener(new DiceAction());
		die8.addActionListener(new DiceAction());
		die10.addActionListener(new DiceAction());
		die12.addActionListener(new DiceAction());
		die20.addActionListener(new DiceAction());
	}
}
