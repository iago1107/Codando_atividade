/*
 
5. Faça um Programa que receba um valor N, um valor O e um valor T e calcule a taboada de 1 até T. Mostre a taboada na forma:
Onde "N" é o valor de calculo da taboada
"O" é o operador da tabuada e
"T" é o ultimo numero que será realizado a conta da tabuada.
Exemplo,
n = 5,
O = Soma e
T = 10,
irá fazer a tabuada de soma do numero 5 até chegar no numero 10.

 */

import java.util.Scanner;

public class exercicioCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número para a tabuada (N): ");
        int n = scanner.nextInt();

        System.out.print("Digite o operador (+, -, *, /): ");
        char o = scanner.next().charAt(0);

        System.out.print("Digite o número final da tabuada (T): ");
        int t = scanner.nextInt();

        System.out.println("--- Tabuada de " + n + " com operador '" + o + "' até " + t + " ---");

        for (int i = 1; i <= t; i++) {
            switch (o) {
                case '+':
                    System.out.println(n + " + " + i + " = " + (n + i));
                    break;
                case '-':
                    System.out.println(n + " - " + i + " = " + (n - i));
                    break;
                case '*':
                    System.out.println(n + " * " + i + " = " + (n * i));
                    break;
                case '/':
                    // Para evitar divisão inteira, convertemos um dos números para double
                    if (i != 0) {
                        double resultado = (double) n / i;
                        System.out.printf("%d / %d = %.2f\n", n, i, resultado);
                    } else {
                        System.out.println(n + " / " + i + " = Divisão por zero impossível");
                    }
                    break;
                default:
                    System.out.println("Operador inválido!");
                    // Encerra o loop e o método se o operador for inválido
                    scanner.close();
                    return; 
            }
        }
        scanner.close();
    }
}