import java.text.DecimalFormat;
import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        // Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);
        String titular = scanner.next();
        int numeroConta = scanner.nextInt();
        double saldo = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();

        ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, titular, saldo, taxaJuros);

        System.out.println("Conta Poupanca:");
        contaPoupanca.exibirInformacoes();
    }
}

class ContaBancariaX {
    protected int numero;
    protected String titular;
    protected double saldo;

    public ContaBancariaX(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void exibirInformacoes() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        System.out.println(titular);
        System.out.println(numero);
        System.out.println("Saldo: R$ " + decimalFormat.format(saldo));
    }
}

class ContaPoupanca extends ContaBancariaX {
    private double taxaJuros;

    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
        // Implementar adequadamente esta sobrecarga de construtores.
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public void exibirInformacoes() {
        // Complementar as informações com a taxa de juros.
        super.exibirInformacoes();
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        System.out.println("Taxa de juros: " + decimalFormat.format(taxaJuros) + "%");
    }
}