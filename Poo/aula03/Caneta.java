package aula03;
public class Caneta {
    public      String  modelo;
    public      String  cor;
    private     float   ponta;
    protected   int     carga;
    private      boolean tampada;
    
    public void status(){
        System.out.println("Uma caneta " + this.cor );
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Está Tampada? " + this.tampada);
    }
    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO ! Caneta Está tampada!");
        } else {
            System.out.println("Estou Rabiscando");
        }

    }

    public void tampar() {
        if (this.tampada == true) {
            System.out.println("Caneta já está tampada!");
        } else {
            this.tampada = true;
        }
        
    }

    public void destampar() {
        this.tampada = false;
    }
}