import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scan.next();

        System.out.println("Digite o número da Conta: ");
        int numeroConta = scan.nextInt();

        //String vazia = scan.nextLine();
        // Quando digita dois nextLine em seguida ele só lê um e pula o outro, 
        //por isso é necessário colocar uma linha vazia.
        //Mas nesse caso podemos colocar dois next simples que ele vai ler normalmente.

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scan.next();

        System.out.println("Digite o saldo: ");
        double saldo = scan.nextDouble();

        // System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de R$ " + saldo + " já está disponível para saque.");

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s conta %d e seu saldo de R$ %.2f já está disponível para saque.", nomeCliente, agencia, numeroConta, saldo);
    }
}
