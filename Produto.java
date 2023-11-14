public class Produto {
    private String nome;
    private double preco;
    private Data datavalidade;
    public Produto(String nome,double preco,Data datavalidade){
        this.nome = nome;
        this.preco = preco;
        this.datavalidade = datavalidade;
    }//getters
    public String getNome(){
        return nome;
    }public double getPreco(){
        return preco;
    }public Data getDataValidade(){
        return datavalidade;
    }
    //setters
    public void setNome(String nome){
        this.nome = nome;
    }public void setPreco(double preco){
        this.preco = preco;
    }public void setDataValidade(Data datavalidade){
        this.datavalidade = datavalidade;
    }
    //tostring
    public String toString(){
        return "O nome do produto é "+nome+" e seu preço é "+preco+" reais e "+"sua validade vai até "+datavalidade;

    }public boolean estaVencido(Data minhadata){
        if (minhadata.getAno() > datavalidade.getAno()){
            return true;
        }else if(minhadata.getAno() == datavalidade.getAno() && minhadata.getMes()>=datavalidade.getMes()&& minhadata.getDia() >= datavalidade.getDia()){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        Data minhadata = new Data(1,1,2004);
        Data datavalidade = new Data(3,2,2003);
        Produto produto1 = new Produto("Carrinho",32,datavalidade);
        System.out.println(produto1.toString());
        System.out.println("Esta vencido? "+produto1.estaVencido(minhadata));

        
    }
}
