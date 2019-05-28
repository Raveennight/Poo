package aula04;
public class Caneta {
    private  String  modelo;
    private  float   ponta;
    private  boolean tampada;
    private  String  cor;
    // protected int carga;
    //-----Constructor
  
    public Caneta(String m, String c, float p) {
        this.modelo = m;
        this.cor = c;
        this.setPonta(p); 
        this.tampar();
    }

    //-----Getters
    public String getModelo() {
        return modelo;
    }

    public float getPonta() {
        return ponta;
    }

    //-----Setters
    public void setModelo(String m) {
        this.modelo = m;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }
    
    public void status() {
        System.out.println("Sobre a caneta:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Tampada ? " + this.tampada);
        System.out.println("cor: " + this.cor);
    }

    public void tampar() {
        this.tampada = true;        
    }

    public void destampar() {
        this.tampada = false;        
    }
}