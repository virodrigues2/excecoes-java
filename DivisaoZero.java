import java.util.Scanner;

public class DivisaoZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        try {
            int resultado = numero / 0;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Ops! Não é possível dividir por zero.");
        }
    }
}
