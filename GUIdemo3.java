


           Experiment No:-8             
                                 Roll NO:-305





import javax.swing.*;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class GUIdemo3 extends JFrame implements ActionListener
{
	JTextField t1;
	JTextField t2;
	JTextField t3;
   GUIdemo3()
   {
	   
      JLabel l1=new JLabel("Name :");
	  l1.setBounds(100,100,100,40);
	  add(l1);
	  
	  JLabel l2=new JLabel("\nAddress :");
	  l2.setBounds(100,150,100,40);
	  add(l2);
	  
	  JLabel l3=new JLabel("\nContact No :");
	  l3.setBounds(100,200,100,40);
	  add(l3);
	  
	   t1=new JTextField(10);
	  t1.setBounds(200,100,100,40);
	  add(t1);
	  
	   t2=new JTextField(10);
	  t2.setBounds(200,150,100,40);
	  add(t2);
	  
	  t3=new JTextField(10);
	  t3.setBounds(200,200,100,40);
	  add(t3);
	  
      JButton b=new JButton("Submit");
	   b.setBackground(Color.RED);
	  b.setBounds(200,250,100,40);
	  add(b);
	  
	  JButton b1=new JButton("Edit");
	  b1.setBounds(320,250,100,40);
	  add(b1);
	  
	  JButton b2=new JButton("Cancel");
	  b2.setBackground(Color.RED);
	  b2.setBounds(440,250,100,40);
	  add(b2);
	  
	  b.addActionListener(this);
	  b1.addActionListener(this);
	  b2.addActionListener(this);
	  
	  getContentPane().setBackground( Color.WHITE);
	  setSize(600,700);
	  setLayout(null);
	  setVisible(true);
   }
   
   public void actionPerformed(ActionEvent ae)
{
	String str=t1.getText();
	String str1=t2.getText();
	String str2=t3.getText();
	try
		{
		FileOutputStream fout = new FileOutputStream("input.txt");
		byte b[]=str.getBytes();
		byte b1[]=str1.getBytes();
		byte b2[]=str2.getBytes();
		fout.write(b);
		fout.write(b1);
		fout.write(b2);
		fout.close();
		}
		catch(Exception x)
		{
			System.out.println(x);
		}
		System.out.println(" *****Data is written on file*****");
}
   
public static void main(String args[]) 
{
   	new  GUIdemo3();
}
}	
  	