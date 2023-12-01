package view;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelImage extends JPanel{
	
	public PanelImage(JLabel label) {
		setLayout(new BorderLayout());
		setOpaque(false);
		this.add(label);
	}
}
