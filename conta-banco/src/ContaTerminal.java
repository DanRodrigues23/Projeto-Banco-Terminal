
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        String nome;
        String agencia;
        int numeroConta;
        double saldoConta;
        
        System.out.println("Digite o nome do cliente: ");
         nome = scanner.nextLine();

        System.out.println("Digite o número da agência: ");
        agencia = scanner.nextLine();

        System.out.println("Número da conta do Cliente: ");
        numeroConta = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do teclado
        
        System.out.println("Saldo:" );
        saldoConta = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer do teclado

        System.out.println("Conta do Cliente:");
        System.out.println("Nome: " + nome);
        System.out.println("Agência: " + agencia);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Saldo: R$ " + saldoConta);

        scanner.close();

    }
}
