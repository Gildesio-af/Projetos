package view;

import javax.swing.JFrame;

public class FrameFile extends JFrame{
	
	private PanelFile panel;
	
	public FrameFile() {
		
		setTitle("Escolha o tamanho do arquivo");
		panel = new PanelFile();
		add(panel);
		
		setSize(500,400);
		setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
	}
	
	public PanelFile getPanelFile() {
		return panel;
	}
}



