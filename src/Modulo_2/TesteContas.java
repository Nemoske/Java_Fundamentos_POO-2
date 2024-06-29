package Modulo_2;

public class TesteContas {
    public static void main(String[] args) {

        Conta cc = new ContaCorrente(2222,3333);
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca(3232,5555);
        cp.deposita(2000);

        cc.transfere(10,cp);

        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());
    }
}
