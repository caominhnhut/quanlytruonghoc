package com.qlth.factory;

import java.awt.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class PlaceHolderTextField extends JTextField {

	private String placeholder;
	private int vitri;

	public PlaceHolderTextField(String text, int size,int vitri) {
		this.vitri=vitri;
		setColumns(size);
		final Font f = getFont();
		setFont(new Font(f.getName(), f.getStyle(), 14));
		placeholder=text;
	}

	@Override
	protected void paintComponent(final Graphics pG) {
		super.paintComponent(pG);

		if (placeholder.length() == 0 || getText().length() > 0) {
			return;
		}

		final Graphics2D g = (Graphics2D) pG;
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(getDisabledTextColor());
		g.drawString(placeholder, getInsets().left, vitri);
	}

	public void setPlaceholder(final String s) {
		placeholder = s;
	}

}
