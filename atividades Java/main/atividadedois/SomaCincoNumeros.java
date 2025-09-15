package atividadedois;

import java.util.Scanner;

public class SomaCincoNumeros {
    public static void main(String[] args) {
//Exercício 2 – Somar 5 números

//Declaraçao
        int numero1, numero2, numero3, numero4, numero5, soma;   

//Entrada Dados
 
        Scanner Enter = new Scanner(System.in);

        System.out.println("digite o primeiro numero:");
        numero1 = Enter.nextInt();

        System.out.println("digite o segundo numero:");
        numero2 = Enter.nextInt();

        System.out.println("digite o terceiro numero:");
        numero3 = Enter.nextInt();

        System.out.println("digite o quarto numero:");
        numero4 = Enter.nextInt();

        System.out.println("digite o quinto numero:");
        numero5 = Enter.nextInt();
                   
//Processamento 
        soma = numero1 + numero2 + numero3 + numero4 + numero5;
//Saida
        System.out.println("a soma dos cinco numeros (" + numero1 + " + " + numero2 + " + " + numero3 + " + " + numero4 + " + " + numero5 + ") e: " + soma);














    }
    
}
