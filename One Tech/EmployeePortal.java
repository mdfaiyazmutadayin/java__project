import javax.swing.*;
import java.awt.Container;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionEvent;
import java.awt.Cursor;

public class EmployeePortal extends JFrame implements ActionListener

{
	private ImageIcon icon,img,logoutimg,backimg;
	private Container c;
	private JLabel userlabel,passlabel;
	private Font f;
	private JLabel imglabel,background;
	private JTextField tx1,tx2;
	private JPasswordField pass;
	private JButton but1,but2,but3,but4,but5,but6,but7;
	private Cursor cursor;

	
	EmployeePortal()
	 
	 {
		 
		 
		 		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(300,100,800,600);
		this.setTitle(" Employee Portal");
		
		
		
         JLabel background;
		
		 icon= new ImageIcon(getClass().getResource("photo//logo.png"));
		this.setIconImage(icon.getImage());
		
		c=this.getContentPane();
	
		
		c.setLayout(null);
		img= new ImageIcon(getClass().getResource("photo//employeeportal.png"));
		imglabel = new JLabel(img);
		imglabel.setBounds(350,5,img.getIconWidth(),img.getIconHeight());

		c.add(imglabel);
		
		ImageIcon img = new ImageIcon("photo//employeepageback.png");
		background=new JLabel("",img,JLabel.CENTER);
		background.setBounds(0,0,800,600);
		add(background);
		
		
		
		f=new Font (" Arial",Font.BOLD,14);
		
		cursor =new Cursor(Cursor.HAND_CURSOR);
		
		but1=new JButton("Store Details");
		but1.setBounds(100,250,150,30);
		but1.setCursor(cursor);
		but1.addActionListener(this);
		but1.setFocusPainted(false);
		background.add(but1);
		
		
		but3=new JButton("Customers Info");
		but3.setBounds(550,250,150,30);
		but3.setCursor(cursor);
		//but3.setBackground(Color.PINK);
		but3.setFocusPainted(false);
			but3.addActionListener(this);
		background.add(but3);
		
		but4=new JButton("Components");
		but4.setBounds(100,350,150,30);
		but4.setCursor(cursor);
		//but4.setBackground(Color.PINK);
		but4.setFocusPainted(false);
		but4.addActionListener(this);
		background.add(but4);
		
		but5=new JButton("Orders");
		but5.setBounds(550,350,150,30);
		but5.setFocusPainted(false);
		but5.setCursor(cursor);
		//but5.setBackground(Color.PINK);
			but5.addActionListener(this);
		background.add(but5);
		Border border = BorderFactory.createEmptyBorder(0,0,0,0);
		logoutimg = new ImageIcon(getClass().getResource("photo//logout.png"));
		
		but6=new JButton(logoutimg);
		but6.setBounds(720,5,40,30);
		but6.setCursor(cursor);
		but6.setFocusPainted(false);
			but6.setBorder(border);
		but6.addActionListener(this);
		background.add(but6);
		
		backimg = new ImageIcon(getClass().getResource("photo//backimg.png"));
		
		but7=new JButton(backimg);
		but7.setBounds(5,510,40,30);
		but7.setCursor(cursor);
			but7.setBorder(border);
			but7.setFocusPainted(false);
		//but7.setBackground(null);
		but7.addActionListener(this);
		background.add(but7);
	
		
	  
	  
	  }
	  
	  public void actionPerformed(ActionEvent ae){
		  

		    if(ae.getSource()==but7)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to back !");
					dispose();
			  LoginPage frame = new LoginPage();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
				}
				   else if(ae.getSource()==but6)
				{
					//JOptionPane.showMessageDialog(null, " Successfully LogOut this Page !");
					dispose();
			  LoginPage frame = new LoginPage();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
				}	
				else if(ae.getSource()==but4)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to Show Devices!");
					dispose();
			 DevicePage frame = new DevicePage();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
				}
					else if(ae.getSource()==but1)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to Show Devices!");
					dispose();
			 StoreDetails frame = new StoreDetails();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
				}
							else if(ae.getSource()==but3)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to Show Devices!");
					dispose();
			 	CustomersinfoPage frame = new CustomersinfoPage();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
				}
									else if(ae.getSource()==but5)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to Show Devices!");
					dispose();
			 	OrderDetails frame = new OrderDetails();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
				}

				
				
			}
			
		
	
	
	
	
	public static void main(String args[])
	{
		
		EmployeePortal frame = new EmployeePortal();
		frame.setVisible(true);
		frame.setResizable(false);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setBounds(300,100,800,600);
		//frame.setTitle(" Employee Portal");
	
		
		
		
	}
}