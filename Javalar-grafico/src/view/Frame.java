package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.util.List;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;
import javax.swing.SwingUtilities;

import EspacoJaval.Bug;
import EspacoJaval.Dev;
import EspacoJaval.Mundo;

public class Frame extends JFrame {

    private Mesh mesh;
    private PanelButtons panelButtons;
    private List<Mundo> mundos;
    private Bug bug;
    private Dev dev;

    public Frame(){
        panelButtons = new PanelButtons();
        
        organizer();
        
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
       
    }


    public void organizer(){
        mesh = new Mesh();
        panelButtons = new PanelButtons();
        setSize(1200, 720);
        mesh.setPreferredSize(new Dimension(900,720));
        panelButtons.setPreferredSize(new Dimension(285, 720));
        addBackGround(mesh, panelButtons);
    }


    public void addBackGround(Mesh mesh, PanelButtons panelButtons){
        BackgroundImage imagPanel = new BackgroundImage ("src\\espaco\\images\\wallp.jpeg");
        imagPanel.setLayout(new BorderLayout());
        imagPanel.add(mesh, BorderLayout.WEST);
        imagPanel.add(panelButtons, BorderLayout.EAST);
        add(imagPanel);
    }

    public static JLabel createResizedImageLabel(String imagePath, int width, int height) {
        ImageIcon Icon = new ImageIcon(imagePath);
        Image Image = Icon.getImage();
        Image resizedImage = Image.getScaledInstance(width, height, Image.SCALE_SMOOTH);

        ImageIcon resizedIcon = new ImageIcon(resizedImage);
        JLabel label = new JLabel(resizedIcon);
        return label;
    }

    //classe para a imagem de fundo
    class BackgroundImage extends JPanel {
        private Image imagemDeFundo;
    
        public BackgroundImage(String caminhoImagem) {
            imagemDeFundo = new ImageIcon(caminhoImagem).getImage();
        }
    
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (imagemDeFundo != null) {
                g.drawImage(imagemDeFundo, 0, 0, getWidth(), getHeight(), (ImageObserver) this);
            }
        }
    }
    
    public void setMundos(List<Mundo> mundos) {
		this.mundos = mundos;
	}

	public void setDev(Dev dev) {
		this.dev = dev;
	}

	public void setBug(Bug bug) {
		this.bug = bug;
	}
	
	public PanelButtons getPanelButtons() {
		return panelButtons;
	}
	
	public Mesh getMesh() {
		return mesh;
	}
    
	public void setMesh(Mesh mesh) {
		this.mesh = mesh;
	}

//    public static void main(String[] args) {
//        // SwingUtilities.invokeLater(() -> new Frame());
//        new Frame();
//    }
}
