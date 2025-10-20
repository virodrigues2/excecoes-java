public class ValidadorSenha {

    public static void validarSenha(String senha) throws SenhaInvalidaException {
        if (senha.length() < 8) {
            throw new SenhaInvalidaException("Erro: Senha deve ter pelo menos 8 caracteres.");
        }
        System.out.println("Senha válida!");
    }

    public static void main(String[] args) {
        try {
            validarSenha("12345");
        } catch (SenhaInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}
