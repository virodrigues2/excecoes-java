public class Idade {

    public static void verificarIdade(int idade) {
        if (idade < 0 || idade > 150) {
            throw new IllegalArgumentException("Erro: Idade inválida.");
        }
        System.out.println("Idade válida: " + idade);
    }

    public static void main(String[] args) {
        try {
            verificarIdade(200);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
