package Banco;

interface ContaBancaria {
    void depositar(double valor);
    void sacar(double valor);
    double getSaldo();    
}
