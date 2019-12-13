import java.awt.*;  
import java.awt.event.*;
//Author -> ITVoyagers, visit -> itvoyagers.in  
class Calculator extends Frame implements ActionListener
{
	Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bm, bd, bs, ba, be, bc;
	TextField screen;
	int n1 = 0, sign = 4;
	//Author -> ITVoyagers, visit -> itvoyagers.in  
	Calculator()
	{
		b0 = new Button("0");
		b1 = new Button("1");
		b2 = new Button("2");
		b3 = new Button("3");
		b4 = new Button("4");
		b5 = new Button("5");
		b6 = new Button("6");
		b7 = new Button("7");
		b8 = new Button("8");
		b9 = new Button("9");
		bm = new Button("*");
		bd = new Button("/");
		bs = new Button("-");
		ba = new Button("+");
		be = new Button("=");
		bc = new Button("Clear");

		b7.setBounds(10,100,50,50);
		b8.setBounds(60,100,50,50);
		b9.setBounds(110,100,50,50);
		bm.setBounds(160,100,50,50);
//Author -> ITVoyagers, visit -> itvoyagers.in  
		b4.setBounds(10,150,50,50);
		b5.setBounds(60,150,50,50);
		b6.setBounds(110,150,50,50);
		bd.setBounds(160,150,50,50);

		b1.setBounds(10,200,50,50);
		b2.setBounds(60,200,50,50);
		b3.setBounds(110,200,50,50);
		bs.setBounds(160,200,50,50);
//Author -> ITVoyagers, visit -> itvoyagers.in  
		b0.setBounds(10,250,50,50);
		be.setBounds(60,250,100,50);
		ba.setBounds(160,250,50,50);
		bc.setBounds(10,80,200,20);

		bc.setBackground(Color.red);
		be.setBackground(Color.blue);

		screen = new TextField();

		screen.setBounds(10,50,200,30);
//Author -> ITVoyagers, visit -> itvoyagers.in  
		add(b7);
		add(b8);
		add(b9);
		add(bm);

		add(b4);
		add(b5);
		add(b6);
		add(bd);
//Author -> ITVoyagers, visit -> itvoyagers.in  
		add(b1);
		add(b2);
		add(b3);
		add(bs);

		add(b0);
		add(be);
		add(ba);
		add(bc);

		add(screen);
//Author -> ITVoyagers, visit -> itvoyagers.in  
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bd.addActionListener(this);
		bm.addActionListener(this);
		bs.addActionListener(this);
		ba.addActionListener(this);
		be.addActionListener(this);
		bc.addActionListener(this);

		setSize(220,310);
		setLayout(null);
		setVisible(true);
	}
//Author -> ITVoyagers, visit -> itvoyagers.in  
	public void append(int a)
	{
		int c;
		if(screen.getText().equals(""))
		{
			screen.setText(Integer.toString(a));
		}
		//Author -> ITVoyagers, visit -> itvoyagers.in  
		else
		{
			c = Integer.parseInt(screen.getText());
			screen.setText(Integer.toString((c*10)+a));
		}
	}

	public void actionPerformed(ActionEvent e)
	{
		int n2 = 1, res;
//Author -> ITVoyagers, visit -> itvoyagers.in  
		if(e.getSource()==b0)
		{
			append(0);
		}
		if(e.getSource()==b1)
		{
			append(1);
		}
		if(e.getSource()==b2)
		{
			append(2);
		}
//Author -> ITVoyagers, visit -> itvoyagers.in  
		if(e.getSource()==b3)
		{
			append(3);
		}
		if(e.getSource()==b4)
		{
			append(4);
		}

		if(e.getSource()==b5)
		{
			append(5);
		}
//Author -> ITVoyagers, visit -> itvoyagers.in  
		if(e.getSource()==b6)
		{
			append(6);
		}
		if(e.getSource()==b7)
		{
			append(7);
		}
		if(e.getSource()==b8)
		{
			append(8);
		}
		if(e.getSource()==b9)
		{
			append(9);
		}
//Author -> ITVoyagers, visit -> itvoyagers.in  
		if(e.getSource()==be)
		{
//Author -> ITVoyagers, visit -> itvoyagers.in  
				System.out.print(n1);
			if(n1>0)
			{
				n2 = Integer.parseInt(screen.getText());
			//Author -> ITVoyagers, visit -> itvoyagers.in  
				if(sign < 4)
				{
					switch(sign)
					{
						case 0:
							screen.setText(Integer.toString(n1*n2));
						break;
						case 1:
							screen.setText(Integer.toString(n1/n2));
						break;
						case 2:
							screen.setText(Integer.toString(n1-n2));
						break;
						default:
							screen.setText(Integer.toString(n1+n2));
						break;
					}
				}//Author -> ITVoyagers, visit -> itvoyagers.in  
			}
			else
			{
				screen.setText("");				
			}
		}
//Author -> ITVoyagers, visit -> itvoyagers.in  
		if(e.getSource()==bd || e.getSource()==bm || 
			e.getSource()==bs || e.getSource()==ba
			 || e.getSource()==bc)
		{
			if(screen.getText().equals(""))
			{
				screen.setText("");
			}
			else if(e.getSource()==bm)
			{
				n1 = Integer.parseInt(screen.getText());
				System.out.print(n1);
				screen.setText("");
				sign = 0;
			}
//Author -> ITVoyagers, visit -> itvoyagers.in  			
			else if(e.getSource()==bd)
			{
				n1 = Integer.parseInt(screen.getText());

				screen.setText("");
				sign = 1;
			}
//Author -> ITVoyagers, visit -> itvoyagers.in  
			else if(e.getSource()==bs)
			{
				n1 = Integer.parseInt(screen.getText());
				screen.setText("");
				sign = 2;
			}
			else if(e.getSource()==ba)
			{
				n1 = Integer.parseInt(screen.getText());
				screen.setText("");
				sign = 3;
			}
//Author -> ITVoyagers, visit -> itvoyagers.in  	
			else if(e.getSource()==bc)
			{				
				screen.setText("");
			}
		}
	} 
//Author -> ITVoyagers, visit -> itvoyagers.in  
	public static void main(String[] args)
	{
		new Calculator();
	}
}

