package view;

import javax.swing.*;

import EspacoJaval.Bug;
import EspacoJaval.Dev;
import EspacoJaval.Mundo;
import java.awt.*;
import java.util.ArrayList;


public class Mesh extends JPanel {
	private int removeIndex = 0;
    private Cell cell;
    protected ArrayList<Cell> cellList;
    private ArrayList<JLabel> bugs;
    private ArrayList<JLabel> devs;
    
    
    private static final int TAMANHO = 15;
    private static final int LARGURA_CELULA = 40;
    private static final int ALTURA_CELULA = 40;
	private JPanel bug = new JPanel();
	private JPanel dev = new JPanel();

    public Mesh() {
    	bugs = new ArrayList<JLabel>();
    	devs = new ArrayList<JLabel>();
    	bug.add(EditImage.createResizedImageLabel("src\\espaco\\images\\dev.jpeg", 60,45));
    	dev.add(EditImage.createResizedImageLabel("src\\espaco\\images\\bug.jpeg", 60,45));
        cellList = new ArrayList<Cell>();
        setOpaque(false);
        setLayout(new GridLayout(TAMANHO, TAMANHO, 2, 2));

        // Gerar cells
        for (int i = TAMANHO; i >= 1; i--) {
            for (int j = TAMANHO; j >= 1; j--) {
                Cell cell = new Cell(j, i);
                add(cell);
                cellList.add(cell);
            }
        }
        

        setSize(TAMANHO * LARGURA_CELULA, TAMANHO * ALTURA_CELULA);
        addJava(cellList);
//        addPlanets();
        createBugsDevs();
        
    }

    public void createBugsDevs() {
    	for (int i = 0; i < 225; i++) {
			JLabel bug = EditImage.createResizedImageLabel("src\\espaco\\images\\bug.jpeg", 60,45);
			JLabel dev = EditImage.createResizedImageLabel("src\\espaco\\images\\dev.jpeg", 60,45);
			bugs.add(bug);
			devs.add(dev);
		}
    }

    private void addPlanets(){

    	cellList.get(7).add(EnumImage.C.getPanelImage());
        cellList.get(22).add(EnumImage.CPLUSPLUS.getPanelImage());
        cellList.get(37).add(EnumImage.CSHARP.getPanelImage());
        cellList.get(52).add(EnumImage.PHP.getPanelImage());
        cellList.get(67).add(EnumImage.RUBY.getPanelImage());
        cellList.get(82).add(EnumImage.JS.getPanelImage());
        cellList.get(97).add(EnumImage.PYTHON.getPanelImage());
    }

    public void addJava(ArrayList<Cell> list){
        for (Cell cell : cellList) {
            if(cell.x == 8 && cell.y == 8){
                JLabel label = EditImage.createResizedImageLabel("src\\espaco\\images\\jav.jpeg", 60, 45);
                cell.add(label, BorderLayout.CENTER);
            }
        }
    }
    
    //Vai receber um
    public void move(java.util.List<Mundo> mundos) {
    	int x, y;
    	for (Mundo mundo : mundos) {
    		x = mundo.getCordenadas().getPosX();
			y = mundo.getCordenadas().getPosY();
			
			if(mundo.getNome().equalsIgnoreCase("C") && mundo.isVivo()){
				cellList.get(findIndex(x, y)).add(EnumImage.C.getPanelImage());
			}else if(mundo.getNome().equalsIgnoreCase("CPlusPlus")) {
				cellList.get(findIndex(x, y)).add(EnumImage.CPLUSPLUS.getPanelImage());
			}else if(mundo.getNome().equalsIgnoreCase("C Sharp")) {
				cellList.get(findIndex(x, y)).add(EnumImage.CSHARP.getPanelImage());
			}else if(mundo.getNome().equalsIgnoreCase("PHP")) {
				cellList.get(findIndex(x, y)).add(EnumImage.PHP.getPanelImage());
			}else if(mundo.getNome().equalsIgnoreCase("Ruby on rails")) {
				cellList.get(findIndex(x, y)).add(EnumImage.RUBY.getPanelImage());
			}else if(mundo.getNome().equalsIgnoreCase("Javascript")) {
				cellList.get(findIndex(x, y)).add(EnumImage.JS.getPanelImage());
			}else if(mundo.getNome().equalsIgnoreCase("Python")){
				cellList.get(findIndex(x, y)).add(EnumImage.PYTHON.getPanelImage());
			}
		}
    	repaint();
    }
    
    public int findIndex(int x, int y) {
    	int index = (15 - y) * 15 + (15 - x);
       	return index;
    }
    
    public void addDev(Dev dev){
    	int index = 0;
    	for (int i = 0; i < dev.posX.size(); i++) {
			index = findIndex(dev.posX.get(i), dev.posY.get(i));
			cellList.get(index).dev1(devs.get(index));
		}
    	revalidate();
        repaint();
    }
    
    public void addBug(Bug bug){
    	int index = 0;
    	for (int i = 0; i < bug.posX.size(); i++) {
			index = findIndex(bug.posX.get(i), bug.posY.get(i));
			cellList.get(index).bug1(bugs.get(index));
		}
    	revalidate();
    	repaint();
    }
    
    public void removeBug(int x, int y) {
    	int index = findIndex(x, y);
    	cellList.get(index).removeBug();
    	revalidate();
    	repaint();
    }
    
    public void removeDev(int x , int y) {
    	int index = findIndex(x, y);
    	cellList.get(index).removeDev();
    	revalidate();
    	repaint();
    }

	public void setBug(JPanel bug) {
		this.bug = bug;
	}

	public void setDev(JPanel dev) {
		this.dev = dev;
	}
    
    
}

