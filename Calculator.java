import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Calculator extends JFrame implements ActionListener,MouseListener
{
	//variables
	double value1,value2,answer,memory;
	String equation="",operator,Text="";
	int length;
	
	//Buttons
	JButton point = new JButton(".");
	JButton zero = new JButton("0");
	JButton one = new JButton("1");
	JButton two = new JButton("2");
	JButton three = new JButton("3");
	JButton four = new JButton("4");
	JButton five = new JButton("5");
	JButton six = new JButton("6");
	JButton seven = new JButton("7");
	JButton eight = new JButton("8");
	JButton nine = new JButton("9");
	JButton equal = new JButton("=");
	
	JButton add = new JButton("+");
	JButton sub = new JButton("-");
	JButton mul = new JButton("*");
	JButton div = new JButton("/");
	
	JButton square = new JButton("x^2");
	JButton inverse = new JButton("1/x");
	JButton percentage = new JButton("%");
	JButton off = new JButton("OFF");
	
	JButton memoryClear = new JButton("MC");
	JButton memoryRecall = new JButton("MR");
	JButton memoryPlus = new JButton("M+");
	JButton memoryMinus = new JButton("M-");
	
	JButton clear = new JButton("C");
	JButton backspace = new JButton("<--");
	JButton history = new JButton("HISTORY");
	
	//Display
	JTextField Equation = new JTextField();
	JTextField Result = new JTextField();
	public Calculator()
	{
		this.setSize(325,500);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.getContentPane().setBackground(Color.WHITE);
		this.setVisible(true);	
		this.setTitle("Calculator v4.17");
		
//Button SetUp
		point.setBounds(0,420,80,50);
		point.setFont(new Font("Conthrax Sb",Font.BOLD,34));
		point.setBackground(new Color(240,240,240));
		point.setFocusable(false);
		point.addActionListener(this);
		point.addMouseListener(this);
		point.setBorder(null);
		this.add(point);
		
		zero.setBounds(80,420,80,50);
		zero.setFont(new Font("Conthrax Sb",Font.BOLD,24));
		zero.setBackground(new Color(255,255,255));
		zero.setFocusable(false);
		zero.addActionListener(this);
		zero.addMouseListener(this);
		zero.setBorder(null);
		this.add(zero);
		
		equal.setBounds(160,420,80,50);
		equal.setFont(new Font("Conthrax Sb",Font.BOLD,24));
		equal.setBackground(new Color(240,240,240));
		equal.setFocusable(false);
		equal.addActionListener(this);
		equal.addMouseListener(this);
		equal.setBorder(null);
		this.add(equal);
		
		add.setBounds(240,420,80,50);
		add.setFont(new Font("Conthrax Sb",Font.BOLD,24));
		add.setBackground(new Color(230,230,230));
		add.setFocusable(false);
		add.addActionListener(this);
		add.addMouseListener(this);
		add.setBorder(null);
		this.add(add);
		
		one.setBounds(0,370,80,50);
		one.setFont(new Font("Conthrax Sb",Font.BOLD,24));
		one.setBackground(new Color(255,255,255));
		one.setFocusable(false);
		one.addActionListener(this);
		one.addMouseListener(this);
		one.setBorder(null);
		this.add(one);
		
		two.setBounds(80,370,80,50);
		two.setFont(new Font("Conthrax Sb",Font.BOLD,24));
		two.setBackground(new Color(255,255,255));
		two.setFocusable(false);
		two.addActionListener(this);
		two.addMouseListener(this);
		two.setBorder(null);
		this.add(two);		
		
		three.setBounds(160,370,80,50);
		three.setFont(new Font("Conthrax Sb",Font.BOLD,24));
		three.setBackground(new Color(255,255,255));
		three.setFocusable(false);
		three.addActionListener(this);
		three.addMouseListener(this);
		three.setBorder(null);
		this.add(three);		
		
		sub.setBounds(240,370,80,50);
		sub.setFont(new Font("Conthrax Sb",Font.BOLD,24));
		sub.setBackground(new Color(230,230,230));
		sub.setFocusable(false);
		sub.addActionListener(this);
		sub.addMouseListener(this);
		sub.setBorder(null);
		this.add(sub);	
		
		four.setBounds(0,320,80,50);
		four.setFont(new Font("Conthrax Sb",Font.BOLD,24));
		four.setBackground(new Color(255,255,255));
		four.setFocusable(false);
		four.addActionListener(this);
		four.addMouseListener(this);
		four.setBorder(null);
		this.add(four);
		
		five.setBounds(80,320,80,50);
		five.setFont(new Font("Conthrax Sb",Font.BOLD,24));
		five.setBackground(new Color(255,255,255));
		five.setFocusable(false);
		five.addActionListener(this);
		five.addMouseListener(this);
		five.setBorder(null);
		this.add(five);		
		
		six.setBounds(160,320,80,50);
		six.setFont(new Font("Conthrax Sb",Font.BOLD,24));
		six.setBackground(new Color(255,255,255));
		six.setFocusable(false);
		six.addActionListener(this);
		six.addMouseListener(this);
		six.setBorder(null);
		this.add(six);		
		
		mul.setBounds(240,320,80,50);
		mul.setFont(new Font("Conthrax Sb",Font.BOLD,24));
		mul.setBackground(new Color(230,230,230));
		mul.setFocusable(false);
		mul.addActionListener(this);
		mul.addMouseListener(this);
		mul.setBorder(null);
		this.add(mul);		
		
		seven.setBounds(0,270,80,50);
		seven.setFont(new Font("Conthrax Sb",Font.BOLD,24));
		seven.setBackground(new Color(255,255,255));
		seven.setFocusable(false);
		seven.addActionListener(this);
		seven.addMouseListener(this);
		seven.setBorder(null);
		this.add(seven);
		
		eight.setBounds(80,270,80,50);
		eight.setFont(new Font("Conthrax Sb",Font.BOLD,24));
		eight.setBackground(new Color(255,255,255));
		eight.setFocusable(false);
		eight.addActionListener(this);
		eight.addMouseListener(this);
		eight.setBorder(null);
		this.add(eight);		
		
		nine.setBounds(160,270,80,50);
		nine.setFont(new Font("Conthrax Sb",Font.BOLD,24));
		nine.setBackground(new Color(255,255,255));
		nine.setFocusable(false);
		nine.addActionListener(this);
		nine.addMouseListener(this);
		nine.setBorder(null);
		this.add(nine);		
		
		div.setBounds(240,270,80,50);
		div.setFont(new Font("Conthrax Sb",Font.BOLD,24));
		div.setBackground(new Color(230,230,230));
		div.setFocusable(false);
		div.addActionListener(this);
		div.addMouseListener(this);
		div.setBorder(null);
		this.add(div);			
		
		off.setBounds(0,120,80,50);
		off.setFont(new Font("Conthrax Sb",Font.BOLD,14));
		off.setBackground(new Color(255,155,55));
		off.setFocusable(false);
		off.addActionListener(this);
		off.addMouseListener(this);
		off.setBorder(null);
		this.add(off);
		
		percentage.setBounds(0,220,80,50);
		percentage.setFont(new Font("Conthrax Sb",Font.PLAIN,24));
		percentage.setBackground(new Color(255,155,55));
		percentage.setFocusable(false);
		percentage.addActionListener(this);
		percentage.addMouseListener(this);
		percentage.setBorder(null);
		this.add(percentage);		
		
		square.setBounds(80,220,80,50);
		square.setFont(new Font("Conthrax Sb",Font.BOLD,16));
		square.setBackground(new Color(255,155,55));
		square.setFocusable(false);
		square.addActionListener(this);
		square.addMouseListener(this);
		square.setBorder(null);
		this.add(square);		
		
		inverse.setBounds(160,220,80,50);
		inverse.setFont(new Font("Conthrax Sb",Font.BOLD,24));
		inverse.setBackground(new Color(255,155,55));
		inverse.setFocusable(false);
		inverse.addActionListener(this);
		inverse.addMouseListener(this);
		inverse.setBorder(null);
		this.add(inverse);		
		
		clear.setBounds(80,120,80,50);
		clear.setFont(new Font("Conthrax Sb",Font.BOLD,24));
		clear.setBackground(new Color(255,155,55));
		clear.setFocusable(false);
		clear.addActionListener(this);
		clear.addMouseListener(this);
		clear.setBorder(null);
		this.add(clear);
		
		backspace.setBounds(240,220,80,50);
		backspace.setFont(new Font("Conthrax Sb",Font.BOLD,24));
		backspace.setBackground(new Color(255,155,55));
		backspace.setFocusable(false);
		backspace.addActionListener(this);
		backspace.addMouseListener(this);
		backspace.setBorder(null);
		this.add(backspace);		
		
		history.setBounds(160,120,160,50);
		history.setFont(new Font("Conthrax Sb",Font.BOLD,20));
		history.setBackground(new Color(250,150,0));
		history.setFocusable(false);
		history.addActionListener(this);
		history.addMouseListener(this);
		history.setBorder(null);
		this.add(history);	
		
		memoryClear.setBounds(0,170,80,50);
		memoryClear.setFont(new Font("Conthrax Sb",Font.BOLD,20));
		memoryClear.setBackground(new Color(255,155,55));
		memoryClear.setFocusable(false);
		memoryClear.addActionListener(this);
		memoryClear.addMouseListener(this);
		memoryClear.setBorder(null);
		this.add(memoryClear);
		
		memoryRecall.setBounds(80,170,80,50);
		memoryRecall.setFont(new Font("Conthrax Sb",Font.BOLD,20));
		memoryRecall.setBackground(new Color(255,155,55));
		memoryRecall.setFocusable(false);
		memoryRecall.addActionListener(this);
		memoryRecall.addMouseListener(this);
		memoryRecall.setBorder(null);
		this.add(memoryRecall);		
		
		memoryPlus.setBounds(160,170,80,50);
		memoryPlus.setFont(new Font("Conthrax Sb",Font.BOLD,24));
		memoryPlus.setBackground(new Color(255,155,55));
		memoryPlus.setFocusable(false);
		memoryPlus.addActionListener(this);
		memoryPlus.addMouseListener(this);
		memoryPlus.setBorder(null);
		this.add(memoryPlus);		
		
		memoryMinus.setBounds(240,170,80,50);
		memoryMinus.setFont(new Font("Conthrax Sb",Font.BOLD,24));
		memoryMinus.setBackground(new Color(255,155,55));
		memoryMinus.setFocusable(false);
		memoryMinus.addActionListener(this);
		memoryMinus.addMouseListener(this);
		memoryMinus.setBorder(null);
		this.add(memoryMinus);
		
//Display setup
		Equation.setBounds(10,0,300,40);
		Equation.setFont(new Font("Impact",Font.PLAIN,24));
		Equation.setBackground(new Color(240,240,240));
		Equation.setEditable(false);
		Equation.setBorder(null);
		Equation.setBackground(Color.white);
		Equation.setForeground(Color.black);
		this.add(Equation);
		
		Result.setBounds(10,40,300,80);
		Result.setFont(new Font("Impact",Font.PLAIN,40));
		Result.setBackground(new Color(240,240,240));
		Result.setEditable(false);
		Result.setBorder(null);
		Result.setBackground(Color.white);
		Result.setForeground(Color.black);
		this.add(Result);
		
	}//end of constructor
	
	public void mouseClicked(MouseEvent event){}//end of MouseClicked	
	public void mousePressed(MouseEvent event){}//end of MousePressed
	public void mouseReleased(MouseEvent event){}//end of MouseReleased
	
	public void mouseEntered(MouseEvent event)
	{
		if(event.getSource()==zero || event.getSource()==one || event.getSource()==two || event.getSource()==three || event.getSource()==four || event.getSource()==five || event.getSource()==six || event.getSource()==seven || event.getSource()==eight || event.getSource()==nine)
		{
			JButton button = (JButton)event.getSource();
			button.setBackground(new Color(225,225,225));
		}
		else if(event.getSource()==off)
		{
			JButton button = (JButton)event.getSource();
			button.setBackground(new Color(255,90,75));
		}
		else if(event.getSource()==history)
		{
			JButton button = (JButton)event.getSource();
			button.setBackground(new Color(50,50,100));
		}
		else if(event.getSource()==clear)
		{
			JButton button = (JButton)event.getSource();
			button.setBackground(new Color(25,175,175));
		}
		else if(event.getSource()==point)
		{
			JButton button = (JButton)event.getSource();
			button.setBackground(new Color(255,255,255));
		}
		else if(event.getSource()==equal)
		{
			JButton button = (JButton)event.getSource();
			button.setBackground(new Color(100,250,100));
		}
		else if(event.getSource()==add || event.getSource()==sub || event.getSource()==mul || event.getSource()==div)
		{
			JButton button = (JButton)event.getSource();
			button.setBackground(new Color(150,200,250));
		}
		else if(event.getSource()==memoryClear || event.getSource()==memoryRecall || event.getSource()==memoryPlus || event.getSource()==memoryMinus || event.getSource()==backspace || event.getSource()==inverse || event.getSource()==square || event.getSource()==percentage)
		{
			JButton button = (JButton)event.getSource();
			button.setBackground(new Color(0,80,160));
		}
	}//end of MouseEntered
	
	public void mouseExited(MouseEvent event)
	{
		if(event.getSource()==zero || event.getSource()==one || event.getSource()==two || event.getSource()==three || event.getSource()==four || event.getSource()==five || event.getSource()==six || event.getSource()==seven || event.getSource()==eight || event.getSource()==nine)
		{
			JButton button = (JButton)event.getSource();
			button.setBackground(new Color(255,255,255));
		}
		
		else if(event.getSource()==off || event.getSource()==clear || event.getSource()==history || event.getSource()==memoryClear || event.getSource()==memoryRecall || event.getSource()==memoryPlus || event.getSource()==memoryMinus || event.getSource()==backspace || event.getSource()==percentage || event.getSource()==square || event.getSource()==inverse)
		{
			JButton button = (JButton)event.getSource();
			button.setBackground(new Color(255,155,55));
		}
		
		else if(event.getSource()==equal || event.getSource()==point)
		{
			JButton button = (JButton)event.getSource();
			button.setBackground(new Color(240,240,240));
		}
		
		else if(event.getSource()==add || event.getSource()==sub || event.getSource()==mul || event.getSource()==div)
		{
			JButton button = (JButton)event.getSource();
			button.setBackground(new Color(230,230,230));
		}
	}//end of MouseExited
  
	
	public void actionPerformed(ActionEvent event)
	{
		if(event.getSource()==zero)
		{
			Result.setText(Result.getText()+"0");
		}
		
		else if(event.getSource()==point)
		{
			Result.setText(Result.getText()+".");
		}
		
		else if(event.getSource()==off)
		{
			System.exit(0);
		}
		
		else if(event.getSource()==one)
		{
			Result.setText(Result.getText()+"1");
		}
		
		else if(event.getSource()==two)
		{
			Result.setText(Result.getText()+"2");
		}
		
		else if(event.getSource()==three)
		{
			Result.setText(Result.getText()+"3");
		}
		
		else if(event.getSource()==four)
		{
			Result.setText(Result.getText()+"4");
		}
		
		else if(event.getSource()==five)
		{
			Result.setText(Result.getText()+"5");
		}
		
		else if(event.getSource()==six)
		{
			Result.setText(Result.getText()+"6");
		}
		
		else if(event.getSource()==seven)
		{
			Result.setText(Result.getText()+"7");
		}
		
		else if(event.getSource()==eight)
		{
			Result.setText(Result.getText()+"8");
		}
		
		else if(event.getSource()==nine)
		{
			Result.setText(Result.getText()+"9");
		}
//Operators		

//Plus Operation
		else if(event.getSource()==add)
		{
			if(Equation.getText().equals(""))	//beginning case
			{
				equation = equation + Result.getText() + "+";
				value1 = Double.parseDouble(Result.getText());
				Equation.setText(Result.getText()+"+");
				Result.setText("");
			}
			else if(length==0)					//Operator pressed after multiple equal
			{
				value1 = answer;				
				equation = "\r\n"+Result.getText() + "+";
				Equation.setText(Result.getText()+"+");
				Result.setText("");
			}
			else if(!operator.equals(""))		//multiple operator loading
			{
				value2 = Double.parseDouble(Result.getText());
				equation = equation+Result.getText() + "+";
				Solve();
				Equation.setText(Double.toString(answer)+"+");
				Result.setText("");
			}
			else if(answer!=0)					//Equation has some value 
			{
				equation = equation + Result.getText() + "+";
				value1 = Double.parseDouble(Result.getText());
				Equation.setText(Result.getText()+"+");
				Result.setText("");
			}
			else								//Equation has no value
			{
				equation = equation + Result.getText() + "+";
				value1 = Double.parseDouble(Result.getText());
				Equation.setText(Equation.getText()+Result.getText()+"+");
				Result.setText("");
			}
			operator = "+";
			length++;
		}

//Minus Operation		
		else if(event.getSource()==sub)
		{
			if(Equation.getText().equals(""))	//beginning case
			{
				equation = equation + Result.getText() + "-";
				value1 = Double.parseDouble(Result.getText());
				Equation.setText(Result.getText()+"-");
				Result.setText("");
			}
			else if(length==0)					//Operator pressed after multiple equal
			{
				value1 = answer;				
				equation = "\r\n"+Result.getText() + "-";
				Equation.setText(Result.getText()+"-");
				Result.setText("");
			}
			else if(!operator.equals(""))		//multiple operator loading
			{
				value2 = Double.parseDouble(Result.getText());
				equation = equation+Result.getText() + "-";
				Solve();
				Equation.setText(Double.toString(answer)+"-");
				Result.setText("");
			}
			else if(answer!=0)					//Equation has some value 
			{
				equation = equation + Result.getText() + "-";
				value1 = Double.parseDouble(Result.getText());
				Equation.setText(Result.getText()+"-");
				Result.setText("");
			}
			else								//Equation has no value
			{
				equation = equation + Result.getText() + "-";
				value1 = Double.parseDouble(Result.getText());
				Equation.setText(Equation.getText()+Result.getText()+"-");
				Result.setText("");
			}
			operator = "-";
			length++;
		}

//Multiplication Operation		
		else if(event.getSource()==mul)
		{
			if(Equation.getText().equals(""))	//beginning case
			{
				equation = equation + Result.getText() + "*";
				value1 = Double.parseDouble(Result.getText());
				Equation.setText(Result.getText()+"x");
				Result.setText("");
			}
			else if(length==0)					//Operator pressed after multiple equal
			{
				value1 = answer;				
				equation = "\r\n"+Result.getText() + "*";
				Equation.setText(Result.getText()+"*");
				Result.setText("");
			}
			else if(!operator.equals(""))		//multiple operator loading
			{
				value2 = Double.parseDouble(Result.getText());
				equation = equation+Result.getText() + "*";
				Solve();
				Equation.setText(Double.toString(answer)+"*");
				Result.setText("");
			}
			else if(answer!=0)					//Equation has some value 
			{
				equation = equation + Result.getText() + "*";
				value1 = Double.parseDouble(Result.getText());
				Equation.setText(Result.getText()+"*");
				Result.setText("");
			}
			else								//Equation has no value
			{
				equation = equation + Result.getText() + "*";
				value1 = Double.parseDouble(Result.getText());
				Equation.setText(Equation.getText()+Result.getText()+"*");
				Result.setText("");
			}
			operator = "*";
			length++;
		}

//Division Operation		
		else if(event.getSource()==div)
		{
			if(Equation.getText().equals(""))	//beginning case
			{
				equation = equation + Result.getText() + "/";
				value1 = Double.parseDouble(Result.getText());
				Equation.setText(Result.getText()+"/");
				Result.setText("");
			}
			else if(length==0)					//Operator pressed after multiple equal
			{
				value1 = answer;				
				equation = "\r\n"+Result.getText() + "/";
				Equation.setText(Result.getText()+"/");
				Result.setText("");
			}
			else if(!operator.equals(""))		//multiple operator loading
			{
				value2 = Double.parseDouble(Result.getText());
				equation = equation+Result.getText() + "/";
				Solve();
				Equation.setText(Double.toString(answer)+"/");
				Result.setText("");
			}
			else if(answer!=0)					//Equation has some value 
			{
				equation = equation + Result.getText() + "/";
				value1 = Double.parseDouble(Result.getText());
				Equation.setText(Result.getText()+"/");
				Result.setText("");
			}
			else								//Equation has no value
			{
				equation = equation + Result.getText() + "/";
				value1 = Double.parseDouble(Result.getText());
				Equation.setText(Equation.getText()+Result.getText()+"/");
				Result.setText("");
			}
			operator = "/";
			length++;			
		}
//Equal		
		else if(event.getSource()==equal)
		{
			if(length>=1)
			{
				try
				{
					equation = equation + Result.getText() + "=";
					value2 = Double.parseDouble(Result.getText());
					Solve();
					equation = equation + Result.getText();
					Text = "\r\n"+Text + equation;
					Display();
					length=0;
					Equation.setText(Equation.getText()+Double.toString(value2)+"="+Double.toString(answer));
				}
				catch(ArithmeticException exc)
				{
					Equation.setText("");
					Result.setText("Cannot divide by zero");
				}
				
			}
			else
			{
				equation = Double.toString(answer)+operator+Double.toString(value2)+"=";
				Equation.setText(Double.toString(answer)+operator+Double.toString(value2)+"=");
				Solve();
				equation = "\r\n"+equation + Result.getText();
				Text = Text + equation;
				Display();
				Equation.setText(Equation.getText()+Double.toString(answer));
				length=0;
			}
			
		}
		
//History		
		else if(event.getSource()==history)
		{
			JOptionPane.showMessageDialog(null,Text);
		}
		
//Clear		
		else if(event.getSource()==clear)
		{
			Result.setText("");
			Equation.setText("");
			Text = "";
			equation = "";
			value1 = value2 = answer = length = 0;
		}
//BackSpace		
		else if(event.getSource()==backspace)
		{
			int length = Result.getText().length();
			int newlength = Result.getText().length() - 1;
			String newValue;
			if(length>0)
			{
				StringBuilder back = new StringBuilder(Result.getText());
				back.deleteCharAt(newlength);
				newValue = back.toString();
				Result.setText(newValue);
			}
		}
		
//Square
		else if(event.getSource()==square)
		{
			double sq = Double.parseDouble(Result.getText()) * Double.parseDouble(Result.getText());
			Text = Text+"\r\n"+"Sqr("+Result.getText()+")"+"="+Double.toString(sq);
			Equation.setText("");
			Result.setText(Double.toString(sq));
		}
//Inverse
		else if(event.getSource()==inverse)
		{
			double inv = 1 / Double.parseDouble(Result.getText());
			Text = Text+"\r\n"+"1/"+Result.getText()+"="+Double.toString(inv);
			Equation.setText("");
			Result.setText(Double.toString(inv));
		}
		
//Percentage
		else if(event.getSource()==percentage)
		{
			double temp = value1 * Double.parseDouble(Result.getText()) / 100;
			Text = Text + "\r\n" ;
			Result.setText(Double.toString(temp));
		}
		
//Memory Option
//Memory Clear
		else if(event.getSource()==memoryClear)
		{
			memory = 0;
		}
//Memory Recall
		else if(event.getSource()==memoryRecall)
		{
			Equation.setText("");
			Result.setText(Double.toString(memory));
		}
//Memory Plus
		else if(event.getSource()==memoryPlus)
		{
			memory += Double.parseDouble(Result.getText());
		}
//Memory Minus
		else if(event.getSource()==memoryMinus)
		{
			memory -= Double.parseDouble(Result.getText());
		}		
	}//end ActionListener
	
	public void Solve()
	{
		switch(operator)
		{
			case "+":
				answer = value1 + value2;
				value1 = answer;
				Result.setText("");
				Result.setText(Double.toString(answer));
				break;
				
			case "-":
				answer = value1 - value2;
				value1 = answer;
				Result.setText("");
				Result.setText(Double.toString(answer));
				break;
				
			case "*":
				answer = value1 * value2;
				value1 = answer;
				Result.setText("");
				Result.setText(Double.toString(answer));
				break;
				
			case "/":
				try
				{
					answer = value1 / value2;
				}
				catch(ArithmeticException exc)
				{
					Result.setText("Cannot divide by zero");
				}
				value1 = answer;
				Result.setText("");
				Result.setText(Double.toString(answer));
				break;
		}
	}//end of Solve
	
	public void Display()
	{
		System.out.println(equation);
	}
	
}//end of class
