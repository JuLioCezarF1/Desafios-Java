import java.util.Scanner;
import java.util.Locale;
public class quinta_questao {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o código do produto: ");
        int produto1 = sc.nextInt();
        System.out.print("Digite o número de peças do produto (" + produto1 + "): ");
        int quantidade_produto1 = sc.nextInt();
        System.out.print("Digite o valor do produto(" + produto1 + "): ");
        double valor_produto1 = sc.nextDouble();

        System.out.print("Digite o código do segundo produto: ");
        int produto2 = sc.nextInt();
        System.out.print("Digite o número de peças do produto (" + produto2 + "): ");
        int quantidade_produto2 = sc.nextInt();
        System.out.print("Digite o valor do produto(" + produto2 + "): ");
        double valor_produto2 = sc.nextDouble();

        double calculo_produto1 = (double)quantidade_produto1 * valor_produto1;
        double calculo_produto2 = (double)quantidade_produto2 * valor_produto2;
        double total = calculo_produto1 + calculo_produto2;
        System.out.println("O valor do produto (" + produto1 + "): " + calculo_produto1);
        System.out.println("O valor do produto (" + produto2 + "): " + calculo_produto2);
        System.out.printf("O valor total a pagar: %.2f%n", total);


        sc.close();
    }
}
