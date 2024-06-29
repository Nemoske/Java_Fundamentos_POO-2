package Modulo_1;

public class Funcionario {
    //atributos
    private String nome;
    private String cpf;
    private double salario;

    public double getBonificacao(){

        return this.salario * 0.1;
    }// FUNCIONARIO

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(Double salario){
        this.salario = salario;
    }






}
