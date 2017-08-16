package com.qlth.factory;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.SwingConstants;

public class LinkButton extends JButton {

	public LinkButton(String text){
		setText(text);
		setHorizontalAlignment(SwingConstants.LEFT);
		setBorderPainted(false);
		setOpaque(false);
		setBackground(Color.lightGray);
		setForeground(Color.blue);
	}
}
