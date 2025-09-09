import java.util.Scanner;

public class SalarioVenda {
    public static void main(String[] args) {
       
        double depositoinicial, rendimento, valorfinal;

        Scanner Teclado = new Scanner(System.in);

        System.out.println("---------------------------------");
        System.out.println("      CALCULO DE RENDIMENTO      ");
        System.out.println("---------------------------------");
        System.out.println("                                 ");
        System.out.println("Digite o valor do deposito R$: ");
        depositoinicial = Teclado.nextDouble();
        
        // calculo do rendimento 
        rendimento = depositoinicial * 0.007;
        valorfinal = depositoinicial + rendimento;

        // saida de dados
        System.out.println("---------------------------------");
        System.out.println("          EXTRATO MENSAL         ");
        System.out.println("---------------------------------");
        
        System.out.println("Taxa de juros mensal: 0,70%");
        System.out.println(valorfinal);



        


















    }
    
}
