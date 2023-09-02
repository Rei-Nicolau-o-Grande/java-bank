package contas;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaChad = new Conta();

        contaChad.depositar(50);
        System.out.println(contaChad.getSaldo());

        contaChad.sacar(20);
        System.out.println(contaChad.getSaldo());

        contaChad.sacar(300);

        Conta contaSegunda = new Conta();
        contaSegunda.depositar(1000);

        contaSegunda.transfere(300, contaChad);

        System.out.println(contaSegunda.getSaldo());
        System.out.println(contaChad.getSaldo());
    }
}
