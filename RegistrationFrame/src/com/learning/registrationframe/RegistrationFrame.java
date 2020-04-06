package com.learning.registrationframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RegistrationFrame extends JFrame{
		
	JLabel registerForm, lblName, lblEmail, lblPwd, lblContact;
	JTextField name, email, pwd, contact;
	JButton register, cancel;
	
	public RegistrationFrame()
	{
		registerForm=new JLabel("RegistrationForm");
		registerForm.setBounds(100, 20, 100, 20);
		
		lblName=new JLabel("Enter your name");
		lblName.setBounds(20, 40, 100, 20);
		
		name=new JTextField();
		name.setBounds(130, 40, 100, 20);
		
		lblEmail=new JLabel("Enter E-mail");
		lblEmail.setBounds(20, 70, 100, 20);
		
		email=new JTextField();
		email.setBounds(130, 70, 100, 20);
		
		lblPwd=new JLabel("Enter Password");
		lblPwd.setBounds(20, 100, 100, 20);
		
		pwd=new JTextField();
		pwd.setBounds(130, 100, 100, 20);
		
		lblContact=new JLabel("Enter Contact No.");
		lblContact.setBounds(20, 130, 100, 20);
		
		contact=new JTextField();
		contact.setBounds(130, 130, 100, 20);

		register=new JButton("Register");
		register.setBounds(25, 160, 100, 20);
		register.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				name.setText("Shubham");
				email.setText("shubhamdhml03@gmail.com");
				pwd.setText("98765");
				contact.setText("98XXXXXX37");
				setVisible(true);
				LoginFrame lframe = new LoginFrame();
			}
		});
		
		cancel=new JButton("Cancel");
		cancel.setBounds(175, 160, 100, 20);
		cancel.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				name.setText("");
				email.setText("");
				pwd.setText("");
				contact.setText("");
			}
		});
		
		add(registerForm);
		add(lblName);
		add(name);
		add(lblEmail);
		add(email);
		add(lblPwd);
		add(pwd);
		add(lblContact);
		add(contact);
		add(register);
		add(cancel);
		
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		setTitle("Registration Frame");
	}

	public static void main(String[] args) {
		RegistrationFrame rframe=new RegistrationFrame();
	}

}
