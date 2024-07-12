package Modulo_1;

public class TesteDeReferencias {
    public static void main(String[] args){


        Funcionario g = new Gerente();
        g.setSalario(5000.00);

        Funcionario ed = new EditorDeVideo();
        ed.setSalario(3500.00);

        ControleBonificacao controle = new ControleBonificacao();

        System.out.println(controle.getSoma());
        controle.registra(ed);
        controle.registra(g);
        System.out.println(controle.getSoma());


        Cliente cliente = new Cliente();
        cliente.autentica(1234);


    }
}
