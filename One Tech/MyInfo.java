import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.*;
import javax.swing.JButton;
import java.awt.event.*;
import java.awt.*;

public class MyInfo extends JFrame implements ActionListener{
		
			//Objects
			
			JFrame f2;
			JTextField t2,t3,t4,t5,t6,t7,t8;
			JLabel l,l1,l2,l3,l4,l5,l6,l7,l8;
			JButton b1,b2,b3,b6,b7;
			
			MyInfo(){
			
			f2 = new JFrame();
			t2 = new JTextField();//User ID
			t3 = new JTextField();//Name
			t4 = new JTextField();//Mobile Number
			t5 = new JTextField();//Email
			t6 = new JTextField();//Address
			t7 = new JTextField();//Blood Group
			t8 = new JTextField();//Gender
			l  = new JLabel();//Image
			l1 = new JLabel();//MyInfo
			l2 = new JLabel();//User ID
			l3 = new JLabel();//Name
			l4 = new JLabel();//Mobile Number
			l5 = new JLabel();//Email
			l6 = new JLabel();//Address
			l7 = new JLabel();//Blood Group
			l8 = new JLabel();//Gender
			b6 = new JButton();//Logout
			b1 = new JButton();//Cancel
			b2 = new JButton();//Apply
			b3 = new JButton();//Change
			
			//Label Page MyInfo Image
			
			ImageIcon i4 = new ImageIcon("MyInfo.png");
			l.setIcon(i4);
			l.setBounds(0,0,800,600);
			
			//Label MyInfo
			
			l1.setText("My Info");
			l1.setForeground(new Color(0x000000));
			l1.setBounds(350,10,120,75);
			l1.setFont(new Font("Times New Roman",Font.PLAIN,25));
			
			//Label User ID
			
			l2.setText("User ID :");
			l2.setHorizontalTextPosition(l.CENTER);
			l2.setVerticalTextPosition(l.TOP);
			l2.setForeground(new Color(0x000000));
			l2.setBounds(100,100,120,75);
			l2.setFont(new Font("Times New Roman",Font.PLAIN,20));
			t2.setBounds(180,125,75,25);
			
			//Label Name
			
			l3.setText("Name    :");
			l3.setHorizontalTextPosition(l.CENTER);
			l3.setVerticalTextPosition(l.TOP);
			l3.setForeground(new Color(0x000000));
			l3.setBounds(100,140,120,75);
			l3.setFont(new Font("Times New Roman",Font.PLAIN,20));
			t3.setBounds(180,165,170,25);
			
			//Label Mobile Number
			
			l4.setText("Mobile Number :");
			l4.setHorizontalTextPosition(l.CENTER);
			l4.setVerticalTextPosition(l.TOP);
			l4.setForeground(new Color(0x000000));
			l4.setBounds(100,180,150,75);
			l4.setFont(new Font("Times New Roman",Font.PLAIN,20));
			t4.setBounds(240,205,110,25);
			
			//Label Email
			
			l5.setText("Email    :");
			l5.setHorizontalTextPosition(l.CENTER);
			l5.setVerticalTextPosition(l.TOP);
			l5.setForeground(new Color(0x000000));
			l5.setBounds(100,220,120,75);
			l5.setFont(new Font("Times New Roman",Font.PLAIN,20));
			t5.setBounds(180,245,170,25);
			
			//Label Address
			
			l6.setText("Home Address :");
			l6.setHorizontalTextPosition(l.CENTER);
			l6.setVerticalTextPosition(l.TOP);
			l6.setForeground(new Color(0x000000));
			l6.setBounds(425,140,150,75);
			l6.setFont(new Font("Times New Roman",Font.PLAIN,20));
			t6.setBounds(560,165,180,25);
			
			//Label Blood Group
			
			l7.setText("Blood Group    :");
			l7.setHorizontalTextPosition(l.CENTER);
			l7.setVerticalTextPosition(l.TOP);
			l7.setForeground(new Color(0x000000));
			l7.setBounds(425,220,150,75);
			l7.setFont(new Font("Times New Roman",Font.PLAIN,20));
			t7.setBounds(560,245,50,25);
			
			//Label Gender
			
			l8.setText("Gender             :");
			l8.setHorizontalTextPosition(l.CENTER);
			l8.setVerticalTextPosition(l.TOP);
			l8.setForeground(new Color(0x000000));
			l8.setBounds(425,180,150,75);
			l8.setFont(new Font("Times New Roman",Font.PLAIN,20));
			t8.setBounds(560,205,50,25);
			
			//Label Image Logout
		
		    ImageIcon i2 = new ImageIcon("Logout.png");
		    b6.setIcon(i2);
		    b6.setBounds(735,0,50,50);
		    b6.setFocusable(false);
		    b6.setOpaque(false);
            b6.setContentAreaFilled(false);
            b6.setBorderPainted(true);
            b6.setBorder(null);
		    b6.addActionListener(this);	
			
		    //Apply
			
			b2.setText("Apply");
			b2.setHorizontalTextPosition(l.CENTER);
			b2.setVerticalTextPosition(l.TOP);
			b2.setForeground(new Color(0x000000));
			b2.setBounds(360,400,75,35);
			b2.setFocusable(false);
			b2.setFont(new Font("Times New Roman",Font.PLAIN,20));
			b2.setOpaque(false);
	        b2.setContentAreaFilled(true);
			b2.setBorderPainted(true);
	        b2.setBorder(null);
			b2.addActionListener(this);
			
			//Cancel
			
			b1.setText("Cancel");
			b1.setHorizontalTextPosition(l.CENTER);
			b1.setVerticalTextPosition(l.TOP);
			b1.setForeground(new Color(0x000000));
			b1.setBounds(460,400,75,35);
			b1.setFocusable(false);
			b1.setFont(new Font("Times New Roman",Font.PLAIN,20));
			b1.setOpaque(false);
	        b1.setContentAreaFilled(true);
			b1.setBorderPainted(true);
	        b1.setBorder(null);
			b1.addActionListener(this);
		    
			//Change
			
			b3.setText("Change");
			b3.setHorizontalTextPosition(l.CENTER);
			b3.setVerticalTextPosition(l.TOP);
			b3.setForeground(new Color(0x000000));
			b3.setBounds(260,400,75,35);
			b3.setFocusable(false);
			b3.setFont(new Font("Times New Roman",Font.PLAIN,20));
			b3.setOpaque(false);
	        b3.setContentAreaFilled(true);
			b3.setBorderPainted(true);
	        b3.setBorder(null);
			b3.addActionListener(this);
		    
			//Frame Page MyInfo
			
			this.setTitle("MyInfo");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(false);
			this.setIconImage(i4.getImage());
			this.setBounds(300, 100, 800, 600);
			this.add(l1);
			this.add(l2);
			this.add(t2);
			this.add(l3);
			this.add(t3);
			this.add(l4);
			this.add(t4);
			this.add(l5);
			this.add(t5);
			this.add(l6);
			this.add(t6);
			this.add(l7);
			this.add(t7);
			this.add(l8);
			this.add(t8);
			this.add(b6);
			this.add(b2);
			this.add(b1);
			this.add(b3);
			this.add(l);
			
			}
			
			public void actionPerformed(ActionEvent e){
				
				if(e.getSource()==b6){
					LoginPage frame = new LoginPage();
		            this.setVisible(false);
				    frame.setVisible(true);
				}if(e.getSource()==b3){
					System.out.println("Change");
					
				}if(e.getSource()==b2){
						System.out.println("Apply");
					
				}if (e.getSource()==b1){
					UserPage u = new UserPage();
					this.setVisible(false);
					u.setVisible(true);
					}
			}
	
	    public static void main(String[]args){
			
		    MyInfo mi = new MyInfo();
			mi.setVisible(true);
	}				
}