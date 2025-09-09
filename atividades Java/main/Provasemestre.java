import java.text.DecimalFormat;
import java.util.Scanner;

public class Provasemestre {
    public static void main(String[] args) {

        double prova1, prova2, prova3, media;

        Scanner Objeto = new Scanner(System.in);

        System.out.println("Digite a nota da primeira prova: ");
        prova1 = Objeto.nextInt();

        System.out.println("Digite a nota da segunda prova: ");
        prova2 = Objeto.nextInt();

        System.out.println("Digite a nota da terceira prova: ");
        prova3 = Objeto.nextInt();

        media = (prova1 + prova2 + prova3) / 3.0; // Cálculo da média corrigido

        DecimalFormat formato = new DecimalFormat("0.0"); // Padrão para 1 casa decimal

        String formatado = formato.format(media);

        System.out.println("media da do semestre e: ");
        System.out.println(formatado); // Imprime a string formatada em vez da variável double
        
        if (media >= 7){
            System.out.println("Aprovado");
        }
        else if (media <=6 && media >=3) {
            System.out.println("Recuperaçao");
        }
        else {
            System.out.println("Reprovado, estude mais !!!");
        }
   
    }
}
