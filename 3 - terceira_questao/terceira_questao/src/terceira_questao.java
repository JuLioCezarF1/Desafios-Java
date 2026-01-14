import java.util.Scanner;
public class terceira_questao {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro número: ");
        int a = sc.nextInt();
        System.out.println("Digite o valor do segundo valor: ");
        int b = sc.nextInt();
        System.out.println("Digite o valor do terceiro número: ");
        int c = sc.nextInt();
        System.out.println("Digite o valor do quarto número");
        int d = sc.nextInt();
        int diferenca = a * b - c * d;
        System.out.println("Diferenca = " + diferenca);
        sc.close();

    }
}
