import java.util.Locale;
import java.util.Scanner;
public class quarta_questao {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número");
        int numero_funcionario = sc.nextInt();
        System.out.println("Digite a quantidade de horas de trabalho: ");
        int trabalho_horas = sc.nextInt();
        System.out.println("Digite o valor do salário por hora de trabalho");
        double salario = sc.nextDouble();

        double calculo = salario * (double)trabalho_horas;

        System.out.println("Funcionário: " + numero_funcionario);
        System.out.printf("Salário total = U$ %.2f%n", calculo );
        sc.close();
    }
}
