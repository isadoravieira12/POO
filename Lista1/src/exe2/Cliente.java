package exe2;

public class Cliente {
    public int nroAngencia, nroConta;
    public String nome;
    public float saldo;

    public Cliente(){
        this.nome = "sem nome";
    }
    public Cliente(int nroAngencia, int nroConta, String nome, float saldo) {
        this.nroAngencia = nroAngencia;
        this.nroConta = nroConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void depositar(float valor){
        this.saldo += valor;
        System.out.println("Depósito" + valor + "realizado com sucesso ");
    }

    public void sacar(float valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso ");
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }

    public void exibirDetalhes  (){
        System.out.println("Nro Agencia: " + this.nroAngencia + "Nro Conta: " + this.nroConta + "Nome: " + this.nome + "\nSaldo: " + this.saldo);
    }

}
