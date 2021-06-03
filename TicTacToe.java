import java.awt.*;
import java.awt.event.*;
class TicTacToe extends Frame implements ActionListener
{
static Label lbl1,lbl2;
static Button b,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
int c=0;
public static void main(String arr[])
{
TicTacToe g=new TicTacToe();
lbl1 = new Label("welcome To Tic Tac Toe Game");
lbl2=new Label();
Panel p=new Panel();
Panel p1=new Panel();
b = new Button("close");
b10 = new Button("clear");
b1 = new Button();
b2 = new Button();
b3 = new Button();
b4 = new Button();
b5 = new Button();
b6 = new Button();
b7 = new Button();
b8 = new Button();
b9 = new Button();
g.setLayout(new BorderLayout());
g.add(lbl1,BorderLayout.NORTH);
p1.setLayout(new GridLayout(1,3));
g.add(p1, BorderLayout.SOUTH);
p1.add(lbl2);
p1.add(b10);
p1.add(b);
p.setLayout(new GridLayout(3,3));
p.add(b1);
p.add(b2);
p.add(b3);
p.add(b4);
p.add(b5);
p.add(b6);
p.add(b7);
p.add(b8);
p.add(b9);
g.add(p, BorderLayout.CENTER);
g.setTitle("Tic Tac Toe");
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

}
public void actionPerformed(ActionEvent e)
{
	c++;
	
if(e.getSource()==b1)
{
	if(b1.getLabel()=="")
	{
	if(c%2==0)
		b1.setLabel("0");
	else
		b1.setLabel("x");
	}
	else
		c--;
}
if(e.getSource()==b2)
{
	if(b2.getLabel()=="")
	{
	if(c%2==0)
		b2.setLabel("0");
	else
		b2.setLabel("x");
	}
	else
		c--;
}
if(e.getSource()==b3)
{
	if(b3.getLabel()=="")
	{
	if(c%2==0)
		b3.setLabel("0");
	else
		b3.setLabel("x");
	}
	else
		c--;
}
if(e.getSource()==b4)
{
	if(b4.getLabel()=="")
	{
	if(c%2==0)
		b4.setLabel("0");
	else
		b4.setLabel("x");
	}
	else
		c--;
}
if(e.getSource()==b5)
{
	if(b5.getLabel()=="")
	{
	if(c%2==0)
		b5.setLabel("0");
	else
		b5.setLabel("x");
	}
	else
		c--;
}
if(e.getSource()==b6)
{
	if(b6.getLabel()=="")
	{
	if(c%2==0)
		b6.setLabel("0");
	else
		b6.setLabel("x");
	}
	else
		c--;
}
if(e.getSource()==b7)
{
	if(b7.getLabel()=="")
	{
	if(c%2==0)
		b7.setLabel("0");
	else
		b7.setLabel("x");
	}
	else
		c--;
}
if(e.getSource()==b8)
{
	if(b8.getLabel()=="")
	{
	if(c%2==0)
		b8.setLabel("0");
	else
		b8.setLabel("x");
	}
	else
		c--;
}
if(e.getSource()==b9)
{
	if(b9.getLabel()=="")
	{
	if(c%2==0)
		b9.setLabel("0");
	else
		b9.setLabel("x");
	}
	else
		c--;
}
/*
if(e.getSource()==b1)
{
	if(c%2==0)
		b1.setLabel("0");
	else
		b1.setLabel("x");
	b1.setEnabled(false);
}
if(e.getSource()==b2)
{
	if(c%2==0)
		b2.setLabel("0");
	else
		b2.setLabel("x");
	b2.setEnabled(false);
}
if(e.getSource()==b3)
{
	if(c%2==0)
		b3.setLabel("0");
	else
		b3.setLabel("x");
	b3.setEnabled(false);
}
if(e.getSource()==b4)
{
	if(c%2==0)
		b4.setLabel("0");
	else
		b4.setLabel("x");
	b4.setEnabled(false);
}
if(e.getSource()==b5)
{
	if(c%2==0)
		b5.setLabel("0");
	else
		b5.setLabel("x");
	b5.setEnabled(false);
}
if(e.getSource()==b6)
{
	if(c%2==0)
		b6.setLabel("0");
	else
		b6.setLabel("x");
	b6.setEnabled(false);
}
if(e.getSource()==b7)
{
	if(c%2==0)
		b7.setLabel("0");
	else
		b7.setLabel("x");
	b7.setEnabled(false);
}
if(e.getSource()==b8)
{
	if(c%2==0)
		b8.setLabel("0");
	else
		b8.setLabel("x");
	b8.setEnabled(false);
}
if(e.getSource()==b9)
{
	if(c%2==0)
		b9.setLabel("0");
	else
		b9.setLabel("x");
	b9.setEnabled(false);
}*/
if(b1.getLabel().equals("0")&&b2.getLabel().equals("0")&&b3.getLabel().equals("0")
	||b1.getLabel().equals("0")&&b4.getLabel().equals("0")&&b7.getLabel().equals("0")
||b2.getLabel().equals("0")&&b5.getLabel().equals("0")&&b8.getLabel().equals("0")||
b3.getLabel().equals("0")&&b6.getLabel().equals("0")&&b9.getLabel().equals("0")||
b1.getLabel().equals("0")&&b5.getLabel().equals("0")&&b9.getLabel().equals("0")||
b4.getLabel().equals("0")&&b5.getLabel().equals("0")&&b6.getLabel().equals("0")||
b7.getLabel().equals("0")&&b8.getLabel().equals("0")&&b9.getLabel().equals("0")||
b3.getLabel().equals("0")&&b5.getLabel().equals("0")&&b7.getLabel().equals("0"))
	lbl2.setText("0 - wins");
else if(b1.getLabel().equals("x")&&b2.getLabel().equals("x")&&b3.getLabel().equals("x")||
b1.getLabel().equals("x")&&b4.getLabel().equals("x")&&b7.getLabel().equals("x")||
b2.getLabel().equals("x")&&b5.getLabel().equals("x")&&b8.getLabel().equals("x")||
b3.getLabel().equals("x")&&b6.getLabel().equals("x")&&b9.getLabel().equals("x")||
b1.getLabel().equals("x")&&b5.getLabel().equals("x")&&b9.getLabel().equals("x")||
b4.getLabel().equals("x")&&b5.getLabel().equals("x")&&b6.getLabel().equals("x")||
b7.getLabel().equals("x")&&b8.getLabel().equals("x")&&b9.getLabel().equals("x")||
b3.getLabel().equals("x")&&b5.getLabel().equals("x")&&b7.getLabel().equals("x"))
	lbl2.setText("x - wins");
	else if(c==9)
	{
if(b1.getLabel()!=b2.getLabel()||b1.getLabel()!=b3.getLabel()||
b1.getLabel()!=b4.getLabel()||b1.getLabel()!=b7.getLabel()||
b2.getLabel()!=b5.getLabel()||b2.getLabel()!=b8.getLabel()||
b3.getLabel()!=b6.getLabel()||b3.getLabel()!=b9.getLabel()||
b1.getLabel()!=b5.getLabel()||b1.getLabel()!=b9.getLabel()||
b4.getLabel()!=b5.getLabel()||b4.getLabel()!=b6.getLabel()||
b7.getLabel()!=b8.getLabel()||b7.getLabel()!=b9.getLabel()||
b3.getLabel()!=b5.getLabel()||b3.getLabel()!=b7.getLabel())
	lbl2.setText("Draw");
	}
	if(e.getSource()==b)
    System.exit(0);
if(e.getSource()==b10)
{
	b1.setLabel("");
	b2.setLabel("");
	b3.setLabel("");
	b4.setLabel("");
	b5.setLabel("");
	b6.setLabel("");
	b7.setLabel("");
	b8.setLabel("");
	b9.setLabel("");
	c=0;
	lbl2.setText("");
	b1.setEnabled(true);
	b2.setEnabled(true);
	b3.setEnabled(true);
	b4.setEnabled(true);
	b5.setEnabled(true);
	b6.setEnabled(true);
	b7.setEnabled(true);
	b8.setEnabled(true);
	b9.setEnabled(true);
}
}
}