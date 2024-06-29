package Modulo_1;

public class Gerente extends Funcionario{
// herdando atributos e metodos da classe funcionario

        //atributos do gerente
        private int senha;

// Metodos do gerente
    public void setSenha(int senha){
        this.senha = senha;
    }
        public boolean autentica(int senha){
            if(this.senha == senha){
                return true;
            }
            else{
                return false;
            }
        }
       public double getBonificacao(){
            return (super.getBonificacao())+ super.getSalario();
        } //GERENTE



}
