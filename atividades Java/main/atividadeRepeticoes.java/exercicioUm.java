/* 

1. Escrever um programa que leia o nome e o sexo de 56 pessoas e 
informe o nome e se ela é homem ou mulher. 
No final informe total de homens e de mulheres.

*/
import java.util.Scanner;

public class exercicioUm {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int totalHomens = 0;
        int totalMulheres = 0;

        for (int i = 1; i <= 56; i++) {
            System.out.print("Digite o nome da " + i + "ª pessoa: ");
            String nome = scanner.next();

            System.out.print("Digite o sexo (M para Masculino, F para Feminino): ");
            char sexo = scanner.next().toUpperCase().charAt(0);

            if (sexo == 'M') {
                System.out.println(nome + " é homem.");
                totalHomens++;
            } else if (sexo == 'F') {
                System.out.println(nome + " é mulher.");
                totalMulheres++;
            } else {
                System.out.println("Sexo inválido para " + nome);
            }
            System.out.println("------------------------------------");
        }

        System.out.println("Total de Homens: " + totalHomens);
        System.out.println("Total de Mulheres: " + totalMulheres);

        scanner.close();
    }
}




    
    

