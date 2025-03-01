package exe3;

public class Produto {
    public int id, qtde;
    public String descricao;
    public double preco;

    public Produto(){
        this.descricao = "sem descrição";
    }

    public Produto(int id, String descricao, int qtde, double preco){
        this.id = id;
        this.qtde = qtde;
        this.descricao = descricao;
        this.preco = preco;
    }

    public void Comprar(int x){
        this.qtde += x;
        System.out.println("ICompra realizada com sucesso!");
    }
    public void subir(float x){
        this.preco += x;
        System.out.println("Aumento do preço realizada com sucesso!");
    }
    public void vender(int x){
        if(this.qtde <= x){
            this.qtde -= x;
            System.out.println("Venda realizada com sucesso!");
        }
        else{
            System.out.println("Impossivel realizar a venda");
        }
    }
    public void descer(float x){
        if(this.preco >= x){
            this.preco -= x;
            System.out.println("Preço diminuido com sucesso!");
        }
        else{
            System.out.println("Impossivel diminuir preço.");

        }
    }
    public void mostra(){
        System.out.println("Id: " + this.id + "Descrição: " + this.descricao + "Qtde: " + this.qtde + "Preço: " + this.preco);
    }
}
