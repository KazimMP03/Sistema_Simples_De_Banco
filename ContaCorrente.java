package Banco;

class ContaCorrente extends Conta {
    public ContaCorrente(double saldoInicial) {
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

    public void transferir(double valor, ContaBancaria destino) {
        if (getSaldo() < valor) {
            System.out.println("transferência indisponível!");
        } else {
            sacar(valor);
            destino.depositar(valor);
        }
    }
}
