import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TO DO : Conhecer e importar a classe scanner

        //Exibir as mensagens para o usuário

        //Obter pelo scanner os valores digitados no terminal

        //Exibir a mensagem final

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe o seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Informe o número de sua conta(Formato 'xxxx'):");
        int numeroConta = scanner.nextInt();

        System.out.println("Informe o seu número de agência(Formato 'xxx-x'):");
        String agencia = scanner.next();

        System.out.println("Informe o seu saldo em conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
        scanner.close();
    }
}
