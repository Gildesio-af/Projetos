package view;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class PanelFile extends JPanel{
	private Button button;
	private String[] choices = {"10", "50", "100", "500", "1000", "1500", "2000"};
	private JComboBox<String> comboBox;
	
	public PanelFile() {
		setSize(500,400);
		setLayout(null);
		setBackground(new Color(144, 238, 144));
		organizer();
	}
	
	public void organizer() {
		button = new Button("Ok");
		add(button);
		button.setBounds(200, 250, 100, 50);
		button.setForeground(Color.BLACK);
		comboBox = new JComboBox<String>(choices);
		add(comboBox);
		comboBox.setBounds(160,50,200,70);
	}

	public Button getButton() {
		return button;
	}

	public JComboBox<String> getComboBox() {
		return comboBox;
	}
	
	
}
