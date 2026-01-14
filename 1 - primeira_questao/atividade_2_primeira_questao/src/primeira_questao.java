import java.util.Scanner;
public class primeira_questao {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número para a soma: ");
        double numero1 = sc.nextDouble();
        System.out.println("Digite o segundo número para a soma: ");
        double numero2 = sc.nextDouble();
        double total = numero1 + numero2;
        System.out.printf("O total da soma realizada é: %.2f%n", total);
        sc.close();
    }
}
