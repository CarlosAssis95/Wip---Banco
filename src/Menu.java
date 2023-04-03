import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    static Pessoa pessoa = new Pessoa();
    static Scanner scan = new Scanner(System.in);
    static Operacoes op = new Operacoes();
    static boolean exibirMenu = true;

    public static void executarMenu() {

        while(exibirMenu) {

            System.out.println("[1]CADASTRAR PESSOA \n[2]LISTAR PESSOA \n[3]EFETUAR DEPOSITO \n[4]EXIBIR SALDO \n[5]EXIT");
            int option = scan.nextInt();

            switch(option) {

                case 1:
                    pessoa.cadastrarPessoa();
                    break;

                case 2:
                    pessoa.listarPessoa();
                    break;

                case 3:
                    op.efetuarDeposito();
                    break;

                case 4:
                    op.exibirSaldo();
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