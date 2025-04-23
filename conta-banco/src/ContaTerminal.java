import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número da conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o número da agência:");
        String agencia = scanner.nextLine();

        System.out.print("Digite o nome do cliente:");
        String cliente = scanner.nextLine();

        System.out.print("Digite o saldo:");
        double saldo = scanner.nextDouble();

        scanner.close();

        //Exibir mensagem usando concat
        String mensagem = "Olá ".concat(cliente)
        .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
        .concat(agencia)
        .concat(", conta ").concat(String.valueOf(numero))
        .concat(" e seu saldo ").concat(String.valueOf(saldo))
        .concat(" já está disponível para saque");
        
        System.out.println(mensagem);


    }
}
