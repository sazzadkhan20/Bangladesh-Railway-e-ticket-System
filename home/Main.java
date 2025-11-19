//package Class;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame //implements ActionListener
{
	JPanel p1,p2;
	JLabel piclabel,logolabel,railway, eticket;
	JButton home,signin, signup, help, about,motto;

	
	public Main()
	{
		super(" Home frame ");
		this.setSize(1280,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		
		p1 = new JPanel();
		p1.setBounds(0,0,1280,700);
		this.setLocationRelativeTo(null);
		p1.setLayout(null);
		
		p2 = new JPanel();
		p2.setBounds(0,0,180,700);
		//p2.setBackground(Color.BLACK);
		//p2.setForeground(new Color(121,180,235,255));
		p2.setBackground(Color.decode("#078fdb"));
		p2.setLayout(null);
		p1.add(p2);

		
	//JLabel

        railway = new JLabel("Railway");
        railway.setBounds(60,45,500,120);
	    railway.setForeground(Color.WHITE);
	    railway.setFont(new Font("Serif",Font.BOLD,25));
	    p2.add(railway);	
		p1.add(p2);
		
		eticket = new JLabel("e-ticket System");
        eticket.setBounds(15,88,200,120);
	    eticket.setForeground(Color.WHITE);
	    eticket.setFont(new Font("Serif",Font.BOLD,25));
	    p2.add(eticket);	
		p1.add(p2);
		
	//JButton
        home = new JButton("Home");
		home.setBounds(40,250,100,40);
        home.setFont(new Font("Serif", Font.BOLD, 21));
        home.setCursor(new Cursor(Cursor.HAND_CURSOR));
		home.setBorder(null);
		home.setForeground(Color.WHITE);
		//home.addActionListener(this);
        home.setFocusPainted(false);
		home.setContentAreaFilled(false);
		p2.add(home);
        p1.add(home);
		
		signin = new JButton("Sign In");
		signin.setBounds(40,300,100,40);
        signin.setFont(new Font("Serif", Font.BOLD, 21));
        signin.setCursor(new Cursor(Cursor.HAND_CURSOR));
		signin.setBorder(null);
		signin.setForeground(Color.WHITE);
		//signin.addActionListener(this);
        signin.setFocusPainted(false);
		signin.setContentAreaFilled(false);
		p2.add(signin);
        p1.add(signin);
		
		signup = new JButton("Sign Up");
		signup.setBounds(40,350,100,40);
        signup.setFont(new Font("Serif", Font.BOLD, 21));
        signup.setCursor(new Cursor(Cursor.HAND_CURSOR));
		signup.setBorder(null);
		signup.setForeground(Color.WHITE);
		//signup.addActionListener(this);
        signup.setFocusPainted(false);
		signup.setContentAreaFilled(false);
		p2.add(signup);
        p1.add(signup);
		
		help = new JButton("Help");
		help.setBounds(40,400,100,40);
        help.setFont(new Font("Serif", Font.BOLD, 21));
        help.setCursor(new Cursor(Cursor.HAND_CURSOR));
		help.setBorder(null);
		help.setForeground(Color.WHITE);
		//help.addActionListener(this);
        help.setFocusPainted(false);
		help.setContentAreaFilled(false);
		p2.add(help);
        p1.add(help);
		
		about = new JButton("About us");
		about.setBounds(40,450,100,40);
        about.setFont(new Font("Serif", Font.BOLD, 21));
        about.setCursor(new Cursor(Cursor.HAND_CURSOR));
		about.setBorder(null);
		about.setForeground(Color.WHITE);
		//about.addActionListener(this);
        about.setFocusPainted(false);
		about.setContentAreaFilled(false);
		p2.add(about);
        p1.add(about);
		
		motto = new JButton("Your Ultimate e-Ticket Companion!!");
		motto.setBounds(770,20,500,40);
        motto.setFont(new Font("Monotype Corsiva", Font.BOLD, 32));
        motto.setCursor(new Cursor(Cursor.HAND_CURSOR));
		motto.setBorder(null);
		motto.setForeground(Color.BLACK);
        motto.setFocusPainted(false);
		motto.setContentAreaFilled(false);
        p1.add(motto);
		
	//Logo
        ImageIcon icon = new ImageIcon("Train.png");
	    piclabel = new JLabel(icon);
	    piclabel.setBounds(180,0,1100,700);	
		p1.add(piclabel);
		
		ImageIcon icon2 = new ImageIcon("LOGO2.png");
	    logolabel = new JLabel(icon2);
	    logolabel.setBounds(10,80,40,50);
	    p2.add(logolabel);	
		p1.add(p2);
		

		this.add(p1);
        setVisible(true);
	}
	
	public static void main(String [] args)
	{
		 new Main();
	}
}
