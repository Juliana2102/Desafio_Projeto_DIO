import java.util.Scanner;

public class ContaBanco {
      public static void main(String[] args) {
            // Objeto Scanner para ler a entrada do terminal.
            Scanner scanner = new Scanner(System.in);
            // Solicitação para que o usuário digite o número da agência para armazenar a
            // variável "agencia".
            System.out.println("Por favor, digite o número da Agência: ");
            String agencia = scanner.nextLine();
            // Solicitação para que o usuário digite o número da conta para armazenar a
            // variável "numeroConta".
            System.out.println("Por favor, digite o número da Conta: ");
            String numeroConta = scanner.nextLine();
            // Solicitação para que o usuário digite o nome do cliente para armazenar a
            // variável "nomeCliente".
            System.out.println("Por favor, digite o nome do Cliente: ");
            String nomeCliente = scanner.nextLine();
            // Solicitação para que o usuário digite o saldo da conta para armazenar a
            // variável "saldo".
            System.out.println("Por favor, digite o saldo da conta: ");
            double saldo = scanner.nextDouble();

            // Exibe a mensagem com os dados fornecidos pelo usuário.
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                        + agencia + ", conta " + numeroConta + " e seu saldo " + saldo
                        + " já está disponível para saque.");
            // Fechar o scanner
            scanner.close();
      }
}
