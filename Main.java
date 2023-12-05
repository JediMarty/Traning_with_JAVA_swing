package train2;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
		ImageIcon image = new ImageIcon("snow.png");
		Border border = BorderFactory.createLineBorder(Color.BLUE, 6);
		
		JLabel label = new JLabel();
		label.setText("Snowy!");
		label.setForeground(Color.white);
		label.setFont(new Font("Tahoma",Font.BOLD,40));
		label.setIcon(image);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBorder(border);
	    
	    
		JFrame frame = new JFrame();
		
		frame.setTitle("windowOne");
		frame.setSize(400,400);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(0x123456));
		
		frame.add(label);
		frame.pack();
	}

}

