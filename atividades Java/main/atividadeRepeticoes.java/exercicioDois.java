/*

2. Escrever um programa que leia os dados de "N" pessoas (nome, sexo, idade e saúde) e
informe se está apta ou não para cumprir o serviço militar obrigatório. Informe os totais.

*/

import java.util.Scanner;

public class exercicioDois {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int aptos = 0;
        int naoAptos = 0;

        System.out.print("Quantas pessoas serão cadastradas? ");
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println("--- Dados da " + i + "ª pessoa ---");
            System.out.print("Nome: ");
            String nome = scanner.next();

            System.out.print("Sexo (M/F): ");
            char sexo = scanner.next().toUpperCase().charAt(0);

            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            System.out.print("Saúde (boa/ruim): ");
            String saude = scanner.next().toLowerCase();

            if (sexo == 'M' && idade >= 18 && saude.equals("boa")) {
                System.out.println(nome + " está apto(a) para o serviço militar.");
                aptos++;
            } else {
                System.out.println(nome + " não está apto(a) para o serviço militar.");
                naoAptos++;
            }
        }

        System.out.println("====================================");
        System.out.println("Total de pessoas aptas: " + aptos);
        System.out.println("Total de pessoas não aptas: " + naoAptos);

        scanner.close();
    }
}


        
    

