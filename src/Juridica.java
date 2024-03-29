import java.util.Scanner;

public class Juridica extends Pessoa {

    private String dataDeAbertura;

    public Juridica(String nome, String cnpj, String dataDeAbertura, String endereco, int id) {
        super(nome, cnpj, endereco, id);
        this.dataDeAbertura = dataDeAbertura;

        if (!ValidarCNPJ.validaCNPJ(cnpj)) {
            throw new IllegalArgumentException("CNPJ Invalido");
        }
    }

    public String getDataDeAbertura() {
        return dataDeAbertura;
    }

    public static Juridica criarPessoaJuridica() {

        Scanner scan = new Scanner(System.in);

        String nome, cnpj, dataDeAbertura, endereco;
        boolean cnpjValido = false;

        Cliente cliente = new Cliente();
        boolean cpfValido = false;

        do {
            Impressora.solicitarNome();
            nome = scan.nextLine();

            Impressora.solicitarDocumentoIdentificacao();
            cnpj = scan.nextLine();

            Impressora.solicitarDataDeAbertura();
            dataDeAbertura = scan.nextLine();

            Impressora.solicitarEndereco();
            endereco = scan.nextLine();

            try {
                Juridica pessoaJuridica = new Juridica(nome, cnpj, dataDeAbertura, endereco, cliente.criarId(Cliente.clientes));
                cnpjValido = true;
                return pessoaJuridica;

            } catch (IllegalArgumentException e) {
                Impressora.cnpjInvalido();
            }


        } while (!cnpjValido);

        return null;
    }

    @Override
    public String toString() {

        return "Nome: " + getNome() + "\nEndereco: " + getEndereco() + "\nDocumento de Identificacao: " +
                getDocumentoDeIdentificacao() + "\nData de abertura: " + getDataDeAbertura();

    }


}
