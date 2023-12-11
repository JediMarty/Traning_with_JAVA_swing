package train2;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Main extends JFrame{
	JButton button;
	Main() {
		
		JLabel label = new JLabel();
		ImageIcon img = new ImageIcon("snow.png");
		JTextField field = new JTextField();
		
		label.setIcon(img);
		label.setBackground(new Color(0x123456));
		label.setOpaque(true);
		
		button = new JButton();
		button.setText("paste");
		button.setBounds(100, 200, 200, 40);
		button.setFocusable(false);
		
		field.setBounds(100,100,200,50);
		
		this.setSize(400, 400);
		this.setResizable(false);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.cyan);
		this.setVisible(true);
		//this.add(label);
		this.add(button);
		this.add(field);
		
	}
	
	public static void main(String[] args) {
		
		new Main();
		

		}
	
}


