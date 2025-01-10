import javax.swing.*;    
import java.awt.event.*;   
import javax.swing.*;
import java.awt.Container;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.Cursor;
import java.awt.Color;

import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter; 
public class Hp extends JFrame implements ActionListener{   
		private ImageIcon icon,img,logoutimg,backimg;
	private Container fr;
	private JLabel userlabel,passlabel;
	private Font f;
	private JLabel imglabel,background;
	private JTextField tx1,tx2;
	private JPasswordField pass;
	private JButton but1,but2,but3,but4,but5,but6,but7,but8,button;
	private Cursor cursor;
	private DefaultTableModel model;
	private JTable table; 
//JFrame fr;    
JMenuBar mb;    
JMenu laptops,accessories;    
JMenuItem MacBook,asus,hp,msi,dell,lenovo,acer,mouse,keyboard,graphics,processor,motherboard,webcam,pendrive,monitor; 
	
JTextArea ta;
    
Hp(){    
//fr=new JFrame(); 
	fr=this.getContentPane();
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
accessories.add(monitor);


mb.add(laptops);  
mb.add(accessories);  

	 icon= new ImageIcon(getClass().getResource("photo//logo.png"));
		this.setIconImage(icon.getImage());

img= new ImageIcon(getClass().getResource("photo//hpportal.png"));
		imglabel = new JLabel(img);
		imglabel.setBounds(350,5,img.getIconWidth(),img.getIconHeight());
		fr.add(imglabel);




  Object row[][] = {
			                {"L-Hp#001","HP 15s-du3811TU Core i3 11th Gen 15.6","50,000/="},
			                {"L-Hp#002","HP 15s-fq5487TU Core i3 12th Gen 15.6","60,000/="},
			                {"L-Hp#003","HP 15s-du3039TX Core i5 11th Gen MX450 Graphics 15.6","70,000/="},
			                {"L-Hp#004","HP ProBook 455 G9 Ryzen 5 5625U 15.6","1,00,000/="},
			                {"L-Hp#005","HP ENVY x360 Convert 13-ay1678AU Ryzen 5 5600U 13.3","90,000/="},
			                {"L-Hp#006","HP Pavilion Gaming 15-ec2706AX Ryzen 5 5600H RTX 3050 4GB Graphics 15.6","1,10,000/="}
			              
			               
                      };
					  
					  
					  
    Object column[] = {"Product Code","Product Name"," Price"};
         table = new JTable(row, column);

         JScrollPane js = new JScrollPane(table);
         js.setBounds(50,50,700,450);
		     fr.add(js);
			 
		 
		backimg = new ImageIcon(getClass().getResource("photo//backimg.png"));
		
		but7=new JButton(backimg);
		but7.setBounds(5,510,40,30);
		but7.setCursor(cursor);
		but7.addActionListener(this);
		fr.add(but7);


      
fr.add(mb);   
this.setJMenuBar(mb);  
fr.setLayout(null);    
this.setBounds(300,100,800,600);    
fr.setVisible(true);
this.setResizable(false);    
}   

  
	           public void actionPerformed(ActionEvent ae){
				   
				   
					 if(ae.getSource()==but7)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to back !");
					dispose();
				LaptopPage frame = new LaptopPage();
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
				  else if(ae.getSource()==mouse)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				Mouse frame = new Mouse();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
									   else if(ae.getSource()==keyboard)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				Keyboard frame = new Keyboard();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
									   else if(ae.getSource()==motherboard)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				Motherboard frame = new Motherboard();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
									   else if(ae.getSource()==processor)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				Processor frame = new Processor();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
									 
											   else if(ae.getSource()==graphics)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				Graphics frame = new Graphics();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
											   else if(ae.getSource()==monitor)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				Monitor frame = new Monitor();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
				
				
				
				
				
				
				
				
				
					
					}
    

     
public static void main(String[] args) {    
    Hp frame = new Hp();
			frame.setVisible(true);
		frame.setResizable(false);
  
	
}    
} 