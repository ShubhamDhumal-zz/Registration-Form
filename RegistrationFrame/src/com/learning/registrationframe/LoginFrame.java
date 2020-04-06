package com.learning.registrationframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginFrame extends JFrame {
	JLabel loginForm, lbluname, lblpwd,error;
	JTextField urname, lpwd;
	JButton login, clear;
	
	public LoginFrame()
	{
		loginForm=new JLabel("Login Form");
		loginForm.setBounds(75, 20, 150, 20);
		
		lbluname=new JLabel("Username");
		lbluname.setBounds(20, 50, 100, 20);
		
		urname=new JTextField();
		urname.setBounds(130, 50, 100, 20);
		
		lblpwd=new JLabel("Password");
		lblpwd.setBounds(20, 80, 100, 20);
		
		lpwd=new JTextField();
		lpwd.setBounds(130, 80, 100, 20);

		error=new JLabel();
		error.setBounds(75, 140, 150, 20);
		
		login=new JButton("Login");
		login.setBounds(25, 110, 100, 20);
		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String uname=urname.getText();
				String pass=lpwd.getText();
				setVisible(false);
				if(uname.contentEquals("Shubham") && pass.contentEquals("98765"))
				{
					HomeFrame hframe = new HomeFrame();
				}
				else
				{
					error.setText("Login Error!!!");
					setVisible(true);
				}
			}
		});
		
		clear=new JButton("Clear");
		clear.setBounds(175, 110, 100, 20);
		clear.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				urname.setText("");
				lpwd.setText("");
			}
		});
		
		add(loginForm);
		add(lbluname);
		add(urname);
		add(lblpwd);
		add(lpwd);
		add(login);
		add(clear);
		add(error);
		
		setSize(300,300);
		setLayout(null);
		setVisible(true);
        setTitle("Login Frame");
	}
	
}
