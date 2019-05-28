package aula05;

public class  Conta{
    public      int     numConta;
    protected   String  tipo; //cc ou cp only
    private     String  dono;
    private     float   saldo;
    private     boolean status;

    public void estadoAtual(){
        System.out.println("-------------------- ");
        System.out.println("Conta: " + this.getNumConta() );
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Status: " + this.getStatus());
    }
    public void abrirContra(String t) {
        setTipo(t);
       this.setStatus(true); // ao abrir a contra status fica verdadeiro

        if (t == "CC" ) {
            this.setSaldo(50f);
        } else if(t == "CP"){
            this.setSaldo(150f);
        }
        System.out.println("Conta Aberta com Sucesso!");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0 ) {
            System.out.println("Conta com Dinheiro!");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta Contém Debitos!");
        } else{
           this.setStatus(false);// ao fechar a contra status fica Falso
           System.out.println("Conta Fechada com sucesso!");
        }
    }

    public void depositar(float v) {
        if (this.getStatus() == true) {
            this.setSaldo(this.getSaldo()+v);
            System.out.println("Deposito Realizado com sucesso!");
        } else {
            System.out.println("Impossivel Realizar deposito, Conta fechada/bloqueada!");
        }
    }

    public void sacar(float v) {
        if (this.getStatus() == true) {
            if (this.getSaldo() > v) {
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Saque Realizado com Sucesso!");
            } else {
                System.out.println("Saldo Insuficiente");
            }
        } else {
            System.out.println("Impossivel Realizar saque, Conta fechada/bloqueada!"); 
        }
    }

    public void pagarMensal() {
        int v = 0;

        if (getTipo() == "CC"){
            v = 12;
        } else if (getTipo() == "CP") {
            v = 20;
        } 

        if (this.getStatus() == true) {
            if (this.getSaldo() > v) {
                this.setSaldo(this.getSaldo()- v);
                System.out.println("Mensalidade Paga com sucesso!");
            } else {
                System.out.println("Saldo Insuficiente");
            }
        } else {
            System.out.println("Conta fechada/bloqueada!"); 
        }
    }
    // -----Construtor--------------------------------------
    public Conta(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    // -----Get e Set---------------------------------------
    
    public void setNumConta(int n) {
        this.numConta = n;
    }
    public int getNumConta() {
        return numConta;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }
    public String getTipo() {
        return tipo;
    }

    public void setDono(String d) {
        this.dono = d;
    }
    public String getDono() {
        return dono;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }
    public float getSaldo() {
        return saldo;
    }

    public void setStatus(boolean s) {
        this.status = s;
    }
    public boolean getStatus() {
        return status;
    }

}