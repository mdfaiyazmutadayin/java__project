import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class WishlistAddComp extends JFrame implements ActionListener{
	
	JFrame f4;
	JTable t;
	JLabel l;
	JButton b5,b6,b7;
		
		public WishlistAddComp(){
			
			f4 = new JFrame();
			l = new JLabel();//Image
			b5 = new JButton();
			b6 = new JButton();//Logout
			b7 = new JButton();//Back
			
			//Label Image Wishlist
			
			ImageIcon i6 = new ImageIcon("Wishlist.png");
			l.setIcon(i6);
			l.setBounds(0,0,800,600);
			
			//Button Image Logout
			
			ImageIcon i2 = new ImageIcon("Logout.png");
			b6.setIcon(i2);
			b6.setBounds(735,0,50,50);
			b6.setFocusable(false);
			b6.setOpaque(false);
	        b6.setContentAreaFilled(false);
			b6.setBorderPainted(true);
			b6.setBorder(null);
			b6.addActionListener(this);
			
			//Button Add Component
			
			b5.setText("Buy Now");
		    b5.setBounds(300,300,200,50);
		    b5.setFont(new Font("Times New Roman",Font.PLAIN,25));
		    b5.setFocusable(false);
		    b5.setOpaque(true);
            b5.setContentAreaFilled(true);
		    b5.setBorderPainted(false);
            b5.setBorder(null);
		    b5.addActionListener(this);
		    
			//Button Image BackButton
		
		    ImageIcon i3 = new ImageIcon("BackButton.png");
		    b7.setIcon(i3);
		    b7.setBounds(0,515,50,50);
		    b7.setFocusable(false);
		    b7.setOpaque(true);
            b7.setContentAreaFilled(false);
		    b7.setBorderPainted(true);
            b7.setBorder(null);
		    b7.addActionListener(this);
			
			//Frame
			
			this.setTitle("Wishlist");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(false);
			this.setIconImage(i6.getImage());
			this.setBounds(300, 100, 800, 600);
			this.setVisible(true);
			this.add(b6);
			this.add(b5);
			this.add(b7);
			this.add(l);
			
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource()==b6){
				LoginPage frame = new LoginPage();
		        this.setVisible(false);
				frame.setVisible(true);
			}if(e.getSource()==b7){
				UserPage u = new UserPage();
				this.setVisible(false);
				u.setVisible(true);
			}if(e.getSource()==b5){
				Wishlist wl = new Wishlist();
			    wl.setVisible(true);
			}
		}
		
		public static void main(String[]args){
			
		    WishlistAddComp wla = new WishlistAddComp();
			wla.setVisible(true);
	}				
}