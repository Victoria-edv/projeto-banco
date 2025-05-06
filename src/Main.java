
public class Main {

    public static void main(String[] args) {
        Cliente Victoria = new Cliente();
        Victoria.setNome("Victoria");

        Conta cc = new ContaCorrente(Victoria);
        Conta poupanca = new ContaPoupanca(Victoria);

        cc.depositar(12000);
        cc.transferir(1000, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}