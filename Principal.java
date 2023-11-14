public class Principal {
    public static void main(String[] args) {
        Loja loja = null;
        Produto produto = null;

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("(1) Criar uma loja");
            System.out.println("(2) Criar um produto");
            System.out.println("(3) Sair");
            
            int escolha = Teclado.leInt();

            if (escolha==1){
                String nomeLoja = Teclado.leString("Digite o nome da loja:");
                int quantidadeFuncionarios = Teclado.leInt("Digite a quantidade de funcionários da loja:");
                double salarioBase = Teclado.leDouble("Digite o salário base dos funcionários");
                String ruaEnderecoLoja = Teclado.leString("Digite o a rua endereço da loja:");
                String cidadeEnderecoLoja = Teclado.leString("Digite a cidade do endereço da loja:");
                String estadoEnderecoLoja = Teclado.leString("Digite o estado do endereço da loja:");
                String paisEnderecoLoja = Teclado.leString("Digite o país do endereço da loja:");
                String cepEnderecoLoja = Teclado.leString("Digite o CEP do endereço da loja:");
                String numeroEnderecoLoja = Teclado.leString("Digite o número do endereço da loja:");
                String complementoEnderecoLoja = Teclado.leString("Digite o complemento do endereço da loja:");
                int quantidadeMaxProdutosLoja = Teclado.leInt("Digite o número máximo de produtos do estoque da loja");
                int diaFundacao = Teclado.leInt("Digite o dia de fundação da loja:");
                int mesFundacao = Teclado.leInt("Digite o mês de fundação da loja:");
                int anoFundacao = Teclado.leInt("Digite o ano de fundação da loja:");
                loja = new Loja(nomeLoja,quantidadeFuncionarios,salarioBase,new Endereco(ruaEnderecoLoja, cidadeEnderecoLoja, estadoEnderecoLoja, paisEnderecoLoja, cepEnderecoLoja, numeroEnderecoLoja, complementoEnderecoLoja),new Data(diaFundacao,mesFundacao,anoFundacao),quantidadeMaxProdutosLoja);
                System.out.println("Loja criada com sucesso!");
                System.out.println("Informações da loja:");
                System.out.println(loja.toString());
            }else if(escolha==2){
                if (loja == null) {
                    System.out.println("Você precisa criar uma loja antes de criar um produto.");
                }
                    String nomeProduto = Teclado.leString("Digite o nome do produto:");
                    double precoProduto = Teclado.leDouble("Digite o preço do produto:");
                    int diaValidade = Teclado.leInt("Digite o dia de validade do produto:");
                    int mesValidade = Teclado.leInt("Digite o mês de validade do produto:");
                    int anoValidade = Teclado.leInt("Digite o ano de validade do produto:");
                    Data minhaDataVal = new Data(diaValidade, mesValidade,anoValidade);
                    produto = new Produto(nomeProduto,precoProduto,minhaDataVal);
                    System.out.println("Produto criado com sucesso!");
                    System.out.println("Informações do produto:");
                    System.out.println(produto.toString());
                    if (produto.estaVencido(new Data(20,10,2023))){
                        System.out.println("PRODUTO NÃO VENCIDO.");
                    }else{
                        System.out.println("PRODUTO VENCIDO.");
                    }
            }else if (escolha==3){
                    System.out.println("Saindo do programa.");
                    System.exit(0);
            }else{
                System.out.println("Opção inválida. Tente novamente.");
            }
}
}
}