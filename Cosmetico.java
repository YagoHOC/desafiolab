public class Cosmetico extends Loja{
    
    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, Endereco endereco, Data datafundacao,int quantidadeMaximaProdutos,double taxaComercializacao){
        super(nome, quantidadeFuncionarios, endereco, datafundacao,quantidadeMaximaProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }
    public Cosmetico(String nome, int quantidadeFuncionarios,double salarioBaseFuncionario, Endereco endereco,Data datafundacao,int quantidadeMaximaProdutos,double taxaComercializacao){
        super(nome, quantidadeFuncionarios, endereco, datafundacao,quantidadeMaximaProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }
    public double getTaxaComercializacao(){
        return taxaComercializacao;
    }
    public void setTaxaComercializacao(double taxaComercializacao){
        this.taxaComercializacao = taxaComercializacao;
    }
    public String toString(){
        return super.toString()+" e sua taxa de Comercialização é "+taxaComercializacao;
    }
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Primeiro de Março","São Leopoldo","RS","Brasil","93010-210","821","Bourbon Shopping");
        Data data1 = new Data(23,04,2004);
        Cosmetico cosmetico = new Cosmetico("Perfumaria da Joyce",23,2500,endereco1,data1,10,200);
        System.out.print(cosmetico.toString());

    }
}