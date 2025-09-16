/*

3. Faça um programa que receba um número e mostre uma mensagem caso este número seja
maior que 80, menor que 25 ou igual a 40 enquanto o usuário não digitar o numero 40
o proghrama não se encerrará, vai repetir até ser digitado 40. 

*/

import java.util.Scanner;

public class exercicioTres {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número (o programa encerra com 40): ");
            numero = scanner.nextInt();

            if (numero > 80) {
                System.out.println("O número é maior que 80.");
            }
            if (numero < 25) {
                System.out.println("O número é menor que 25.");
            }
            if (numero == 40) {
                System.out.println("Você digitou 40. O programa será encerrado.");
            }

        } while (numero != 40);

        scanner.close();
    }
}