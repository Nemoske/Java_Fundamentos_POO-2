package Modulo_1;

public class TesteDeReferencias {
    public static void main(String[] args){
        Funcionario f = new Funcionario();
        f.setSalario(2000.00);

        Funcionario g = new Gerente();
        g.setSalario(5000.00);

        Funcionario ed = new EditorDeVideo();
        ed.setSalario(3500.00);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(f);
        System.out.println(controle.getSoma());

        controle.registra(g);
        System.out.println(controle.getSoma());

        controle.registra(ed);
        System.out.println(controle.getSoma());
    }
}
