import java.util.Scanner;

public class ContaTerminal {
    // Atributos da classe
    private int numero; 
    private String agencia; 
    private String nomeCliente; 
    private double saldo; 

    // Construtor da classe
    public ContaTerminal(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    // Métodos getters e setters para cada atributo
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método para receber os dados do terminal
    public void receberDadosTerminal() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        setAgencia(scanner.nextLine());

        System.out.println("Por favor, digite o número da Conta:");
        setNumero(scanner.nextInt());
        scanner.nextLine(); // Consumir a nova linha

        System.out.println("Por favor, digite o nome do Cliente:");
        setNomeCliente(scanner.nextLine());

        System.out.println("Por favor, digite o saldo da Conta:");
        setSaldo(scanner.nextDouble());
    }

    // Método para imprimir o extrato da conta
    public void imprimirExtrato() {
        System.out.println("Olá " + getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + getAgencia() + ", conta " + getNumero() + " e seu saldo R$" + getSaldo() + " já está disponível para saque.");
    }

    // Método principal para executar o programa
    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal(0, "", "", 0.0);
        conta.receberDadosTerminal();
        conta.imprimirExtrato();
    }
}
