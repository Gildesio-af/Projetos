package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Cell extends JPanel{
	
    public int x, y;
    public int posBug, posDev;
    public JLabel bug;
    public JLabel dev;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;

        
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setLayout(new BorderLayout());
        setOpaque(false);

    }
    
    public void dev1(JLabel dev) {
    	this.dev = dev;
    	add(dev, BorderLayout.CENTER);
    }
    
    public void bug1(JLabel bug) {
    	this.bug = bug;
    	add(bug, BorderLayout.CENTER);
    }
    
    
    public void dev(){
    	add(EditImage.createResizedImageLabel("src\\espaco\\images\\dev.jpeg", 60,45));
    }
    public void bug() {

    	add(EditImage.createResizedImageLabel("src\\espaco\\images\\bug.jpeg", 60,45));
    }
    
    public void removeBug() {
    	this.bug.setIcon(null);
    	remove(bug);
    	removeAll();
    	revalidate();
    	repaint();
    }
    
    public void removeDev() {
    	this.dev.setIcon(null);
    	remove(dev);
    	removeAll();
    	revalidate();
    	repaint();
    }

}
