//	Develop a GUI that receives an integer in one text field, and computes 
//	its factorial Value and returns it in another text field, when the 
//	button named “Compute” is clicked

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

public class FactorialGUI extends Frame implements ActionListener{
	
	Label l1 ;
	Label l2 ;
	Button b ;
	TextField t1;
	TextField t2;
	
	FactorialGUI(){
		setVisible(true);
		setSize(500,500);
		setTitle("Factorial");
		
		l1 = new Label("Enter Number : ");
		l2 = new Label("Factorial : ");
		t1 = new TextField(30);
		t2 = new TextField(30);
		t1.setBackground(Color.cyan);
		t2.setBackground(Color.GREEN);
		t2.setEditable(false);
		t1.setColumns(30);
		setLayout(new GridLayout(13, 2, 10, 10));
		b = new Button("COMPUTE");
		b.setBounds(300, 600, 20, 10);
		Panel p1 = new Panel(new FlowLayout(FlowLayout.LEFT));
		Panel p2 = new Panel(new FlowLayout(FlowLayout.LEFT));
		Panel p3 = new Panel(new FlowLayout(FlowLayout.LEFT));
		
		p1.add(l1);
		p1.add(t1);
		p2.add(l2);
		p2.add(t2);
		p3.add(b);
		b.addActionListener(this);
		
		add(p1);
		add(p2);
		add(p3);
		
		
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
	
	
	public static void main(String[] args) {
		new FactorialGUI();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		int a = Integer.parseInt(t1.getText());
		int fact = 1;
		for(int i = 1 ; i<=a ; i++) {
			fact*=i;
		}
		
		t2.setText(String.valueOf(fact));
				
	}


}
