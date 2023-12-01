package model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class FileCsv {
	private File file10, file50, file100, file500, file1000, file1500, file2000;
	private ArrayList<String[]> listFile10, listFile50, listFile100, listFile500, listFile1000, listFile1500, listFile2000;
	
	//Contem todos os dados de um arquivo separado por linha
	private String[][] dataMatriz10, dataMatriz50, dataMatriz100, dataMatriz500, dataMatriz1000, dataMatriz1500, dataMatriz2000;
	
	public FileCsv() {
		startFiles();
		dataMatriz10 = readFile(file10, 10, listFile10);
		dataMatriz50 = readFile(file50, 50, listFile50);
		dataMatriz100 = readFile(file100, 100, listFile100);
		dataMatriz500 = readFile(file500, 500, listFile500);
		dataMatriz1000 = readFile(file1000, 1000, listFile1000);
		dataMatriz1500 = readFile(file1500, 1500, listFile1500);
		dataMatriz2000 = readFile(file2000, 2000, listFile2000);
//		readFile(file50, 50, listFile50, dataMatriz50);
//		readFile(file100, 100, listFile100, dataMatriz100);
//		readFile(file500, 500, listFile500, dataMatriz500);
//		readFile(file1000, 1000, listFile1000, dataMatriz1000);
//		readFile(file1500, 1500, listFile1500, dataMatriz1500);
//		readFile(file1500, 1500, listFile1500, dataMatriz1500);
	}
	
	public void startFiles() {
		file10 = new File("src\\files\\AE_10.csv");
		file50 = new File("src\\files\\AE_50.csv");
		file100 = new File("src\\files\\AE_100.csv");
		file500 = new File("src\\files\\AE_500.csv");
		file1000 = new File("src\\files\\AE_1000.csv");
		file1500 = new File("src\\files\\AE_1500.csv");
		file2000 = new File("src\\files\\AE_2000.csv");
	}
	
	public String [][] readFile(File file, int tamanho, ArrayList<String[]> listFile) {
		String [][] dataMatrix = new String[tamanho][10];
		Scanner scanner = null;
		String[] data = null;
		listFile = new ArrayList<String[]>();
		try {
			scanner = new Scanner(file);
			
			//Adicinas em uma ArrayList
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				data = line.split(",");
				listFile.add(data);
				
			}
			listFile.remove(0);
			
			for (int i = 0; i < listFile.size(); i++) {
				String[] teste = listFile.get(i);
				for (int j = 0; j < teste.length; j++) {
					dataMatrix[i][j] = teste[j]; 
//					System.out.print(teste[j] + "/");
					
				}
//				System.out.println();
			}
//			for (int i = 0; i < tamanho; i++) {
//				for (int j = 0; j < 10; j++) {
//					System.out.print(dataMatrix[i][j] + "/");
//				}
//				System.out.println();
//			}
//					
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(scanner != null) {
				scanner.close();
			}
		}
		return dataMatrix;
	}
	
	public String[][] identifyDataMatrix(int value) {
		String[][] dados = null;
		
        switch (value) {
        case 10:
        	dados = getDataMatriz10();
            break;
        case 50:
        	dados = getDataMatriz50();
            break;
        case 100:
        	dados = getDataMatriz100();
            break;
        case 500:
        	dados = getDataMatriz500();
            break;
        case 1000:
        	dados = getDataMatriz1000();
            break;
        case 1500:
        	dados = getDataMatriz1500();
            break;
        case 2000:
        	dados = getDataMatriz2000();
            break;
        default:
            JOptionPane.showMessageDialog(null, "Erro na passagem dos dados");
        }
        return dados;
	}

	public String[][] getDataMatriz10() {
		return dataMatriz10;
	}

	public String[][] getDataMatriz50() {
		return dataMatriz50;
	}

	public String[][] getDataMatriz100() {
		return dataMatriz100;
	}

	public String[][] getDataMatriz500() {
		return dataMatriz500;
	}

	public String[][] getDataMatriz1000() {
		return dataMatriz1000;
	}

	public String[][] getDataMatriz1500() {
		return dataMatriz1500;
	}

	public String[][] getDataMatriz2000() {
		return dataMatriz2000;
	}
}
