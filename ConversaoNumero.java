public class ConversaoNumero {
    public static void main(String[] args) {
        String valor = "abc";
        try {
            int numero = Integer.parseInt(valor);
            System.out.println("Número: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Erro: O valor inserido não é um número válido.");
        }
    }
}
