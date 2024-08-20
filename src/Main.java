public class Main {
    public static void main(String[] args) {
        // Criação de variáveis
        int idade = 17; // Idade da pessoa
        double altura = 1.85; // Altura em metros
        String nome = "Iuri"; // Nome da pessoa
        boolean eEstudante = true; // Indicador se a pessoa é estudante

        // Operações Simples
        int idade1 = 17;
        int idade2 = 25;
        int somaIdades = idade1 + idade2; // Soma de duas idades

        double alturaMultiplicada = altura * 2; // Multiplicação da altura por 2

        String saudacao = "Olá, " + nome + "!"; // Concatenação do nome com uma saudação

        // Exibição de Resultados
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Nome: " + nome);
        System.out.println("É estudante: " + eEstudante);
        System.out.println("Soma de idades: " + somaIdades);
        System.out.println("Altura multiplicada por 2: " + alturaMultiplicada);
        System.out.println("Saudação: " + saudacao);
    }
}