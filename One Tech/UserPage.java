import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UserPage extends JFrame implements ActionListener{
		
	JFrame f1;
	JLabel l,l1;
	JButton b2,b3,b4,b5,b6,b7,b8;
	
	public UserPage(){
		
		//Objects
		
		f1 = new JFrame();//Frame
		l  = new JLabel();//Frame Image
		l1 = new JLabel();//UserPage
		b2 = new JButton();//MyInfo
		b3 = new JButton();//Change Password
		b4 = new JButton();//Wishlist
		b5 = new JButton();//History
		b6 = new JButton();//Logout
		b7 = new JButton();//BackButton
		b8 = new JButton();//Go to Store
		
		//Label Image UserPage
		
		ImageIcon i1 = new ImageIcon("UserPage.png");
		l.setIcon(i1);
		l.setBounds(0,0,800,600);
		
		//Button Image Logout
		
		ImageIcon i2 = new ImageIcon("Logout.png");
		b6.setIcon(i2);
		b6.setBounds(735,0,50,50);
		b6.setFocusable(false);
		b6.setOpaque(false);
        b6.setContentAreaFilled(false);
        b7.setBorderPainted(true);
        b7.setBorder(null);
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
		
		//Label UserPage
		
		l1.setText("User Page");
		l1.setForeground(new Color(157,158,143));
		l1.setBounds(350,10,120,75);
		l1.setFont(new Font("Times New Roman",Font.PLAIN,25));
		
		//Label MyInfo
		
		b2.setText("MyInfo");
		b2.setForeground(new Color(157,158,143));
		b2.setBounds(170,180,120,30);
		b2.setFocusable(false);
		b2.setFont(new Font("Times New Roman",Font.BOLD,20));
		b2.setOpaque(false);
        b2.setContentAreaFilled(true);
		b2.setBorderPainted(false);
        b2.setBorder(null);
		b2.addActionListener(this);
		
		//Label ChangePassword
		
		b3.setText("ChangePassword");
		b3.setForeground(new Color(157,158,143));
		b3.setBounds(430,180,120,30);
		b3.setFocusable(false);
		b3.setFont(new Font("Times New Roman",Font.PLAIN,20));
		b3.setOpaque(false);
        b3.setContentAreaFilled(true);
		b3.setBorderPainted(true);
        b3.setBorder(null);
		b3.addActionListener(this);
		
		
		//Label WishList
		
		b4.setText("Buy Products");
		b4.setForeground(new Color(157,158,143));
		b4.setBounds(170,300,120,30);
		b4.setFocusable(false);
		b4.setFont(new Font("Times New Roman",Font.BOLD,20));
		b4.setOpaque(false);
        b4.setContentAreaFilled(true);
		b4.setBorderPainted(true);
        b4.setBorder(null);
		b4.addActionListener(this);
		
		//Label History
		
		b5.setText("History");
		b5.setForeground(new Color( 157,158,143));
		b5.setBounds(430,300,120,30);
		b5.setFocusable(false);
		b5.setFont(new Font("Times New Roman",Font.PLAIN,20));
		b5.setOpaque(false);
        b5.setContentAreaFilled(true);
		b5.setBorderPainted(true);
        b5.setBorder(null);
		b5.addActionListener(this);
		
		//Label Components
		
		b8.setText("Go to Store");
		b8.setForeground(new Color(157,158,143));
		b8.setBounds(300,400,120,30);
		b8.setFocusable(false);
		b8.setFont(new Font("Times New Roman",Font.PLAIN,20));
		b8.setOpaque(false);
        b8.setContentAreaFilled(true);
		b8.setBorderPainted(true);
        b8.setBorder(null);
		b8.addActionListener(this);
		
		//UserPage Frame
		
		this.setTitle("UserPage");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setIconImage(i1.getImage());
		this.setBounds(260, 180, 800, 600);
		this.setLayout(null);
		this.add(l1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b5);
		this.add(b6);
		this.add(b7);
		this.add(b8);
		this.add(l);
		
	}
	public void actionPerformed(ActionEvent e){
			
		if (e.getSource()==b2){
			MyInfo mi = new MyInfo();
			this.setVisible(false);
			mi.setVisible(true);
		}if (e.getSource()==b3){
			ChangePassword cp = new ChangePassword();
			this.setVisible(false);
			cp.setVisible(true);
		}if (e.getSource()==b4){
			BuyProducts wla = new BuyProducts();
			this.setVisible(false);
			wla.setVisible(true);
		}if (e.getSource()==b5){
			History h = new History();
			this.setVisible(false);
			h.setVisible(true);
		}if (e.getSource()==b6){
			LoginPage frame = new LoginPage();
			this.setVisible(false);
			frame.setVisible(true);
		}if (e.getSource()==b7){
			LoginPage frame = new LoginPage();
		    this.setVisible(false);
			frame.setVisible(true);
		}if (e.getSource()==b8){
			DevicePageUser frame = new DevicePageUser();
			this.setVisible(false);
		    frame.setVisible(true);
		}
		
	}
	public static void main(String[]args){
		UserPage u = new UserPage();
		u.setVisible(true);
	}
}