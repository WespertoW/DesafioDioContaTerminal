import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODo: Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuario

        //Obter pela scanner os valores digitados no terminal

        //Exibir a Mensagem Conta Criada

        //Informações q serão solicitadas (Numero conta (int), Agencia (txt), Nome Cliente(txt), Saldo(double))

        /*SAIDA: Olá [Nome do Cliente] obrigado por criar uma conta em nosso banco, sua agência é [Agencia], 
        conta [Numero Conta] e seu saldo [Saldo] já está disponivel para saque.
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------");
        System.out.println("   Criação da Conta   ");
        System.out.println("----------------------");

        System.out.println("Olá, Digite seu nome para continuarmos.");
        String nomeCliente = scanner.nextLine();

        System.out.println("Informe o numero da Agência ! (ex: 0101)");
        String numeroAgencia = scanner.nextLine();

        System.out.println("Agora digite o numero da da conta ! (ex: 0010123-1)");
        String numeroConta = scanner.nextLine();

        System.out.println("Informe Seu Saldo ? (ex: 10,10)");
        double saldoCliente = scanner.nextDouble();

        scanner.close();

        System.out.printf("Olá %s obrigado por criar uma conta em nosso banco, sua agência é %s, e o numero da sua conta é %s, e seu saldo R$: %.2f já está disponivel para saque.", nomeCliente, numeroAgencia, numeroConta, saldoCliente);
        
    }
}
