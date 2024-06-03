package Banco;

class ContaPoupanca extends Conta {
    private static final double rendimentoDiario = 0.0003;

    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }
    
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
    }

    public void sacar(double valor) {
        if (getSaldo() < valor) {
            System.out.println("Saque não permitido!");
            return;
        } else {
            setSaldo(getSaldo() - valor);
        }
    }

    public void calcularRendimento() {
        double rendimento = getSaldo() * rendimentoDiario;
        setSaldo(getSaldo() + rendimento);
    }
}