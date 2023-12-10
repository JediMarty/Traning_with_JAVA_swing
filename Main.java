package train2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class Main implements ActionListener{
	
	public static void main(String[] args) {
		
		ImageIcon image = new ImageIcon("snow.png");
		Border border = BorderFactory.createLineBorder(Color.BLUE, 6);
	    JButton button = new JButton();
		JTextField field = new JTextField();
	    
	    JLabel label = new JLabel();
		label.setText("Snowy!");
		label.setForeground(Color.black);
		label.setFont(new Font("Tahoma",Font.BOLD,40));
	    label.setIcon(image);
	    label.setVerticalTextPosition(JLabel.TOP);
	    label.setHorizontalTextPosition(JLabel.CENTER);
	    label.setVerticalAlignment(JLabel.TOP);
	    label.setHorizontalAlignment(JLabel.CENTER);
	    label.setBorder(border);
	
	    button.setBounds(100, 200, 200, 50);
	    button.setText("Click!");
	    button.setFocusable(false);
	    button.setBackground(Color.LIGHT_GRAY);
	    //button.addActionListener();
	    
	
	    field.setBounds(100, 200, 200, 50);
	    field.setHorizontalAlignment(JLabel.CENTER);
		field.setForeground(Color.black);
	    JFrame frame = new JFrame();
		
		frame.setTitle("Xmas-WishList");
		frame.setBackground(new Color(0x123456));
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.add(label);
		frame.pack();	
		frame.add(button);
        frame.add(field);
		
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}


