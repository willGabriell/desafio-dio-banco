public class Main {
    public static void main(String[] args) {
        Cliente gabriel = new Cliente();
        gabriel.setNome("Gabriel");

        Cliente maryaClara = new Cliente();
        maryaClara.setNome("Marya Clara");

        ContaCorrente contaCorrente = new ContaCorrente(gabriel);
        ContaPoupanca contaPoupanca = new ContaPoupanca(gabriel);
        ContaCorrente contaNova = new ContaCorrente(maryaClara);

        contaCorrente.depositar(1400);
        contaCorrente.transferir(500, contaNova);

        contaCorrente.imprimirExtrato();
        //contaPoupanca.imprimirExtrato();
        contaNova.imprimirExtrato();
    }
}
