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
public class MacBook extends JFrame implements ActionListener{   
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
    
MacBook(){    
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
pendrive=new JMenuItem("Pendrive");  
webcam=new JMenuItem("Webcam");  
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
pendrive.addActionListener(this); 
webcam.addActionListener(this); 
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

	   icon= new ImageIcon(getClass().getResource("photo//logo.png"));
		this.setIconImage(icon.getImage());

img= new ImageIcon(getClass().getResource("photo//asusportal.png"));
		imglabel = new JLabel(img);
		imglabel.setBounds(350,5,img.getIconWidth(),img.getIconHeight());
		fr.add(imglabel);




  Object row[][] = {
			                {"M-MacBook#001","Apple MacBook Air 13.3-Inch 10th Gen Core i5-1.1GHz, 8GB RAM, 512GB SSD","1,50,000/="},
			                {"M-MacBook#002","Apple MacBook Pro 13.3-Inch Retina Display 8-core Apple M1 chip with 8GB RAM","1,60,000/="},
			                {"M-MacBook#003","Apple MacBook Pro 13.3-Inch Retina Display 8-core Apple M1 chip with 8GB RAM","1,70,000/="},
			                {"M-MacBook#004","Apple MacBook Pro 13.3-Inch Retina Display M2 Chip 8GB RAM","1,00,000/="},
			                {"M-MacBook#005","Apple MacBook Air (2022) Apple M2 Chip 13.6-Inch Liquid Retina Display 8GB RAM 256GB SSD","1,20,000/="},
			                {"M-MacBook#006","Apple MacBook Air 2022 Apple M2 Chip 13.6-Inch Liquid Retina Display 8GB RAM 512GB SSD","2,00,000/="},
			                {"M-MacBook#007","Apple MacBook Pro 14-Inch M1 Pro Chip, 16GB RAM, 512GB SSD (MKGR3LL/A) Silver 2021","2,60,000/="},
			                {"M-MacBook#008","Apple MacBook Pro 14-Inch M1 Pro Chip, 16GB RAM, 512GB SSD","80,000/="},
			                {"M-MacBook#009","Apple MacBook Pro 16-Inch M1 Pro Chip, 16GB RAM, 1TB SSD","90,000/="},
			                {"M-MacBook#0010","Apple MacBook Pro 13.3-Inch Retina Display 8-core Apple M1 chip with 16GB RAM, 1TB SSD","95,000/="},
			                {"M-MacBook#0011","Apple MacBook Pro 13.3-Inch Retina Display 8-core Apple M1 chip with 16GB RAM","1,00,000/="},
			                {"M-MacBook#0012","Apple MacBook Air 13.3-Inch Retina Display 8-core Apple M1 Chip 16GB RAM 256GB SSD","70,000/="},
			              
                      };
					  
					  
					  
    Object column[] = {"Product Code","Product Name"," Price"};
         table = new JTable(row, column);

         JScrollPane js = new JScrollPane(table);
         js.setBounds(50,50,700,450);
		     fr.add(js);
			 
	//		 		   but8 = new JButton("Change Background");
      //   but8.setBounds(550, 500, 200, 30);
		// 	but8.addActionListener(this);
         //fr.add(but8);
		 
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
				
					else if(ae.getSource()==MacBook){
						dispose();
						 MacBook frame = new MacBook();
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
									  /* else if(ae.getSource()==webcam)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				Webcam frame = new Webcam();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
									   else if(ae.getSource()==pendrive)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				Pendrive frame = new Pendrive();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}*/
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
  MacBook frame = new MacBook();
			frame.setVisible(true);
		frame.setResizable(false);
  
	
}    
} 