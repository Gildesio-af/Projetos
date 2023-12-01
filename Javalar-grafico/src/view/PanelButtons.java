package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


import javax.swing.JPanel;

import EspacoJaval.Mundo;


public class PanelButtons extends JPanel{
    private List<Button> buttons = new ArrayList<Button>();
    private Button button;
    private List<Mundo> mundoss;

    public PanelButtons(){
        setSize(300,720);
        setOpaque(false);
        setLayout(null);
        organizer();
        
    }

    public void organizer(){


        buttons.add(createButton("<html><center>Processar próximo <br>instante<center><html>"));
        buttons.add(createButton("<html><center>Ler novo arquivo<br> de entrada<center><html>"));
        buttons.add(createButton("Gravar Relatório"));
        buttons.add(createButton("<html><center>Ler dados de outros<br> participantes<center><html>"));
        buttons.add(createButton("Gravar arquivo de saída"));

        // for (Button button : buttons) {
        //     int i = 1;
        //     add(configureButton(button, i));
        //     i++;
        // // }
        // for (int i = 0; i < 5; i++) {
        //     add(configureButton(buttons.get(i)));
        // }
        addButtons(buttons);

        buttons.get(0).addActionListener(ActionListener -> {
            
        });
    }

    //Adiciona os botoes em sua posicoes certas
    public void addButtons(List<Button> buttons){
        int y = 150;
        for (Button button : buttons) {
            JPanel panel = configureButton(button);
            add(panel);
            panel.setBounds(0, y, 300, 120);
            y += 70;
        }    
    }

    //Configure os botoes e adicina eles a um panel
    public JPanel configureButton(Button button) {
        JPanel panel = new JPanel();  
        button.setOpaque(false);
        panel.setOpaque(false);

        panel.setPreferredSize(new Dimension(285, 100));
        panel.add(button);

        button.setFocusPainted(false);
        button.setContentAreaFilled(false);//Ocultar parte grafica do botao
        //button.setBorderPainted(false);

        return panel;
    }

    public Button createButton(String text){
        button = new Button(text);
        return button;
    }
    
    public List<Button> getButtons() {
		return buttons;
	}
}
