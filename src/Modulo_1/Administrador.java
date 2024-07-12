package Modulo_1;

public class Administrador extends Funcionario implements Autenticavel{

    private AutenticacaoUtil autenticador;

    public Administrador(){
        this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha){
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha){
     return this.autenticador.autentica(senha);
    }
    //Método da herança da classe funcionário

    @Override
    public double getBonificacao(){
        return 50;
    }

}
