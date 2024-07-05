package Modulo_1;

public abstract class Funcionario {
    //atributos
    private String nome;
    private String cpf;
    private double salario;

    // Método abstrato, vazio
    public abstract double getBonificacao();


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
