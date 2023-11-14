public class Vestuario extends Loja{

    private boolean produtosImportados;
    public Vestuario(String nome, int quantidadeFuncionarios, Endereco endereco,Data datafundacao,boolean produtosImportados,int quantidadeMaximaProdutos){
        super(nome, quantidadeFuncionarios, endereco, datafundacao,quantidadeMaximaProdutos);
        this.produtosImportados = produtosImportados;
    }
    public Vestuario(String nome, int quantidadeFuncionarios,double salarioBaseFuncionario, Endereco endereco,Data datafundacao,boolean produtosImportados,int quantidadeMaximaProdutos){
        super(nome, quantidadeFuncionarios, endereco, datafundacao,quantidadeMaximaProdutos);
        this.produtosImportados = produtosImportados;
    }
    public boolean getProdutosImportados(){
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados){
        this.produtosImportados = produtosImportados;
    }
    public String toString(){
        String statusProdutosImportados = produtosImportados ? "aceita produtos importados" : "não aceita produtos importados";
        return super.toString() + " e a loja " + statusProdutosImportados;
    }
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Primeiro de Março","São Leopoldo","RS","Brasil","93010-210","821","Bourbon Shopping");
        Data data1 = new Data(23,04,2004);
        Vestuario vestuario = new Vestuario("Renner",100,2500.0,endereco1,data1,true,10);
        System.out.print(vestuario.toString());

    }


}