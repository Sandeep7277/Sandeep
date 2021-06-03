import java.awt.*;
import java.awt.event.*;
import java.util.*;
class GuessingGame extends Frame implements ActionListener
{
static int a=0,n;
static TextField txt1;
static Choice c1,c2;
static Button b1,b2;
static Label lbl1,lbl2,lbl3,lbl4,lbl5,lbl6;
public static void main(String arr[])
{
GuessingGame g=new GuessingGame();
g.setBackground(Color.GREEN);
g.setForeground(Color.BLUE);
lbl1=new Label("Welcome To Number Guessing Game");
lbl2=new Label("Enter Any No.");
lbl3=new Label("(0 to 100)");
lbl4=new Label("No. Of  Attempt :-");
lbl5=new Label(String.valueOf(a));
lbl6=new Label();
txt1 = new TextField(20);
b1=new Button("Submit");
b2=new Button("Close");
g.setLayout(null);
lbl1.setSize(250,30);
lbl2.setSize(80,30);
txt1.setSize(100,25);
lbl3.setSize(80,30);
lbl4.setSize(100,30);
lbl5.setSize(20,30);
lbl6.setSize(200,30);
b1.setSize(70,30);
b2.setSize(50,30);
lbl1.setLocation(10,30);
lbl2.setLocation(30,60);
txt1.setLocation(130,60);
lbl3.setLocation(280,60);
lbl4.setLocation(30,150);
lbl5.setLocation(150,150);
lbl6.setLocation(50,200);
b1.setLocation(120,100);
b2.setLocation(330,210);
g.add(lbl1);
g.add(lbl2);
g.add(txt1);
g.add(lbl3);
g.add(b1);
g.add(lbl4);
g.add(lbl5);
g.add(lbl6);
g.add(b2);
g.setTitle("Number Guessing Game");
g.setSize(400,250);
g.setVisible(true);
b1.addActionListener(g);
b2.addActionListener(g);
Random r=new Random();
n=r.nextInt(100);
}
public void actionPerformed(ActionEvent e)
{
	try
	{
	if(e.getSource()==b1)
	{
	lbl5.setText(String.valueOf(++a));
	int b=Integer.parseInt(txt1.getText());
	if(b==n)
	lbl6.setText("You have guessed it !");
else if(b>n)
	lbl6.setText("Try a little lower ");
else if(b<n)
	lbl6.setText("Try a little higher");
	}
if(e.getSource()==b2)
	System.exit(0);
	}
	catch(Exception p)
	{
		System.out.print(p);
	}

}
}
