import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar e ler o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        // Solicitar e ler o número da agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();

        // Solicitar e ler o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente:");
        scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt/next
        String nomeCliente = scanner.nextLine();

        // Solicitar e ler o saldo
        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem final
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}

1234