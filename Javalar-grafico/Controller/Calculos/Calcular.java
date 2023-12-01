package Calculos;

import java.util.ArrayList;
import java.util.List;

import EspacoJaval.Mundo;
import Interacao.LeituraDados;

public class Calcular{
    private int area, xMaior, xMenor, yMaior, yMenor, base, altura, deltaX, deltaY;
    protected double distancia, somaVelocidade;
    
    
	public int calcArea(Mundo m1, Mundo m2){
        if(m1.getCordenadas().getPosX() != m2.getCordenadas().getPosX()){ 

            if(m1.getCordenadas().getPosX() > m2.getCordenadas().getPosX()){
            	this.setxMaior(m1.getCordenadas().getPosX());
            	this.setxMenor(m2.getCordenadas().getPosX());
            }else{
            	this.setxMaior(m2.getCordenadas().getPosX());
            	this.setxMenor(m1.getCordenadas().getPosX());
            }
            
            if(m1.getCordenadas().getPosY() > m2.getCordenadas().getPosY()){
            	this.setyMaior(m1.getCordenadas().getPosY());
            	this.setyMenor(m2.getCordenadas().getPosY());
            }else{
            	this.setyMaior(m2.getCordenadas().getPosY());
            	this.setyMenor(m1.getCordenadas().getPosY());
            }
        
            
            base = 1 + getxMaior() - getxMenor();
            altura = 1 + getyMaior() - getyMenor() ;
            
            
            this.setArea(getBase() * getAltura());
        
        }else if(m1.getCordenadas().getPosX() == m2.getCordenadas().getPosX()) {//Se eles tiverem na mesma posicao x
        	if(m1.getCordenadas().getPosX() > m2.getCordenadas().getPosX()){
                this.setyMaior(m1.getCordenadas().getPosX());
                this.setyMenor(m2.getCordenadas().getPosX());
            }else{
                this.setyMaior(m2.getCordenadas().getPosX());
                this.setyMenor(m1.getCordenadas().getPosX());
            }
        	this.setArea(this.getyMaior() - this.getyMenor() + 1);  	
        }
        return Math.abs(area);
    }
    
    public double calcDistancia(Mundo m1, Mundo m2) {
    	this.setDeltaX(m1.getCordenadas().getPosX() - m2.getCordenadas().getPosX());
    	this.setDeltaY(m1.getCordenadas().getPosY() - m2.getCordenadas().getPosY());
    	distancia = Math.sqrt(this.getDeltaX() * this.getDeltaX() + this.getDeltaY() * this.getDeltaY());
    	
    	return distancia;
    }
    
    
    public void somatorioInstantes(LeituraDados leitura, int instantes) {
    	leitura.setQntInstantesTotal(leitura.getQntInstantesTotal() + instantes);
    }
    
    public void calcVelocidadeMedia(List<Mundo> mundos) {
			for (Mundo mundo : mundos) {
				try {
					mundo.setvMedia((mundo.getContVoltas() / mundo.getDeslocamento()));
				} catch (ArithmeticException e) {
					System.out.println("doideraaa");
				}
			}
    }
    
    public int getArea() {
        return area;
    }
    public void setArea(int area) {
        this.area = area;
    }
    public int getxMaior() {
        return xMaior;
    }
    public void setxMaior(int xMaior) {
        this.xMaior = xMaior;
    }
    public int getxMenor() {
        return xMenor;
    }
    public void setxMenor(int xMenor) {
        this.xMenor = xMenor;
    }
    public int getyMaior() {
        return yMaior;
    }
    public void setyMaior(int yMaior) {
        this.yMaior = yMaior;
    }
    public int getyMenor() {
        return yMenor;
    }
    public void setyMenor(int yMenor) {
        this.yMenor = yMenor;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public int getDeltaX() {
		return deltaX;
	}

	public void setDeltaX(int deltaX) {
		this.deltaX = deltaX;
	}

	public int getDeltaY() {
		return deltaY;
	}

	public void setDeltaY(int deltaY) {
		this.deltaY = deltaY;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
}