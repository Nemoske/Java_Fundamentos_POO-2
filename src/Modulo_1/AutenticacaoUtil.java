package Modulo_1;

public class AutenticacaoUtil {

    private int senha = 1234;

    public void setSenha(int senha) {
        this.senha = senha;
    }


    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }




}
