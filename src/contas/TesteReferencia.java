package contas;

public class TesteReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.depositar(300);

        System.out.println("saldo da primeira: " + primeiraConta.getSaldo());

        // Conta segundaConta = primeiraConta;
        Conta segundaConta = new Conta();
        System.out.println("saldo da segunda conta: " + segundaConta.getSaldo());

        segundaConta.depositar(100);

        System.out.println("saldo da primeira conta: " + primeiraConta.getSaldo());
        System.out.println("saldo da segunda conta: " + segundaConta.getSaldo());

        if (primeiraConta == segundaConta) {
            System.out.println("São a mesma conta");
        } else {
            System.out.println("São contas diferentes");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);

    }
}
