package clientes;

import contas.Conta;

public class TestaBanco {
    public static void main(String[] args) {
        Cliente nicolas = new Cliente();
        nicolas.setNome("Nicolas");
        nicolas.setCpf("222.222.222-22");
        nicolas.setProfissao("programador");

        Conta contaDoNicolas = new Conta();
        contaDoNicolas.depositar(500);

        contaDoNicolas.setTitular(nicolas);

        System.out.println(contaDoNicolas.getTitular().getNome());
    }
}
