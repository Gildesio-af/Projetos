package EspacoJaval;

public class ParOrdenado {
    private int posX;
    private int posY;
    private int eixoNorte;
    private int eixoSul;
    private int eixoOeste;
    private int eixoLeste;
    
    
    public void posicaoInicial(int posX, int posY) {
		this.setPosX(posX);
		this.setPosY(posY);
	}
	
	public void printLocAtual() {
		System.out.println("(" + this.getPosX() + "," + this.getPosY() + ")");
	}
	
    //Mover no eixo X norte
    public void moverNorte(){
        this.setPosX(posX - 1);
    }
    //Mover no eixo X sul
    public void moverSul(){
        this.setPosX(posX + 1);
    }
    //Mover no eixo Y leste
    public void moverOeste(){
        this.setPosY(posY - 1);
    }
    //Mover no eixo Y oeste
    public void moverLeste(){
        this.setPosY(posY + 1);
    }

    
    public int getPosX() {
        return posX;
    }
    public void setPosX(int posX) {
        this.posX = posX;
    }
    public int getPosY() {
        return posY;
    }
    public void setPosY(int posY) {
        this.posY = posY;
    }
    public int getEixoNorte() {
        return eixoNorte;
    }
    public void setEixoNorte(int eixoNorte) {
        this.eixoNorte = eixoNorte;
    }
    public int getEixoSul() {
        return eixoSul;
    }
    public void setEixoSul(int eixoSul) {
        this.eixoSul = eixoSul;
    }
    public int getEixoOeste() {
        return eixoOeste;
    }
    public void setEixoOeste(int eixoOeste) {
        this.eixoOeste = eixoOeste;
    }
    public int getEixoLeste() {
        return eixoLeste;
    }
    public void setEixoLeste(int eixoLeste) {
        this.eixoLeste = eixoLeste;
    }
}
