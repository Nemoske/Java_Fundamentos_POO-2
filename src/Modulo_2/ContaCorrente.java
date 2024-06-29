package Modulo_2;

public class ContaCorrente extends Conta {

    //Construtor
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    //Metodo


    @Override
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }
}
