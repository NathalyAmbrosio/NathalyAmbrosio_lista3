/*um programa que leia dois valores inteiro e mostre todos os numeros entre eles
Nathaly
24/05/2023
 */
  
  import java.util.Scanner;
   
   public class NathalyAraujo_exercicio02 {
    public static void main (String args []) {
        Scanner leitor = new Scanner (System.in);

        System.out.println("Digite o primeiro valor inteiro");
        int val1 = leitor.nextInt();

        System.out.println("Digite o segundo valor inteiro");
        int val2 = leitor.nextInt();
         
         System.out.println("o numero entre " + val1 + " e " + val2 + " ");

         //analizar qual é o menor valor
         int mervl = Math.min(val1, val2);
         int maivl = Math.max(val1, val2);

         //Todos os numeros entre o menor e o maior valor
         for (int p = mervl + 1; p < maivl; p++){
            System.out.println(p + " "); 
         }

            System.out.println();
            
            leitor.close();

    }
   }
