package Modulo_2;

public class ContaCorrente extends Conta implements Tributavel{

    //Construtor
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;    }

    //Metodo


    @Override
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
}
