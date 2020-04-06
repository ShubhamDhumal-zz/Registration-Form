package com.learning.registrationframe;

import javax.swing.*;

public class HomeFrame extends JFrame {
	JLabel homeFrame, loginSucess;
	
	public HomeFrame()
	{
		homeFrame=new JLabel("HOME PAGE");
		homeFrame.setBounds(75, 20, 150, 20);
		
		loginSucess=new JLabel("Welcome User");
		loginSucess.setBounds(20, 50, 100, 20);

		add(homeFrame);
		add(loginSucess);
		
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	
}
