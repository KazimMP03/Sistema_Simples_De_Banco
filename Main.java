package Banco;

public class Main {
    public static void main(String[] args) {
        ContaPoupanca poupanca = new ContaPoupanca(0);
        ContaCorrente corrente = new ContaCorrente(0);

        poupanca.depositar(500);
        corrente.depositar(900);

        System.out.println("\nSaldo atual: "+poupanca.getSaldo());
        System.out.println("\nSaldo atual: "+corrente.getSaldo());

        poupanca.sacar(50);
        corrente.sacar(100);

        System.out.println("\nSaldo atual: "+poupanca.getSaldo());
        System.out.println("\nSaldo atual: "+corrente.getSaldo());

        corrente.transferir(400, poupanca);

        System.out.println("\nSaldo atual: "+poupanca.getSaldo());
        System.out.println("\nSaldo atual: "+corrente.getSaldo());

        poupanca.calcularRendimento();
        System.out.println("\nRendimento atual: "+ poupanca.getSaldo());
    }
}