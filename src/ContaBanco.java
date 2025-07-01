import java.util.Scanner;

public class ContaBanco {
      public static void main(String[] args) {
        
            Scanner scanner = new Scanner(System.in);
           
            System.out.println("Por favor, digite o número da Agência: ");
            String agencia = scanner.nextLine();
           
            System.out.println("Por favor, digite o número da Conta: ");
            String numeroConta = scanner.nextLine();

            System.out.println("Por favor, digite o nome do Cliente: ");
            String nomeCliente = scanner.nextLine();
           
            System.out.println("Por favor, digite o saldo da conta: ");
            double saldo = scanner.nextDouble();

            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                        + agencia + ", conta " + numeroConta + " e seu saldo " + saldo
                        + " já está disponível para saque.");
            // Fechar o scanner
            scanner.close();
      }
}
