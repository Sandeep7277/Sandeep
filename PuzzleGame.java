import java.awt.*;
import java.awt.event.*;
class PuzzleGame extends Frame implements ActionListener
{
static int a=0;
static Label lbl1,lbl2,lbl3,lbl4;
static Button b,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
public static void main(String arr[])
{
PuzzleGame g=new PuzzleGame();

lbl1 = new Label("Welcome To Puzzle Game");
lbl2=new Label("No of attempt :-");
lbl3=new Label(String.valueOf(a));
lbl4=new Label();
Panel p=new Panel();
Panel p1=new Panel();
b = new Button("close");
b1 = new Button("9");
b2 = new Button("15");
b3 = new Button("14");
b4 = new Button("13");
b5 = new Button("6");
b6 = new Button("8");
b7 = new Button("2");
b8 = new Button("3");
b9 = new Button("1");
b10 = new Button("4");
b11= new Button("12");
b12= new Button("11");
b13= new Button("5");
b14= new Button("7");
b15= new Button("10");
b16= new Button();
g.setLayout(new BorderLayout());
g.add(lbl1,BorderLayout.NORTH);
p1.setLayout(new GridLayout(1,4));
g.add(p1, BorderLayout.SOUTH);
p1.add(lbl2);
p1.add(lbl3);
p1.add(lbl4);
p1.add(b);
p.setLayout(new GridLayout(4,4));
p.add(b1);
p.add(b2);
p.add(b3);
p.add(b4);
p.add(b5);
p.add(b6);
p.add(b7);
p.add(b8);
p.add(b9);
p.add(b10);
p.add(b11);
p.add(b12);
p.add(b13);
p.add(b14);
p.add(b15);
p.add(b16);
g.add(p, BorderLayout.CENTER);
g.setTitle("Puzzle Game");
g.setSize(500,400);
g.setVisible(true);
b.addActionListener(g);
b1.addActionListener(g);
b2.addActionListener(g);
b3.addActionListener(g);
b4.addActionListener(g);
b5.addActionListener(g);
b6.addActionListener(g);
b7.addActionListener(g);
b8.addActionListener(g);
b9.addActionListener(g);
b10.addActionListener(g);
b11.addActionListener(g);
b12.addActionListener(g);
b13.addActionListener(g);
b14.addActionListener(g);
b15.addActionListener(g);
b16.addActionListener(g);
}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==b1)
	{
		lbl3.setText(String.valueOf(++a));
	    String s= b1.getLabel();
		if(b2.getLabel().equals(""))
		{
		b2.setLabel(s);
		b1.setLabel("");
		}
		else if(b5.getLabel().equals(""))
		{
		b5.setLabel(s);
		b1.setLabel("");
		}
	}
	if(e.getSource()==b2)
	    {
		lbl3.setText(String.valueOf(++a));
	    String s= b2.getLabel();
		if(b1.getLabel().equals(""))
		{
		b1.setLabel(s);
		b2.setLabel("");
		}
		else if(b3.getLabel().equals(""))
		{
		b3.setLabel(s);
		b2.setLabel("");
		}
		else if(b6.getLabel().equals(""))
		{
		b6.setLabel(s);
		b2.setLabel("");
		}
	}
	if(e.getSource()==b3)
	    {
		lbl3.setText(String.valueOf(++a));
	    String s= b3.getLabel();
		if(b2.getLabel().equals(""))
		{
		b2.setLabel(s);
		b3.setLabel("");
		}
		else if(b4.getLabel().equals(""))
		{
		b4.setLabel(s);
		b3.setLabel("");
		}
		else if(b7.getLabel().equals(""))
		{
		b7.setLabel(s);
		b3.setLabel("");
		}
	}
	if(e.getSource()==b4)
	{
		lbl3.setText(String.valueOf(++a));
	    String s= b4.getLabel();
		if(b3.getLabel().equals(""))
		{
		b3.setLabel(s);
		b4.setLabel("");
		}
		else if(b8.getLabel().equals(""))
		{
		b8.setLabel(s);
		b4.setLabel("");
		}
	}
	if(e.getSource()==b5)
	    {
		lbl3.setText(String.valueOf(++a));
	    String s= b5.getLabel();
		if(b1.getLabel().equals(""))
		{
		b1.setLabel(s);
		b5.setLabel("");
		}
		else if(b6.getLabel().equals(""))
		{
		b6.setLabel(s);
		b5.setLabel("");
		}
		else if(b9.getLabel().equals(""))
		{
		b9.setLabel(s);
		b5.setLabel("");
		}
	}
	if(e.getSource()==b6)
	    {
		lbl3.setText(String.valueOf(++a));
	    String s= b6.getLabel();
		if(b2.getLabel().equals(""))
		{
		b2.setLabel(s);
		b6.setLabel("");
		}
		else if(b5.getLabel().equals(""))
		{
		b5.setLabel(s);
		b6.setLabel("");
		}
		else if(b7.getLabel().equals(""))
		{
		b7.setLabel(s);
		b6.setLabel("");
		}
		else if(b10.getLabel().equals(""))
		{
		b10.setLabel(s);
		b6.setLabel("");
		}
	}
	if(e.getSource()==b7)
	    {
		lbl3.setText(String.valueOf(++a));
	    String s= b7.getLabel();
		if(b3.getLabel().equals(""))
		{
		b3.setLabel(s);
		b7.setLabel("");
		}
		else if(b6.getLabel().equals(""))
		{
		b6.setLabel(s);
		b7.setLabel("");
		}
		else if(b8.getLabel().equals(""))
		{
		b8.setLabel(s);
		b7.setLabel("");
		}
		else if(b11.getLabel().equals(""))
		{
		b11.setLabel(s);
		b7.setLabel("");
		}
	}
	if(e.getSource()==b8)
	    {
		lbl3.setText(String.valueOf(++a));
	    String s= b8.getLabel();
		if(b4.getLabel().equals(""))
		{
		b4.setLabel(s);
		b8.setLabel("");
		}
		else if(b7.getLabel().equals(""))
		{
		b7.setLabel(s);
		b8.setLabel("");
		}
		else if(b12.getLabel().equals(""))
		{
		b12.setLabel(s);
		b8.setLabel("");
		}
	}
	if(e.getSource()==b9)
	    {
		lbl3.setText(String.valueOf(++a));
	    String s= b9.getLabel();
		if(b5.getLabel().equals(""))
		{
		b5.setLabel(s);
		b9.setLabel("");
		}
		else if(b10.getLabel().equals(""))
		{
		b10.setLabel(s);
		b9.setLabel("");
		}
		else if(b13.getLabel().equals(""))
		{
		b13.setLabel(s);
		b9.setLabel("");
		}
	}
	if(e.getSource()==b10)
	    {
		lbl3.setText(String.valueOf(++a));
	    String s= b10.getLabel();
		if(b6.getLabel().equals(""))
		{
		b6.setLabel(s);
		b10.setLabel("");
		}
		else if(b9.getLabel().equals(""))
		{
		b9.setLabel(s);
		b10.setLabel("");
		}
		else if(b11.getLabel().equals(""))
		{
		b11.setLabel(s);
		b10.setLabel("");
		}
		else if(b14.getLabel().equals(""))
		{
		b14.setLabel(s);
		b10.setLabel("");
		}
	}
	if(e.getSource()==b11)
	    {
		lbl3.setText(String.valueOf(++a));
	    String s= b11.getLabel();
		if(b7.getLabel().equals(""))
		{
		b7.setLabel(s);
		b11.setLabel("");
		}
		else if(b10.getLabel().equals(""))
		{
		b10.setLabel(s);
		b11.setLabel("");
		}
		else if(b12.getLabel().equals(""))
		{
		b12.setLabel(s);
		b11.setLabel("");
		}
		else if(b15.getLabel().equals(""))
		{
		b15.setLabel(s);
		b11.setLabel("");
		}
	}
	if(e.getSource()==b12)
	    {
		lbl3.setText(String.valueOf(++a));
	    String s= b12.getLabel();
		if(b8.getLabel().equals(""))
		{
		b8.setLabel(s);
		b12.setLabel("");
		}
		else if(b11.getLabel().equals(""))
		{
		b11.setLabel(s);
		b12.setLabel("");
		}
		else if(b16.getLabel().equals(""))
		{
		b16.setLabel(s);
		b12.setLabel("");
		}
	}
	if(e.getSource()==b13)
	    {
		lbl3.setText(String.valueOf(++a));
	    String s= b13.getLabel();
		if(b9.getLabel().equals(""))
		{
		b9.setLabel(s);
		b13.setLabel("");
		}
		else if(b14.getLabel().equals(""))
		{
		b14.setLabel(s);
		b13.setLabel("");
		}
	}
	if(e.getSource()==b14)
	    {
		lbl3.setText(String.valueOf(++a));
	    String s= b14.getLabel();
		if(b10.getLabel().equals(""))
		{
		b10.setLabel(s);
		b14.setLabel("");
		}
		else if(b13.getLabel().equals(""))
		{
		b13.setLabel(s);
		b14.setLabel("");
		}
		else if(b15.getLabel().equals(""))
		{
		b15.setLabel(s);
		b14.setLabel("");
		}
	}
	if(e.getSource()==b15)
	    {
		lbl3.setText(String.valueOf(++a));
	    String s= b15.getLabel();
		if(b11.getLabel().equals(""))
		{
		b11.setLabel(s);
		b15.setLabel("");
		}
		else if(b14.getLabel().equals(""))
		{
		b14.setLabel(s);
		b15.setLabel("");
		}
		else if(b16.getLabel().equals(""))
		{
		b16.setLabel(s);
		b15.setLabel("");
		}
	}
	if(e.getSource()==b16)
	    {
		lbl3.setText(String.valueOf(++a));
	    String s= b16.getLabel();
		if(b12.getLabel().equals(""))
		{
		b12.setLabel(s);
		b16.setLabel("");
		}
		else if(b15.getLabel().equals(""))
		{
		b15.setLabel(s);
		b16.setLabel("");
		}
	}
	if(e.getSource()==b)
    System.exit(0);
if(b1.getLabel().equals("1"))
	if(b2.getLabel().equals("2"))
		if(b3.getLabel().equals("3"))
			if(b4.getLabel().equals("4"))
				if(b5.getLabel().equals("5"))
					if(b6.getLabel().equals("6"))
						if(b7.getLabel().equals("7"))
							if(b8.getLabel().equals("8"))
								if(b9.getLabel().equals("9"))
									if(b10.getLabel().equals("10"))
										if(b11.getLabel().equals("11"))
											if(b12.getLabel().equals("12"))
												if(b13.getLabel().equals("13"))
													if(b14.getLabel().equals("14"))
														if(b15.getLabel().equals("15"))
															lbl4.setText("you have win!");
														else
															lbl4.setText("");
}
}