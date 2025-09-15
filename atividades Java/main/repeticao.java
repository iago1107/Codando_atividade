 import java.util.Scanner;
public class repeticao {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int contador = 0; // Inicializa um contador para os números no intervalo

            System.out.println("Por favor, digite 80 números.");

            // Loop 'for' que se repete 80 vezes
            for (int i = 0; i < 80; i++) {
                System.out.print("Digite o " + (i + 1) + "º número: ");
                int numero = scanner.nextInt();

                // Verifica se o número está no intervalo de 10 a 150 (inclusive)
                if (numero >= 10 && numero <= 150) {
                    contador++; // Se estiver, incrementa o contador
                }
            }

            System.out.println("---------------------------------------------");
            System.out.println("Total de números no intervalo [10, 150]: " + contador);

            scanner.close();
        }
    }
}

