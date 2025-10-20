public class Calculadora {

    public static double dividir(double a, double b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Erro: Divisão por zero não é permitida.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Resultado: " + dividir(10, 0));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
