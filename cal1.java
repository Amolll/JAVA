import javax.swing.*;
import java.awt.event.*;
 class cal1 extends JFrame implements ActionListener
{
	JTextField t1;
	JButton one,two,three,four,five,six,seven,eight,nine,zero;
	JButton plus,minus,mul,div,equal,ce,dot,avg;
	static int a=0,b=0,result=0;
    static int ch=0;
	cal1()
	{
		t1=new JTextField(10);
		one=new JButton("1");
		two=new JButton("2");
		three=new JButton("3");
		four=new JButton("4");
		five=new JButton("5");
		six=new JButton("6");
		seven=new JButton("7");
		eight=new JButton("8");
		nine=new JButton("9");
		zero=new JButton("0");
		plus=new JButton("+");
		minus=new JButton("-");
		mul=new JButton("*");
		div=new JButton("/");
		equal=new JButton("=");
		ce=new JButton("ce");
		dot=new JButton("dot");
		avg=new JButton("avg");
		
		t1.setBounds(30,40,280,30);
		one.setBounds(40,240,50,40);
		two.setBounds(110,240,50,40);
		three.setBounds(180,240,50,40);
		four.setBounds(40,170,50,40);
		five.setBounds(110,170,50,40);
		six.setBounds(180,170,50,40);
		seven.setBounds(40,100,50,40);
		eight.setBounds(110,100,50,40);
		nine.setBounds(180,100,50,40);
		zero.setBounds(110,310,50,40);
		plus.setBounds(250,310,50,40);
		minus.setBounds(250,240,50,40);
		mul.setBounds(250,170,50,40);
		div.setBounds(250,100,50,40);
		equal.setBounds(180,310,50,40);
		ce.setBounds(40,310,50,40);
		dot.setBounds(40,380,50,40);
		avg.setBounds(110,380,50,40);
		
		add(t1);
		add(one);
		add(two);
		add(three);
		add(four);
		add(five);
		add(six);
		add(seven);
		add(eight);
		add(nine);
		add(zero);
		add(plus);
		add(minus);
		add(mul);
		add(div);
		add(equal);
		add(ce);
		add(dot);
		add(avg);
		
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		zero.addActionListener(this);
		plus.addActionListener(this);
		minus.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		equal.addActionListener(this);
		ce.addActionListener(this);
		dot.addActionListener(this);
		avg.addActionListener(this);
		
		
		setSize(400,500);
	    setLayout(null);
	     setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==one)
		{
		t1.setText(t1.getText()+("1"));
		}
		if(ae.getSource()==two)
		{
		t1.setText(t1.getText()+("2"));
		}
		if(ae.getSource()==three)
		{
		t1.setText(t1.getText()+("3"));
		}
		if(ae.getSource()==four)
		{
		t1.setText(t1.getText()+("4"));
		}
		if(ae.getSource()==five)
		{
		t1.setText(t1.getText()+("5"));
		}
		if(ae.getSource()==six)
		{
		t1.setText(t1.getText()+("6"));
		}
		if(ae.getSource()==seven)
		{
		t1.setText(t1.getText()+("7"));
		}
		if(ae.getSource()==eight)
		{
		t1.setText(t1.getText()+("8"));
		}
		if(ae.getSource()==nine)
		{
		t1.setText(t1.getText()+("9"));
		}
		if(ae.getSource()==zero)
		{
		t1.setText(t1.getText()+("0"));
		}
		
		 if(ae.getSource()==plus)
        {
            a=Integer.parseInt(t1.getText());
            ch=1;
            t1.setText("");
        } 
		if(ae.getSource()==minus)
        {
            a=Integer.parseInt(t1.getText());
            ch=2;
            t1.setText("");
        } 
		if(ae.getSource()==mul)
        {
            a=Integer.parseInt(t1.getText());
            ch=3;
            t1.setText("");
        } 
		if(ae.getSource()==div)
        {
            a=Integer.parseInt(t1.getText());
            ch=4;
            t1.setText("");
        } 
		if(ae.getSource()==equal)
        {
            b=Integer.parseInt(t1.getText());
            switch(ch)
            {
                case 1: result=a+b;
                    break;
        
                case 2: result=a-b;
                    break;
        
                case 3: result=a*b;
                    break;
        
                case 4: result=a/b;
                    break;
        
                default: result=0;
            }
            t1.setText(""+result);
        } 
		if(ae.getSource()==ce)
            t1.setText("");
	}
	
    public static void main(String args[]) 
    {
		
     	new  cal1();
    }
}