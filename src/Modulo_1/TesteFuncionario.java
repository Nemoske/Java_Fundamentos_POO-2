package Modulo_1;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario nico = new Funcionario();


        nico.setNome("Nico Steppat");
        nico.setCpf("1313132222");
        nico.setSalario(1000.00);

        System.out.println("Nome: "+nico.getNome());
        System.out.println("CPF: "+nico.getCpf());
        System.out.println("Salário: "+nico.getSalario());
        System.out.println("Bonificação :"+nico.getBonificacao());
    }

}
