package view;

import control.control;

import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class panel extends JPanel
{
	private control appController;
	//private FlowLayout layout;
	private JButton But1;
	private JButton But2;
	private JLabel fug;
	private String fugg = "fug";
	
			
			
	public panel(control appController)
	{
		super();
		this.appController = appController;
		But1 = new JButton("words");
		But2 = new JButton("color");
		fug = new JLabel("");
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void setupPanel()
	{
		//this.setLayout(layout);
		this.add(But1);
		this.add(But2);
		this.add(fug);
		this.setBackground(new Color (200, 120, 200));
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		But1.addActionListener(new ActionListener() {
				public void actionPerformed (ActionEvent click)	{
					
					fug.setText(fugg + "fug");
					fugg = (fugg + "fug");
					}
		});}
	
		
		
	
}
