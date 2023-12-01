package view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class EditImage {
    
    public static JLabel createResizedImageLabel(String imagePath, int width, int height) {
        ImageIcon Icon = new ImageIcon(imagePath);
        Image Image = Icon.getImage();
        Image resizedImage = Image.getScaledInstance(width, height, Image.SCALE_SMOOTH);

        ImageIcon resizedIcon = new ImageIcon(resizedImage);
        JLabel label = new JLabel(resizedIcon);
        label.setOpaque(false);
        return label;
    }
}
