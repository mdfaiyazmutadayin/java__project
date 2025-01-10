import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Wishlist extends JFrame implements ActionListener{
	
	JFrame f4;
	JTable t;
	JLabel l;
	JButton b6,b7;
		
		public Wishlist(){
			
			f4 = new JFrame();
			l = new JLabel();//Image
			b6 = new JButton();//Logout
			b7 = new JButton();//Back
			
			//Label Image Wishlist
			
			ImageIcon i6 = new ImageIcon("Wishlist.png");
			l.setIcon(i6);
			l.setBounds(0,0,800,600);
			
			String[] columNames = {"Product Code","Product Name","Stock","Price","Order Date"};
			
			Object[][] data = {
					{"1","Acer","In Stock","1500","21/11/2022"},
					{"2","AMD Rayzon","In Stock","2000","21/12/2022"},
					{"3","MSI","Out of Stock","17700","11/11/2022"},
					{"4","Gigabyte","Out of Stock","12200","29/11/2022"},
			};
			
			t = new JTable(data, columNames);
			t.setPreferredScrollableViewportSize(new Dimension(500,50));
			t.setFillsViewportHeight(true);
			
			JScrollPane scrollPane = new JScrollPane(t);
			add(scrollPane);
            scrollPane.setBounds(50,50,700,450);

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
			this.setBounds(300, 100, 800, 600);
			this.setIconImage(i6.getImage());
			this.setVisible(true);
			this.setLayout(null);    
			this.add(b6);
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
			}
		}
		
		public static void main(String[]args){
			
		    Wishlist wl = new Wishlist();
			wl.setVisible(true);
	}				
}