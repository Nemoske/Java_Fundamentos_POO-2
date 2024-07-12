package Modulo_2;

public class TesteContas {
    public static void main(String[] args) {

        Conta cc = new ContaCorrente(2222,3333);
        cc.deposita(1000);

        System.out.println(cc.saca(100));
        System.out.println(cc.getSaldo());
    }
}
