import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
public class BuyProducts extends JFrame implements ActionListener{

    private ImageIcon backimage;
    private ImageIcon backimage2;
    private ImageIcon homeimage;

    private JLabel backlabel;
    private JLabel backlabel2;
    private JLabel homelabel;

    private JButton home;
    private JButton backButton;

    private String usrname;
    private char[] tpassword;
    private char[] tpassword2;
    private String password;
    private String password2;
    private String name;
    private String mobile;
    private String address;
    private String email;
    private String productcode;
    private String productquantity;
  

 

    private JButton addb;
    private JButton clearb;
    private JRadioButton m;
    private JRadioButton f;
    private JRadioButton o;
    ButtonGroup bgroup;


    private JTextField usrnametxf;
    private JPasswordField tpasswordtxf;
    private JPasswordField tpasswordtxf2;
    private JTextField nametxf;
    private JTextField mobiletxf;
    private JTextField addresstxf;
    private JTextField emailtxf;
    private JTextField bloodgrouptxf;
    private JTextField productcodetxf;
    private JTextField productquantitytxf;
    private JTextField deliverytxf;
    //private JTextField gendertxf;

    private JLabel usrnamel;
    private JLabel tpasswordl;
    private JLabel tpasswordl2;
    private JLabel namel;
    private JLabel mobilel;
    private JLabel addressl;
    private JLabel emaill;
    private JLabel bloodgroupl;
    private JLabel productcodel;
    private JLabel productquantityl;
    private JLabel deliveryl;
    private JLabel deliveryl1;

    BuyProducts(){

        backimage=new ImageIcon("photo//employeepageback.png");

        backlabel=new JLabel(backimage);
        backlabel.setBounds(0,0,800,600);

        homeimage=new ImageIcon("photo/homeimg.png");
        homelabel=new JLabel(homeimage);
        homelabel.setBounds(20,20,50,50);

        backimage2=new ImageIcon("photo/backimg.png");
        backlabel2=new JLabel(backimage2);
        backlabel2.setBounds(720,500,50,50);

        home=new JButton();
        home.setBounds(20,20,50,50);
        home.setOpaque(false); // Must add
        home.setContentAreaFilled(false);
        home.setFocusable(false);
        home.setBorderPainted(true);
        home.setBorder(null);
        home.add(homelabel);
        home.addActionListener(this);

        backButton=new JButton();
        backButton.setBounds(720,500,50,50);
        backButton.setOpaque(false); // Must add
        backButton.setContentAreaFilled(false);
        backButton.setFocusable(false);
        backButton.setBorderPainted(true);
        backButton.setBorder(null);
        backButton.add(backlabel2);
        backButton.addActionListener(this);

    
        namel=new JLabel("Your Name");
        namel.setBounds(100,100,300,30);

        mobilel=new JLabel("Your Mobile");
        mobilel.setBounds(100,140,300,30);

        addressl=new JLabel(" Your Address");
        addressl.setBounds(100,180,300,30);

        emaill=new JLabel("Your Email");
        emaill.setBounds(100,220,220,30);

        productcodel=new JLabel("Your Desire Product Code ");
        productcodel.setBounds(100,260,300,30);

        productquantityl=new JLabel("Product Quantity");
        productquantityl.setBounds(100,300,300,30);
		
		deliveryl=new JLabel("Delivery Type");
        deliveryl.setBounds(100,340,300,30);
		
		 deliveryl1=new JLabel("Cash on Delivery");
        deliveryl1.setBounds(400,340,300,30);
		
		
		
		
		
		

        nametxf=new JTextField();
        nametxf.setBounds(400,100,300,30);
        
        mobiletxf=new JTextField();
        mobiletxf.setBounds(400,140,300,30);
        
        addresstxf=new JTextField();
        addresstxf.setBounds(400,180,300,30);
        
        emailtxf=new JTextField();
        emailtxf.setBounds(400,220,300,30);
        
      
        
       productcodetxf =new JTextField();
        productcodetxf.setBounds(400,260,300,30);
		
		
		   productquantitytxf =new JTextField();
		   
        productquantitytxf.setBounds(400,300,300,30);
		
		
		

        backimage=new ImageIcon("backimg.png");
        backlabel=new JLabel(backimage);
        backlabel.setBounds(0,0,800,600);

        addb=new JButton("BUY");
        addb.setBounds(100,450,200,60);
        addb.setFocusable(false);
        addb.addActionListener(this);

        clearb=new JButton("Clear");
        clearb.setBounds(350,450,200,60);
        clearb.setFocusable(false);
        clearb.addActionListener(this);





   

        this.setTitle("Buy Products ");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(300,100,800,600);
        this.setResizable(false);
        this.add(home);
		
		
        this.add(backButton);
        this.add(homelabel);
        this.add(backlabel);

        this.add(namel);
        this.add(mobilel);
        this.add(addressl);
        this.add(emaill);
		this.add(productcodel);
		this.add(productquantityl);
		this.add(deliveryl);
		this.add(deliveryl1);



        this.add(nametxf);
        this.add(mobiletxf);
        this.add(addresstxf);
        this.add(emailtxf);
        this.add(productcodetxf);
        this.add(productquantitytxf);
 
 

        this.add(addb);
        this.add(clearb);
  
        this.setVisible(true);
        this.add(backlabel);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==home){
            	 	UserPage frame = new UserPage();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
        }
        if (e.getSource()==backButton){
          	 	UserPage frame = new UserPage();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
        }


        name=nametxf.getText();
        mobile=mobiletxf.getText();
        address=addresstxf.getText();
        email=emailtxf.getText();
        productcode=productcodetxf.getText();
        productquantity=productquantitytxf.getText();
     
     
       if(e.getSource()==addb){
        
          	
            try{
                FileWriter file = new FileWriter("orderdetails.txt",true); 
                file.write(""+name+","+mobile+","+address+","+email+","+productcode+","+productquantity+","+ " Cash On Delivery "+"\n");
                file.close();
                if(name.equals("")&&mobile.equals("")&&email.equals("")&&address.equals("")&&productcode.equals("")&&productquantity.equals("")){
                    JOptionPane.showMessageDialog(null, "Please Filled up all the details");
                }
                else{
					dispose();
             
			 AfterBuy frame=new AfterBuy();
			      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
			 
			 
                }
            }
            catch(IOException io){
                System.out.println("An error has just occured! :(");
            }					    
        }
          
 
        
        if (e.getSource()==clearb){
   
        nametxf.setText("");
        mobiletxf.setText("");
        addresstxf.setText("");
        emailtxf.setText("");
		productcodetxf.setText("");
		productquantitytxf.setText("");
   
        }
        
        
        
        
    }

    public static void main(String [] args){
        BuyProducts ade1 =new BuyProducts();
    }
    
}
