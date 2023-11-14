public class Alimentacao extends Loja {

    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, Endereco endereco,Data datafundacao,Data dataAlvara,int quantidadeMaximaProdutos){
        super(nome, quantidadeFuncionarios, endereco, datafundacao,quantidadeMaximaProdutos);
        this.dataAlvara = dataAlvara;
    }
    public Alimentacao(String nome, int quantidadeFuncionarios,double salarioBaseFuncionario, Endereco endereco,Data datafundacao,Data dataAlvara,int quantidadeMaximaProdutos){
        super(nome, quantidadeFuncionarios, endereco, datafundacao,quantidadeMaximaProdutos);
        this.dataAlvara = dataAlvara;
    }
    public Data getDataAlvara(){
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara){
        this.dataAlvara = dataAlvara;
    }
    public String toString(){
        return super.toString() + " e a data de recebimento do alvará é " + dataAlvara.toString();
    }
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Primeiro de Março","São Leopoldo","RS","Brasil","93010-210","821","Bourbon Shopping");
        Data data1 = new Data(23,04,2004);
        Data dataAlvara1 = new Data(23,04,2025);
        Alimentacao alimentacao = new Alimentacao("Burguer King",200,2500,endereco1,data1,dataAlvara1,10);
        System.out.print(alimentacao.toString());

    }


}
