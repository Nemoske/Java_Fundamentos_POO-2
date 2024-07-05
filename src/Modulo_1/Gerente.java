package Modulo_1;

public class Gerente extends Funcionario implements Autenticavel {
// herdando atributos e metodos da classe funcionario e assinando contrato com a interface Autenticavel

    //Atributo da interface
    private  int senha;

        @Override
       public double getBonificacao(){
            System.out.println("Chamando o método de bonificação do GERENTE");
            return super.getSalario();
        } //GERENTE

    //Métodos da interface Autenticavel
    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
            if(this.senha == senha){
                return true;
            }
        else{
            return false;
        }
    }
}
