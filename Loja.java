import java.util.Arrays;

public class Loja {
        private String nome;
        private int quantidadeFuncionarios;
        private double salarioBaseFuncionario;
        private Endereco endereco;
        private Data datafundacao;
        private Produto[] estoqueProdutos;

        //construtores
        public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,Data datafundacao,int quantidadeMaximaProdutos){
            this.nome = nome;
            this.quantidadeFuncionarios = quantidadeFuncionarios;
            this.salarioBaseFuncionario = salarioBaseFuncionario;
            this.endereco = endereco;
            this.datafundacao = datafundacao;
            this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
        }
        public Loja(String nome, int quantidadeFuncionarios, Endereco endereco,Data datafundacao,int quantidadeMaximaProdutos){
            this.nome = nome;
            this.quantidadeFuncionarios = quantidadeFuncionarios;
            this.salarioBaseFuncionario = -1;
            this.endereco = endereco;
            this.datafundacao = datafundacao;
            this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
        }       
        //getters
        public String getNome(){
            return nome;
        }public int getQuantidadeFuncionarios(){
            return quantidadeFuncionarios;
        }public double getSalarioBaseFuncionario(){
            return salarioBaseFuncionario;
        }public Data getDataFundacao(){
            return datafundacao;
        }public Endereco getEndereco(){
            return endereco;
        }public Produto[] getEstoqueProdutos() {
            return estoqueProdutos;
        }
        //setters
        public void setNome(String nome){
            this.nome = nome;
        }
        public void setQuantidadeFuncionarios(int quantidadeFuncionariosn){
            this.quantidadeFuncionarios = quantidadeFuncionariosn;
        }public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
            this.salarioBaseFuncionario = salarioBaseFuncionario;
        }public void setDataFundacao(Data datafundacao){
            this.datafundacao=datafundacao;
        }public void setEndereco(Endereco endereco){
            this.endereco=endereco;
        }public void setEstoqueProdutos(Produto[] estoqueProdutos) {
            this.estoqueProdutos = estoqueProdutos;
        }
        //tostring
        public String toString() {
            return "Loja: " + nome + " \nQuantidade de Funcionários: " + quantidadeFuncionarios
                    + " \nSalário Base dos Funcionários: " + salarioBaseFuncionario+" \nO endereço é "+endereco.toString()+" \nA sua data de fundação é "+datafundacao.toString()+" E seu estoque é o seguinte: "+Arrays.toString(estoqueProdutos);
        }//calculo gastos
        public double gastosComSalario(){
            if (salarioBaseFuncionario == -1){
                return -1;
        }else{
            return salarioBaseFuncionario*quantidadeFuncionarios;
        }
        }//tamanho
        public char tamanhoDaLoja(){
            if (quantidadeFuncionarios<10){
                return 'P';
            }else if(quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30){
                return 'M';
            }else{
                return 'G';
            }
            
        }public void imprimeProdutos() {
            System.out.println("Produtos na loja:");
            for (Produto produto : estoqueProdutos) {
                if (produto != null) {
                    System.out.println(produto.toString());
                }
            }
        }
        
        public boolean insereProduto(Produto novoProduto) {
            for (int i = 0; i < estoqueProdutos.length; i++) {
                if (estoqueProdutos[i] == null) {
                    estoqueProdutos[i] = novoProduto;
                    return true;//sucesso
                }
            }
            return false;//false
        }
        public boolean removeProduto(String nomeProduto) {
            for (int i = 0; i < estoqueProdutos.length; i++) {
                if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)) {
                    estoqueProdutos[i] = null;
                    return true; // Produto removido com sucesso
                }
            }
            return false; // Produto não encontrado no estoque
        }
        public static void main(String[] args) {
            Endereco endereco = new Endereco("Teste","Teste","Teste","Teste","Teste","Teste","Teste");
            Data data = new Data(2,2,2002);
            Loja loja1 = new Loja("Jorge",3,32,endereco,data,30);
            System.out.println(loja1.toString());
        }

}
