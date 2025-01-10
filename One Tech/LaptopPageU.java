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

public class LaptopPageU extends JFrame implements ActionListener

{
	private ImageIcon icon,img,logoutimg,backimg,homeimg;
	private Container c;
	private JLabel userlabel,passlabel;
	private Font f;
	private JLabel imglabel,background;
	private JTextField tx1,tx2;
	private JPasswordField pass;
	private JButton but1,but2,but3,but4,but5,but6,but7,but8,but9,but10,but11,but12,but13,but14,but15;
	private Cursor cursor;

	private JTable table; 
    JMenuBar mb;    
JMenu laptops,accessories;    
JMenuItem MacBook,asus,hp,msi,dell,lenovo,acer,mouse,keyboard,graphics,processor,motherboard,webcam,pendrive,monitor; 
	
	LaptopPageU()
	 
	 {
		 
MacBook=new JMenuItem("MacBook");		 		  
asus=new JMenuItem("Asus");    
hp=new JMenuItem("Hp");    
msi=new JMenuItem("Msi");    
dell=new JMenuItem("Dell");    
lenovo=new JMenuItem("Lenovo");    
acer=new JMenuItem("Acer");  
mouse=new JMenuItem("Mouse");  
keyboard=new JMenuItem("Keyboard");  
graphics=new JMenuItem("Graphichs crad");  
motherboard=new JMenuItem("Motherboard");  
processor=new JMenuItem("Processor");   
monitor=new JMenuItem("Monitor");  

MacBook.addActionListener(this);  
asus.addActionListener(this);    
hp.addActionListener(this);    
msi.addActionListener(this);    
dell.addActionListener(this);    
lenovo.addActionListener(this);    
acer.addActionListener(this); 
mouse.addActionListener(this); 
keyboard.addActionListener(this); 
graphics.addActionListener(this); 
motherboard.addActionListener(this); 
processor.addActionListener(this); 
monitor.addActionListener(this); 
 
mb=new JMenuBar(); 
   
laptops=new JMenu("Laptops"); 
accessories=new JMenu("Accessories"); 

laptops.add(MacBook);laptops.add(asus);laptops.add(hp);laptops.add(msi);laptops.add(dell);    
laptops.add(lenovo);laptops.add(acer);  
accessories.add(mouse);
accessories.add(keyboard);
accessories.add(graphics);
accessories.add(motherboard);
accessories.add(processor);
//accessories.add(pendrive);
//accessories.add(webcam);
accessories.add(monitor);


mb.add(laptops);  
mb.add(accessories);  
	
		 
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(300,100,800,600);
		this.setTitle(" Laptop Page");
		
		
		
         JLabel background;
		
		icon= new ImageIcon(getClass().getResource("photo//laptopicon.png"));
		this.setIconImage(icon.getImage());
		
		c=this.getContentPane();
		c.setLayout(null);
		img= new ImageIcon(getClass().getResource("photo//laptopsportal.png"));
		imglabel = new JLabel(img);
		imglabel.setBounds(350,5,img.getIconWidth(),img.getIconHeight());
		c.add(imglabel);
		
		ImageIcon img = new ImageIcon("photo//employeepageback.png");
		background=new JLabel("",img,JLabel.CENTER);
		background.setBounds(0,0,800,600);
		add(background);
		
		background.add(mb);
		this.setJMenuBar(mb);  
		
		f=new Font (" Arial",Font.BOLD,14);
		
		cursor =new Cursor(Cursor.HAND_CURSOR);
		
		but1=new JButton("ASUS");
		but1.setBounds(100,250,150,30);
		but1.setCursor(cursor);
		but1.addActionListener(this);
		background.add(but1);
		
		but2=new JButton("HP");
		but2.setBounds(300,250,150,30);
		but2.setCursor(cursor);
		but2.addActionListener(this);
		background.add(but2);
		
		but3=new JButton("MSI");
		but3.setBounds(550,250,150,30);
		but3.setCursor(cursor);
		//but3.setBackground(Color.PINK);
		but3.addActionListener(this);
		background.add(but3);
		
		but4=new JButton(" DELL");
		but4.setBounds(100,400,150,30);
		but4.setCursor(cursor);
		//but4.setBackground(Color.PINK);
		but4.addActionListener(this);
		background.add(but4);
		
		but5=new JButton("LENOVO");
		but5.setBounds(300,400,150,30);
		but5.setCursor(cursor);
		//but5.setBackground(Color.PINK);
		but5.addActionListener(this);
		background.add(but5);
		
		but8=new JButton("ACER");
		but8.setBounds(550,400,150,30);
		but8.setCursor(cursor);
		//but5.setBackground(Color.PINK);
		but8.addActionListener(this);
		background.add(but8);
		
		but10=new JButton("MacBook");
		but10.setBounds(300,150,150,30);
		but10.setCursor(cursor);
		//but5.setBackground(Color.PINK);
		but10.addActionListener(this);
		background.add(but10);
		
	
		
			
		
		
		homeimg = new ImageIcon(getClass().getResource("photo//homeimg.png"));
		
		but6=new JButton(homeimg);
		but6.setBounds(5,5,40,30);
		but6.setCursor(cursor);
		but6.addActionListener(this);
		background.add(but6);
		
		backimg = new ImageIcon(getClass().getResource("photo//backimg.png"));
		
		but7=new JButton(backimg);
		but7.setBounds(5,510,40,30);
		but7.setCursor(cursor);
		but7.addActionListener(this);
		background.add(but7);
	
		
	  
	  
	  }
	  
	  public void actionPerformed(ActionEvent ae){
		  

		    if(ae.getSource()==but7)
				{
				//JOptionPane.showMessageDialog(null, " Are you Sure Want to back !");
					dispose();
				DevicePageUser frame = new DevicePageUser();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
				}
				   else if(ae.getSource()==but6)
				{
				//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
					UserPage u = new UserPage();
					this.setVisible(false);
		            u.setVisible(true);
			        u.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		            u.setBounds(300,100,800,600);
			  	    u.setResizable(false);
				}
				
					   else if(ae.getSource()==but1)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				Asus frame = new Asus();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
						   else if(ae.getSource()==but2)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				Hp frame = new Hp();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
						   else if(ae.getSource()==but3)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				Msi frame = new Msi();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
						   else if(ae.getSource()==but4)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				Dell frame = new Dell();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
						   else if(ae.getSource()==but5)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				Lenovo frame = new Lenovo();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
				  else if(ae.getSource()==but10)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				MackBook frame = new MackBook();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
						   else if(ae.getSource()==but8)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				Acer frame = new Acer();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
				
				else if(ae.getSource()==asus){
						dispose();
						 Asus frame = new Asus();
						  frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
						
					}
			 else if(ae.getSource()==hp)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				Hp frame = new Hp();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
				 else if(ae.getSource()==MacBook)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				MacBook frame = new MacBook();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
				
						   else if(ae.getSource()==msi)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				Msi frame = new Msi();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
						   else if(ae.getSource()==dell)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				Dell frame = new Dell();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
						   else if(ae.getSource()==lenovo)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				Lenovo frame = new Lenovo();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
						   else if(ae.getSource()==acer)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				Acer frame = new Acer();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
				
				   else if(ae.getSource()==mouse)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				MouseU frame = new MouseU();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
									   else if(ae.getSource()==keyboard)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				KeyboardU frame = new KeyboardU();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
									   else if(ae.getSource()==motherboard)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				MotherboardU frame = new MotherboardU();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
									   else if(ae.getSource()==processor)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				ProcessorU frame = new ProcessorU();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
									   /*else if(ae.getSource()==webcam)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				WebcamU frame = new WebcamU();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
									   else if(ae.getSource()==pendrive)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				PendriveU frame = new PendriveU();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}*/
											   else if(ae.getSource()==graphics)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				GraphicsU frame = new GraphicsU();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
											   else if(ae.getSource()==monitor)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				MonitorU frame = new MonitorU();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
				
				
				
				
			}
			
		
	
	
	
	
	public static void main(String args[])
	{
		
		LaptopPageU frame = new LaptopPageU();
		frame.setVisible(true);
		frame.setResizable(false);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setBounds(300,100,800,600);
		//frame.setTitle(" Employee Portal");
	
		
		
		
	}
}