public class Informatica extends Loja {
    
    private double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios, Endereco endereco, Data datafundacao,int quantidadeMaximaProdutos, double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, endereco, datafundacao,quantidadeMaximaProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data datafundacao,int quantidadeMaximaProdutos, double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, datafundacao,quantidadeMaximaProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }
    public double getSeguroEletronicos(){
        return seguroEletronicos;
    }
    public void setSeguroEletronicos(double seguroEletronicos){
        this.seguroEletronicos = seguroEletronicos;
    }
    public String toString(){
        return super.toString()+" e o valor mensal do seguro é "+seguroEletronicos;
    }
    
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Primeiro de Março","São Leopoldo","RS","Brasil","93010-210","821","Bourbon Shopping");
        Data data1 = new Data(23,04,2004);
        Informatica informatica = new Informatica("Digimer",23,2500,endereco1,data1,20,200);
        System.out.print(informatica.toString());

    }
    
}
