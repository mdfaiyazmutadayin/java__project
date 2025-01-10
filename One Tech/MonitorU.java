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
public class MonitorU extends JFrame implements ActionListener{   
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
JMenuItem asus,hp,msi,dell,lenovo,acer,mouse,keyboard,graphics,processor,motherboard,webcam,pendrive,monitor; 
	
JTextArea ta;
    
MonitorU(){    
//fr=new JFrame(); 
	fr=this.getContentPane();
	
		 		  
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

laptops.add(asus);laptops.add(hp);laptops.add(msi);laptops.add(dell);    
laptops.add(lenovo);laptops.add(acer);  
accessories.add(mouse);
accessories.add(keyboard);
accessories.add(graphics);
accessories.add(motherboard);
accessories.add(processor);
accessories.add(pendrive);
accessories.add(webcam);
accessories.add(monitor);


mb.add(laptops);  
mb.add(accessories);  
		 
	icon= new ImageIcon(getClass().getResource("photo//monitoricon.png"));
		this.setIconImage(icon.getImage());

img= new ImageIcon(getClass().getResource("photo//monitorportal.png"));
		imglabel = new JLabel(img);
		imglabel.setBounds(350,5,img.getIconWidth(),img.getIconHeight());
		fr.add(imglabel);




  Object row[][] = {
			                {"Monitor-#001","Hp f24"," 40,000/="},
			                {"Monitor-#002","Hp f23"," 20,000/="},
			                {"Monitor-#003","Hp f22"," 30,000/="},
			                {"Monitor-#004","Hp f21"," 25,000/="},
			                {"Monitor-#005","Hp f20"," 35,000/="},
			                {"Monitor-#006","Hp f32"," 45,000/="},
			                {"Monitor-#007","Asus v"," 50,000/="},
			                {"Monitor-#008","Asus v2"," 55,000/="},
			                {"Monitor-#009","Asus2"," 21,000/="},
			                {"Monitor-#010","Hp"," 22,000/="},
			                {"Monitor-#011","Hp2 "," 18,000/="},
			                {"Monitor-#012","Dell", "27,000/="},
			                {"Monitor-#013","Dell2"," 14,000/="},
			                {"Monitor-#014","Samsung 20"," 20,000/="},
			                {"Monitor-#015","Samsung 24"," 28,000/="},
			                {"Monitor-#016","Samsung 30"," 33,000/="},
			                {"Monitor-#017","Xiaomi"," 32,000/="},
			                {"Monitor-#018","Xiaomi 20"," 29,000/="},
			                {"Monitor-#019","Walton"," 23,000/="}
			               
                      };
					  
					  
					  
    Object column[] = {"Product Code","Product Name"," Price"};
         table = new JTable(row, column);

         JScrollPane js = new JScrollPane(table);
         js.setBounds(50,50,700,450);
		     fr.add(js);
			 
			 		   but8 = new JButton("Change Background");
         but8.setBounds(550, 500, 200, 30);
		 	but8.addActionListener(this);
         fr.add(but8);
		 
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
				   
				    if(ae.getSource()==but8){
						
						Color color = JColorChooser.showDialog(null,"Select a Color", Color.BLACK);
				        fr.setBackground(color);
						
					}
					else if(ae.getSource()==but7)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to back !");
					dispose();
					DevicePageUser frame = new DevicePageUser();
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
									   else if(ae.getSource()==webcam)
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
				}
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
    

     
public static void main(String[] args) {    
    MonitorU frame = new MonitorU();
			frame.setVisible(true);
		frame.setResizable(false);
  
	
}    
} 