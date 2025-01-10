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

public class History extends JFrame implements ActionListener{
	
		private ImageIcon icon,img,logoutimg,backimg,homeimg;
	private Container c;
	private JLabel userlabel,passlabel;
	private Font f;
	private JLabel imglabel,background;
	private JTextField tx1,tx2;
	private JPasswordField pass;
	private JButton but1,but2,but3,but4,but5,but6,but7,but8,button;
	private Cursor cursor;
	private DefaultTableModel model;
	private JTable table;



     public History(){
		 
		 
		 
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(300,100,800,600);
		this.setTitle(" Branches ");
			c=this.getContentPane();
			 c. setLayout(null);
		

				
			 icon= new ImageIcon(getClass().getResource("photo//logo.png"));
		this.setIconImage(icon.getImage());
		
		
			
		
		ImageIcon img = new ImageIcon("photo//EmployeeListback.png");
		background=new JLabel("",img,JLabel.CENTER);
		background.setBounds(0,0,800,600);
		add(background);
		
		
		
		f=new Font (" Arial",Font.BOLD,14);
		
		cursor =new Cursor(Cursor.HAND_CURSOR);



         Object row[][] = {
			            	{"1", "Acer" , "155500" , "21/12/2022"},
					{"2", "Asus" , "222000" , "21/12/2022"},
					{"3", "MSI" , "112700" , "21/08/2202"},
					{"4", "Gigabyte" , "9200" , "26/12/2022"},
			              
			        
		
			           
                      };
					  
					  
					  
    Object column[] = {"Product Code","Product Name", "Price"," Date"};
         table = new JTable(row, column);

         JScrollPane js = new JScrollPane(table);
         js.setBounds(100,100,650,300);
		     background.add(js);
			
		 

		 
		backimg = new ImageIcon(getClass().getResource("photo//backimg.png"));
		
		but7=new JButton(backimg);
		but7.setBounds(5,510,40,30);
		but7.setCursor(cursor);
		but7.addActionListener(this);
		background.add(but7);
			homeimg = new ImageIcon(getClass().getResource("Logout.png"));
		
		but6=new JButton(homeimg);
		but6.setBounds(5,5,50,50);
		but6.setCursor(cursor);
		but6.setFocusable(false);
		    but6.setOpaque(false);
		but6.addActionListener(this);
		background.add(but6);
		 
		 
     }
	 

	           public void actionPerformed(ActionEvent ae){
				   
	
			 if(ae.getSource()==but7)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to back !");
					dispose();
			  UserPage frame = new UserPage();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
				}
						else if(ae.getSource()==but6)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to back !");
					dispose();
			  LoginPage frame = new LoginPage();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
				}

					
					}
				   
     public static void main(String[] args){
       
		 
		 History frame = new History();
		frame.setVisible(true);
		frame.setResizable(false);
		 
		 
		 
     }
    }


































