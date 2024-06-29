package Modulo_2;

public class Cliente {
    //Atributos

    private String nome;
    private int idade;
    private String cpf;
    private String endereco;

    //Construtor

    public Cliente(String nome, String cpf, String endereco, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.idade = idade;
    }

    //Metodos

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getCpf(){
        return cpf;
    }
}

