package train2;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Main extends JFrame implements ActionListener{
	JButton button;
	JTextField field;
	JTextArea area;
	Main() {
		
		button = new JButton();
		JLabel label = new JLabel();
		ImageIcon img = new ImageIcon("snow.png");
		field = new JTextField();
		area = new JTextArea();
		
		label.setIcon(img);
		label.setBackground(new Color(0x123456));
		label.setOpaque(true);
		label.add(field);
		label.add(button);
		label.add(area);
		
		area.setVisible(false);
		area.setBounds(100,250,200,100);
		field.setBounds(100,100,200,50);
		
		button.setText("paste");
		button.setBounds(100, 200, 200, 40);
		button.setFocusable(false);
		button.addActionListener(this);
		
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

	@Override
	public void actionPerformed(ActionEvent e) {
	if (e.getSource() == button) {
		area.setVisible(true);
		try {
			File file = new File("e:/eclipse/eclipse workspace/train2/list.txt");
			Scanner scan = new Scanner(file);
			while(scan.hasNextLine()) {
				area.setText(scan.nextLine());
			}
			FileWriter write = new FileWriter("e:/eclipse/eclipse workspace/train2/list.txt",true);
			
			write.write(field.getText());
			write.close();
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		
	}
	
	}
	
	
}




