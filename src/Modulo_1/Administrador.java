package Modulo_1;

public class Administrador extends Funcionario implements Autenticavel{
    // herdando atributos e metodos da classe funcionario e assinando contrato com a interface Autenticavel

    //Atributo da interface
    private int senha;

    //Método da interface Autenticavel

    @Override
    public void setSenha(int senha){
        this.senha = senha;
    }
    //Método da interface Autenticavel

    @Override
    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        }
        else{
            return false;
        }
    }
    //Método da herança da classe funcionário

    @Override
    public double getBonificacao(){
        return 50;
    }

}
