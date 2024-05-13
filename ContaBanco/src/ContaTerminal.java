import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner leitura = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = leitura.nextLine();

        System.out.println("Digite o número da Conta: ");
        int numeroConta = leitura.nextInt();

        String vazia = leitura.nextLine();

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = leitura.nextLine();

        System.out.println("Digite o saldo: ");
        float saldo = leitura.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de R$ " + saldo + " já está disponível para saque.");
    }
}
