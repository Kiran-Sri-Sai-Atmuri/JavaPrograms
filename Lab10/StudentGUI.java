//	Develop a GUI that receives Student info like Student Name, Age,  
//	Mail and writes data into file, when the button name “Register” is 
//	clicked

package javaLab.Lab10;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileWriter;
import java.io.IOException;

public class StudentGUI extends Frame implements ActionListener{
	
	Button b;
	TextField t1;
	TextField t2;
	TextField t3;
	
	

	public StudentGUI() {
		
		setVisible(true);
		setSize(500,500);
		setTitle("Student App");
		t1 = new TextField(30);
		t2 = new TextField(30);
		t3 = new TextField(30);
		t1.setBackground(Color.cyan);
		t2.setBackground(Color.GRAY);
		t3.setBackground(Color.GREEN);
		Label l1 = new Label("Enter Student Name  : ");
		Label l2 = new Label("Enter Student Age   : ");
		Label l3 = new Label("Enter Student Email : ");
		b = new Button("Register");
		b.addActionListener(this);
		Panel p1 = new Panel(new FlowLayout(FlowLayout.LEFT));
		Panel p2 = new Panel(new FlowLayout(FlowLayout.LEFT));
		Panel p3 = new Panel(new FlowLayout(FlowLayout.LEFT));
		Panel p4 = new Panel(new FlowLayout(FlowLayout.LEFT));
		
		setLayout(new GridLayout(9, 2, 10, 10));
		p1.add(l1);
		p1.add(t1);
		p2.add(l2);
		p2.add(t2);
		p3.add(l3);
		p3.add(t3);
		p4.add(b);
		
		
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		
		
		
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
		
	}

	public static void main(String[] args) {
		
		new StudentGUI();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b) {
			String name = t1.getText();
			int age = Integer.parseInt(t2.getText());
			String email = t3.getText();
			writeToFile(name , age , email);
		}
		
	}

	private void writeToFile(String name, int age, String email) {
		try {
			FileWriter fw  = new FileWriter("studentGUI.txt",true);
			fw.write(name + "," + age + "," + email + "\n");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

}
