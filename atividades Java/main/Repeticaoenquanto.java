

import java.util.Scanner;

public class Repeticaoenquanto {

public static void main(String[] args) {
      
    String sexo, nome; 
    int totalh, totalm, contador;

    Scanner Teclado = new Scanner(System.in);

    contador = 0;
    totalh   = 0;
    totalm   = 0;
while (contador < 57) {

    
    
    System.out.println("digite seu nome: ");
    nome = Teclado.nextLine();

    System.out.println("digite seu Sexo: ");
    sexo = Teclado.nextLine();

    System.out.println("nome: " + nome);
    System.out.println("sexo: " + sexo); 

    if (sexo == "masculino") { totalh = + 1; }
    else if (sexo == "feminino") {totalm = + 1;   }   
    }
    
    contador ++ ;
    
    System.out.println("Obrigado por participar, o total de homens e mulheres foi de " + contador + " pessoas, sendo " + totalh + " homens e " + totalm + " mulheres.");






}   }