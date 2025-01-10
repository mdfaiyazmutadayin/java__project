import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.awt.Cursor;
import javax.swing.border.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
public class AfterBuy extends JFrame implements ActionListener {
   private JLabel label,imglabel,background,txlabel,txlabel2,txlabel3,txlabel4;
   private ImageIcon icon,img,logoutimg,backimg;
   private Container c;
   private Cursor cursor;
   private JButton but1,but2,but3,but4,but5,but6,but7;
	 
	 
	 
   public AfterBuy() {
	
	   
	   icon= new ImageIcon(getClass().getResource("photo//logo.png"));
		this.setIconImage(icon.getImage());
		c=this.getContentPane();
	
		
		ImageIcon img = new ImageIcon("photo//employeepageback.png");
		background=new JLabel("",img,JLabel.CENTER);
		background.setBounds(0,0,800,600);
		add(background);
	    
	    txlabel = new JLabel();
		txlabel.setText (" Successfully Confirm Your order ");
		txlabel.setBounds(250,100,500,50);
		txlabel.setFont(new Font("Arial", 0, 30));
		txlabel.setForeground(Color.BLACK);	
	
		background.add(txlabel);
		
		
		    txlabel2 = new JLabel();
		txlabel2.setText (" Your product Delivery Within 10 Days ");
		txlabel2.setBounds(250,200,500,50);
		txlabel2.setFont(new Font("Arial", 0, 18));
		txlabel2.setForeground(Color.BLACK);	
	
		background.add(txlabel2);
		
		    txlabel3 = new JLabel();
		txlabel3.setText (" Please pay after getting product ");
		txlabel3.setBounds(250,250,500,50);
		txlabel3.setFont(new Font("Arial", 0, 18));
		txlabel3.setForeground(Color.BLACK);	
	
		background.add(txlabel3);
		
			    txlabel4 = new JLabel();
		txlabel4.setText (" If you want to buy another product then click Next ");
		txlabel4.setBounds(250,300,500,50);
		txlabel4.setFont(new Font("Arial", 0, 18));
		txlabel4.setForeground(Color.BLACK);	
	
		background.add(txlabel4);

	  
	  
		cursor =new Cursor(Cursor.HAND_CURSOR); 
	   Border border = BorderFactory.createEmptyBorder(0,0,0,0);		
	  
	  	but6=new JButton(" Next ");
		but6.setBounds(600,450,100,50);
		but6.setCursor(cursor);
		but6.setBorder(border);
		but6.addActionListener(this);
		but6.setBackground(Color.GRAY);
		but6.setForeground(Color.WHITE);
	    but6.setFocusPainted(false);		
		background.add(but6);
		
		
	    but7=new JButton(" Home ");
		but7.setBounds(250,450,100,50);
		but7.setCursor(cursor);
		but7.setBorder(border);
		but7.addActionListener(this);
		but7.setBackground(Color.GRAY);
		but7.setForeground(Color.WHITE);
	    but7.setFocusPainted(false);		
		background.add(but7);
		
		
		
	  
	  
	  
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(300,100,800,600);
		this.setTitle(" Show Message");
      setVisible(true);
     setLocationRelativeTo(null);
     
   }
   
   
   
   
   public void actionPerformed(ActionEvent e) {

	  
	   if(e.getSource()==but6)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to back !");
					dispose();
			  BuyProducts frame = new BuyProducts();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
				}
					else if(e.getSource()==but7)
				{
					dispose();
						UserPage frame = new UserPage();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
		
				}
	  
	  
   }
   
   
   
   
   public static void main (String[] args) {
  
	  AfterBuy frame = new AfterBuy();
		frame.setVisible(true);
		frame.setResizable(false);
   }
}