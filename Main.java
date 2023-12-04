package train2;

import java.awt.Color;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		frame.setTitle("windowOne");
		frame.setSize(400,400);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.BLUE);
        //frame.getContentPane().setBackground(new Color(0x123456));
		
	}

}}
