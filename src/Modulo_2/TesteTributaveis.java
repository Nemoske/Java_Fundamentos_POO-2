package Modulo_2;

public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222,333);

        cc.deposita(2000);


        SeguroDeVida sg = new SeguroDeVida();
        CalculadorDeImposto cal = new CalculadorDeImposto();
        cal.registro(cc);
        cal.registro(sg);

        System.out.println(cal.getTotalImposto());
    }




}
