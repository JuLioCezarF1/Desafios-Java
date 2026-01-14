import java.util.Scanner;
public class segunda_questao {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite aqui o valor do círculo");
        double entrada = sc.nextDouble();
        double pi = 3.14159;
        double entrada_potencia = entrada * entrada;
        double calculo = entrada_potencia * pi;
        System.out.printf("A= %.4f%n", calculo);
        sc.close();

    }
}
