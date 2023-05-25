/*Faça um programa para calcular a média entre 500 números inseridos
Nathaly Ambrosio
25/05/2023
*/

import java.util.Scanner;
    public class NathalyAraujo_exercicio03 {
    public static void main(String args[]) {
    Scanner leitor = new Scanner(System.in);

        //criando variavel
        int conta, som, num;

        //iniciando
        conta = 0;
        som = 0;

        do {
            System.out.println("Digite um número");

            num = leitor.nextInt();

            som += num;
            conta++;
        } while (conta < 500);

        double media = (double) som / 500;

        System.out.println("a media dos numeros inseridos é " + media);

        leitor.close();  
    }
}
