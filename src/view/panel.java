package view;

import control.control;

import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.*;

public class panel extends JPanel
{
	private control appController;
	private FlowLayout LayoutOfChoice;
	private JLabel lable;
	
	public panel(control appController)
	{
		super();
		this.appController = appController;
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void setupPanel()
	{
//		this.setLayout(LayoutOfChoice);
		this.add(lable);
		this.setBackground(new Color (200, 190, 200));
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
