import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    static final String OPCOES = "[1]CADASTRAR CLIENTE \n[2]LISTAR CLIENTES \n[3]EFETUAR DEPOSITO \n[4]EXIBIR SALDO \n[5]EXIT";
    static Scanner scan = new Scanner(System.in);
    static Operacoes operacoes = new Operacoes();
    static Cliente cliente = new Cliente();
    static boolean exibirMenu = true;

    public static void executarMenu() {

        while (exibirMenu) {

            System.out.println(OPCOES);
            int option = scan.nextInt();

            switch (option) {

                case 1:
                    cliente.cadastrarCliente();
                    break;

                case 2:
                    cliente.listarCliente();
                    break;

                case 3:
                    operacoes.efetuarDeposito();
                    break;

                case 4:
                    operacoes.exibirSaldo();
                    break;

                case 5:
                    exibirMenu = false;
                    System.out.println("Obrigado por visitar nosso banco");
                    System.out.println("Nos vemos na proxima");
                    break;

                default:
                    System.out.println("Opção invalida");
                    break;

            }
        }
    }
}
