public class Bijuteria extends Loja {
    
    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, Endereco endereco, Data datafundacao,int quantidadeMaximaProdutos, double metaVendas) {
        super(nome, quantidadeFuncionarios, endereco, datafundacao,quantidadeMaximaProdutos);
        this.metaVendas = metaVendas;
    }
    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data datafundacao,int quantidadeMaximaProdutos, double metaVendas) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, datafundacao,quantidadeMaximaProdutos);
        this.metaVendas = metaVendas;
    }
    public double getMetaVendas(){
        return metaVendas;
    }
    public void setMetaVendas(double metaVendas){
        this.metaVendas = metaVendas;
    }
    public String toString(){
        return super.toString()+" e a meta de vendas é "+metaVendas;
    }
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Primeiro de Março","São Leopoldo","RS","Brasil","93010-210","821","Bourbon Shopping");
        Data data1 = new Data(23,04,2004);
        Bijuteria bijuteria = new Bijuteria("Bijus da Marcia",23,2500,endereco1,data1,10,200);
        System.out.print(bijuteria.toString());

    }
    
}
