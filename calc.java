import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class calc extends Applet implements ActionListener
{
	String msg="",flag="";
	int i=0,j=0;
	Button one,two,three,four,five,six,seven,eight,nine,zero;
	Button plus,minus,mul,div,equal,ce;
	TextField text;
	//Button blist=new Button[10];
	public void init()
	{
		setLayout(null);
		one=new Button("1");
		two=new Button("2");
		three=new Button("3");
		four=new Button("4");
		five=new Button("5");
		six=new Button("6");
		seven=new Button("7");
		eight=new Button("8");
		nine=new Button("9");
		zero=new Button("0");
		plus=new Button("+");
		minus=new Button("-");
		mul=new Button("*");
		div=new Button("/");
		equal=new Button("=");
		ce=new Button("c");
		
		one.setBounds(200,200,20,20);
		two.setBounds(230,200,20,20);
		three.setBounds(260,200,20,20);
		four.setBounds(200,230,20,20);
		five.setBounds(230,230,20,20);
		six.setBounds(260,230,20,20);
		seven.setBounds(200,260,20,20);
		eight.setBounds(230,260,20,20);
		nine.setBounds(260,260,20,20);
		zero.setBounds(200,290,20,20);
		
		plus.setBounds(290,200,20,20);
		minus.setBounds(290,230,20,20);
		mul.setBounds(290,260,20,20);
		div.setBounds(290,290,20,20);
		equal.setBounds(260,290,20,20);
		ce.setBounds(230,290,20,20);
		
		text=new TextField(10);
		text.setBounds(200,170,110,20);
		add(zero);
		add(one);
		add(two);
		add(three);
		add(four);
		add(five);
		add(six);
		add(seven);
		add(eight);
		add(nine);
		add(plus);
		add(minus);
		add(mul);
		add(div);
		add(equal);
		add(ce);
		add(text);
		for(int i=0;i<=10;i++)
			//blist[i].addActionListener(this);
			plus.addActionListener(this);
			minus.addActionListener(this);
			mul.addActionListener(this);
			div.addActionListener(this);
			equal.addActionListener(this);
			ce.addActionListener(this);
			text.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();
		if(str.equals("1"))
			i=i*10+1;
		else if(str.equals("2"))
			i=i*10+2;
		else if(str.equals("3"))
			i=i*10+3;
		else if(str.equals("4"))
			i=i*10+4;
		else if(str.equals("5"))
			i=i*10+5;
		else if(str.equals("6"))
			i=i*10+6;
		else if(str.equals("7"))
			i=i*10+7;
		else if(str.equals("8"))
			i=i*10+8;
		else if(str.equals("9"))
			i=i*10+9;
		else if(str.equals("0"))
			i=i*10+0;
		
		
		
		if(str.equals("="))
		{
			if(flag.equals("+"))
				i+=j;
			if(flag.equals("-"))
				i=j-1;
			if(flag.equals("*"))
				i*=j;
			if(flag.equals("/"))
				i=j/i;
		}
		
		if(str.equals("+"))
		{
			if(flag.equals("+"))
			{i+=j;j=i;
		}
		else
		
		{j=i;i=0;
		}
		flag="+";
		}
		if(str.equals("-"))
		{
			if(flag.equals("-"))
			{
				i=j-i;j=i;
			}
			else
			{
				j=i;i=0;
			}
			flag="-";
		}
		if(str.equals("*"))
		{
			if(flag.equals("*"))
			{
				i*=j;j=i;
			}
			else
			{
				j=i;i=0;
			}
			flag="*";
		}
		if(str.equals("/"))
		{
		   if(flag.equals("/"))
			{
				i=j/i;j=i;
			}	
			else
			{
				j=i;i=0;
			}
			flag="/";
		}
		if(str.equals("c"))
		{
			i=0;j=0;flag="";
		}
		text.setText(i+"");
		if(str.equals("="))
			i=0;
		repaint();
		
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,100,100);
	}
}