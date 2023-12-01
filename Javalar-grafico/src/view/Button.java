package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.UIManager;

import org.w3c.dom.events.MouseEvent;

public class Button extends JButton{

    public Button(String txt){
        setSize(new Dimension(150,100));
        setText(txt);
        setFocusPainted(false);
        setFont(new Font("eras light itc", Font.BOLD, 20));

        setForeground(Color.WHITE);
    }
}
