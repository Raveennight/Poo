package aula05;
/**
 * Banco
 */
public class Banco {
    public static void main(String[] args) {
        Conta p1 = new Conta();
        p1.setNumConta(11111);
        p1.setDono("Jubileu");
        p1.abrirContra("CC");
        
        Conta p2 = new Conta();
        p2.setNumConta(22222);
        p2.setDono("Creusa");
        p2.abrirContra("CP");
        
        p1.depositar(100);
        p2.depositar(500);

        p1.sacar(150);

        p1.fecharConta();
       
        p1.estadoAtual();
        p2.estadoAtual();
    }
}
