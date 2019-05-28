package aula02;
public class Caneta {
    String  modelo;
    String  cor;
    float   ponta;
    int     carga;
    boolean tampada;
    void status(){
        System.out.println("Uma caneta " + this.cor );
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Está Tampada? " + this.tampada);
    }
    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO ! Caneta Está tampada!");
        } else {
            System.out.println("Estou Rabiscando");
        }

    }

    void tampar() {
        if (this.tampada == true) {
            System.out.println("Caneta já está tampada!");
        } else {
            this.tampada = true;
        }
        
    }

    void destampar() {
        this.tampada = false;
    }
}