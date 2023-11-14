/*Data: esta classe possui os atributos dia, mes (sem acento) e ano, todos do
tipo inteiro. Esta classe possui os seguintes métodos:
o Método Construtor: crie 1 construtor que um recebe parâmetros para
inicializar todos os atributos. Neste construtor, você deve validar a data
informada nos parâmetros. Ou seja, o método construtor deve verificar se o
dia é condizente com o mês, levando em conta, também, o fato de o ano
poder ser bissexto. Por exemplo, o dia 29 para o mês 2 só pode ser atribuído
em anos bissextos. Caso a data seja inválida, o método construtor deve
imprimir uma mensagem de erro e alterar a data para a seguinte data padrão:
1/1/2000.
o Métodos de acesso: crie os métodos de acesso (getters e setters)
para todos os atributos da classe.
o Método toString: se necessário, pesquise sobre o método toString e
implemente-o nesta classe, retornando uma String que representa a data
no formato dia/mês/ano.
o Método verificaAnoBissexto: este método não recebe parâmetros e
retorna verdadeiro caso o ano seja bissexto e falso caso contrário. 
*/
public class Data{
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (validarData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida. A data foi definida como 1/1/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
        }
        public int getDia() {
            return dia;
        }
        //setter
        public void setDia(int dia) {
            if (validarData(dia, mes, ano)) {
                this.dia = dia;
            } else {
                System.out.println("Data inválida. O dia não foi alterado.");
            }
        }
        //getter mes
        public int getMes() {
            return mes;
        }
        //setter mes
        public void setMes(int mes) {
            if (validarData(dia, mes, ano)) {
                this.mes = mes;
            } else {
                System.out.println("Data inválida. O mês não foi alterado.");
            }
        }
        //getter ano
        public int getAno() {
            return ano;
        }
        //setter ano
        public void setAno(int ano) {
            if (validarData(dia, mes, ano)) {
                this.ano = ano;
            } else {
                System.out.println("Data inválida. O ano não foi alterado.");
            }
        }
        //tostring
        public String toString() {
            return dia + "/" + mes + "/" + ano;
        }
        //verificar bissexto
        public boolean verificaAnoBissexto() {
            return (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0));
        }
    
        private boolean validarData(int dia, int mes, int ano) {
            if (ano < 1 || mes < 1 || mes > 12 || dia < 1) {
                return false;
            }
            int[] diasNoMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (verificaAnoBissexto()) {
                diasNoMes[2] = 29; 
            }
            return dia <= diasNoMes[mes];
        }
        
}