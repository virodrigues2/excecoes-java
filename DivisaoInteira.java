public class DivisaoInteira {

    public static int dividir(int a, int b) throws DivisaoInteiraInvalidaException {
        if (a % b != 0) {
            throw new DivisaoInteiraInvalidaException("Erro: Divisão não é exata.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Resultado: " + dividir(10, 3));
        } catch (DivisaoInteiraInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}
