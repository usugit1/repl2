import java.util.Scanner;

public class Exemplo2 {
	// Programa para calcular a �rea de um c�rculo.
	public static void main(String[] args) {
        double raio;  //Vari�vel de entrada
        double area;  //Vari�vel de entrada
        final double pi = 3.14;  //Constante

        System.out.print("Informe o raio do c�rculo: ");  //Imprime uma instru�o para o usu�rio.

        Scanner r = new Scanner(System.in); // Cria um objeto do tipo Scanner para leitura do dado.
        raio = r.nextDouble();  //L� o dado informado pelo usu�rio e armazena na vari�vel "raio".
        r.close(); // Fecha o leitor de dados.

        //Calcula a �rea do c�rculo. O m�todo pow da classe Math faz a exponencia�o (raio elevado a 2).
        area = pi * Math.pow(raio, 2);

        System.out.println("A �rea do c�rculo �: " + area);  //Imprime o resultado para o usu�rio.
	}
}

