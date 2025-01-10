import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class ChangePassword extends JFrame implements ActionListener{
	
	JFrame f3;
	JLabel l,l1,l2,l3,l4;
	JTextField t2,t3,t4;
	JButton b1,b2,b6;
	
	ChangePassword(){
		
		//Objects
		
		f3 = new JFrame();
		l  = new JLabel();//Image
		l1 = new JLabel();//ChangePassword
		l2 = new JLabel();//Current Password
		l3 = new JLabel();//New Password
		l4 = new JLabel();//Retype Password
		t2 = new JTextField();//Current Password
		t3 = new JTextField();//New Password
		t4 = new JTextField();//Retype Password
		b1 = new JButton();//Cancel
		b2 = new JButton();//Apply
		b6 = new JButton();//Logout
		
		//Label Image ChangePassword
		
		ImageIcon i5 = new ImageIcon("ChangePassword.png");
		l.setIcon(i5);
		l.setBounds(0,0,800,600);
		
		//Button Image Logout
		
		ImageIcon i2 = new ImageIcon("Logout.png");
		b6.setIcon(i2);
		b6.setBounds(735,0,50,50);
		b6.setFocusable(false);
		b6.setOpaque(false);
        b6.setContentAreaFilled(false);
		b6.addActionListener(this);
		
		//Label ChangePassword
		
		l1.setText("Change Password");
		l1.setHorizontalTextPosition(l.CENTER);
		l1.setVerticalTextPosition(l.TOP);
		l1.setForeground(new Color(0x000000));
		l1.setBounds(350,10,200,75);
		l1.setFont(new Font("Times New Roman",Font.PLAIN,25));
		
		//Current Password
		
		l2.setText("Current Password :");
		l2.setHorizontalTextPosition(l.CENTER);
		l2.setVerticalTextPosition(l.TOP);
		l2.setForeground(new Color(0x000000));
		l2.setBounds(100,100,175,75);
		l2.setFont(new Font("Times New Roman",Font.PLAIN,20));
		t2.setBounds(255,125,150,25);		
		
		//New Password
		
		l3.setText("New Password     :");
		l3.setHorizontalTextPosition(l.CENTER);
		l3.setVerticalTextPosition(l.TOP);
		l3.setForeground(new Color(0x000000));
		l3.setBounds(100,150,175,75);
		l3.setFont(new Font("Times New Roman",Font.PLAIN,20));
		t3.setBounds(255,175,150,25);
		
		//Retype Password
		
		l4.setText("Retype Password  :");
		l4.setHorizontalTextPosition(l.CENTER);
		l4.setVerticalTextPosition(l.TOP);
		l4.setForeground(new Color(0x000000));
		l4.setBounds(100,200,175,75);
		l4.setFont(new Font("Times New Roman",Font.PLAIN,20));
		t4.setBounds(255,225,150,25);
		
		//Apply
		
		b2.setText("Apply");
		b2.setHorizontalTextPosition(l.CENTER);
		b2.setVerticalTextPosition(l.TOP);
		b2.setForeground(new Color(0x000000));
		b2.setBounds(400,400,75,35);
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
		b1.setBounds(500,400,75,35);
		b1.setFocusable(false);
		b1.setFont(new Font("Times New Roman",Font.PLAIN,20));
		b1.setOpaque(false);
        b1.setContentAreaFilled(true);
		b1.setBorderPainted(true);
        b1.setBorder(null);
		b1.addActionListener(this);
				
		//ChangePassword Frame
		
		this.setTitle("ChangePassword");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setIconImage(i5.getImage());
		this.setBounds(300, 100, 800, 600);
		this.setVisible(true);
	    this.add(l1);
		this.add(t2);
		this.add(l2);
		this.add(t3);
		this.add(l3);
		this.add(t4);
		this.add(l4);
		this.add(b6);
		this.add(b2);
		this.add(b1);
		this.add(l);		
	}
	
	public void actionPerformed(ActionEvent e){
				
				if(e.getSource()==b6){
					LoginPage frame = new LoginPage();
		            this.setVisible(false);
				    frame.setVisible(true);
				}if(e.getSource()==b2){
					System.out.println("Apply");
				}if (e.getSource()==b1){
					UserPage u = new UserPage();
					this.setVisible(false);
					u.setVisible(true);
					}
			}
	public static void main(String[]args){
		ChangePassword cp = new ChangePassword();
		cp.setVisible(true);
	}		
}