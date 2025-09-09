import java.util.Scanner;

public class Caso {

    public static void main(String[] args) {

        int numeroDoMes;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número do mês (1 a 12):");
        numeroDoMes = scanner.nextInt();

        // A estrutura 'switch' é ideal para selecionar entre um número fixo de opções.
        switch (numeroDoMes) {
            case 1:
                System.out.println("Mês: Janeiro");
                break;
            case 2:
                System.out.println("Mês: Fevereiro");
                break;
            case 3:
                System.out.println("Mês: Março");
                break;
            case 4:
                System.out.println("Mês: Abril");
                break;
            case 5:
                System.out.println("Mês: Maio");
                break;
            case 6:
                System.out.println("Mês: Junho");
                break;
            case 7:
                System.out.println("Mês: Julho");
                break;
            case 8:
                System.out.println("Mês: Agosto");
                break;
            case 9:
                System.out.println("Mês: Setembro");
                break;
            case 10:
                System.out.println("Mês: Outubro");
                break;
            case 11:
                System.out.println("Mês: Novembro");
                break;
            case 12:
                System.out.println("Mês: Dezembro");
                break;
            default:
                System.out.println("Mês inválido! Por favor, digite um número entre 1 e 12.");
                break;
        }

        scanner.close();
    }
}




    
    

