import java.util.Scanner;

public class AtividadeUm {

    public static void main(String[] args) {

        double celcius, fa; 

        Scanner leitor = new Scanner(System.in);
        System.out.println("digite a Temperatura em Celcius:    ");
        celcius = leitor.nextInt();
        fa = (9 * celcius + 160) / 5;
        System.err.println("A temperatura convertida em Fahrenhert e: "+ fa);

        leitor.close();
    




        
    }






    }

