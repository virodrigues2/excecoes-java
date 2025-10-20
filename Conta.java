public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void transferir(double valor) throws TransferenciaInvalidaException {
        if (valor <= 0) {
            throw new TransferenciaInvalidaException("Erro: Valor de transferência inválido.");
        }
        saldo -= valor;
        System.out.println("Transferência realizada. Saldo atual: " + saldo);
    }

    public static void main(String[] args) {
        Conta c = new Conta(1000);
        try {
            c.transferir(0);
        } catch (TransferenciaInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}
