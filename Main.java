package train2;


import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Main extends JFrame{
	
	Main() {
		JButton button = new JButton();
		JLabel label = new JLabel();
		ImageIcon img = new ImageIcon("snow.png");
		JTextField field = new JTextField();
		JTextArea area = new JTextArea();
		
		label.setIcon(img);
		label.setBackground(new Color(0x123456));
		label.setOpaque(true);
		label.add(field);
		label.add(button);
		label.add(area);
		
		area.setBounds(100,250,200,100);
		field.setBounds(100,100,200,50);
		
		button.setText("paste");
		button.setBounds(100, 200, 200, 40);
		button.setFocusable(false);
		
		this.setTitle("list");
		this.setSize(400, 400);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(label);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new Main();
		

		}
	
}



