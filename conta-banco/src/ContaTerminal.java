import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela scanner os valores digitados no terminal

        // Exibir a mesagem conta criada

        Scanner terminal = new Scanner(System.in);

        System.out.print("Digite o número do Banco com quatro numeros 'XXXX': ");
        int numBanco = terminal.nextInt();

        System.out.print("Digite o número da sua Agência 'XXX-X': ");
        String numAgencia = terminal.next();

        //Consuma a nova linha em branco
        terminal.nextLine();

        System.out.print("Digite o seu Nome Completo: ");
        String nomeCliente = terminal.nextLine();

        System.out.print("Digite valor inicial da conta: R$");
        double saldo = terminal.nextDouble();
        System.out.print("******************************** Banco Java ********************************");
        System.out.printf("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,\n" +
                "sua agência é " + numAgencia + ", conta " + numBanco + " e " +
                "seu saldo atual é R$%.2f \nO valor está disponível para saque.%n", saldo);
    }
}