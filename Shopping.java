import java.util.Arrays;

public class Shopping {
    //Um Shopping possui os atributos nome
    //(do tipo String), endereco (do tipo Endereco) e lojas (que deve ser um
    //array de Loja).
    
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaLojas];
    }

    //getter
    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }
    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }
    public boolean insereLoja(Loja novaLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = novaLoja;
                return true; //sucesso
            }
        }
        return false; //falha
    }
    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true; // Loja removida com sucesso
            }
        }
        return false; // Loja não encontrada no array
    }
    
    public int quantidadeLojasPorTipo(String tipo) {
        int contador = 0;

        for (Loja loja : lojas) {
            if (loja != null && lojaPossuiCaracteristica(loja, tipo)) {
                contador++;
            }
        }

        // Se não encontrou nenhum tipo correspondente, retorna -1
        if (contador == 0 && !isTipoValido(tipo)) {
            return -1;
        }

        return contador;
    }

    // Método auxiliar para verificar se o tipo é válido
    private boolean isTipoValido(String tipo) {
        return tipo.equalsIgnoreCase("Cosmético") ||
               tipo.equalsIgnoreCase("Vestuário") ||
               tipo.equalsIgnoreCase("Bijuteria") ||
               tipo.equalsIgnoreCase("Alimentação") ||
               tipo.equalsIgnoreCase("Informática");
    }

    // Método auxiliar para verificar se a loja possui a característica desejada
    private boolean lojaPossuiCaracteristica(Loja loja, String tipo) {
        // Implemente a lógica específica para cada tipo de loja aqui
        // Exemplo genérico:
        if (loja instanceof Cosmetico && tipo.equalsIgnoreCase("Cosmético")) {
            return true;
        } else if (loja instanceof Vestuario && tipo.equalsIgnoreCase("Vestuário")) {
            return true;
        } else if (loja instanceof Bijuteria && tipo.equalsIgnoreCase("Bijuteria")) {
            return true;
        } else if (loja instanceof Alimentacao && tipo.equalsIgnoreCase("Alimentação")) {
            return true;
        } else if (loja instanceof Informatica && tipo.equalsIgnoreCase("Informática")) {
            return true;
        }
        return false;
    }
    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaMaisCara = null;
        double maiorValorSeguro = 0;
    
        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica informatica = (Informatica) loja;
                if (informatica.getSeguroEletronicos() > maiorValorSeguro) {
                    maiorValorSeguro = informatica.getSeguroEletronicos();
                    lojaMaisCara = informatica;
                }
            }
        }
    
        return lojaMaisCara;
    }


    //toString
    public String toString() {
        return "O nome do shopping é:" + nome + ", seu endereço é" + endereco.toString() + ", e suas lojas são " + Arrays.toString(lojas);
    }
}
