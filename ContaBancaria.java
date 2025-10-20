public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Erro: Saldo insuficiente para saque.");
        }
        saldo -= valor;
        System.out.println("Saque realizado. Saldo atual: " + saldo);
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(100);
        try {
            conta.sacar(200);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}
