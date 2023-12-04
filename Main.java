package train2;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		frame.setTitle("windowOne");
		frame.setSize(400,400);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(0x123456));
		
		//ImageIcon image = new ImageIcon("snow.png");
		
		JLabel label = new JLabel();
		label.setText("Snowy!");
		label.setForeground(Color.white);
		label.setFont(new Font("Tahoma",Font.BOLD,20));
	    //label.setIcon(image);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.TOP);
	    
		frame.add(label);
		
	}

}
