import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe o seu nome: ");
        String nome = scanner.next();

        System.out.println("Informe o seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Informe a sua idade(xx): ");
        int idade = scanner.nextInt();

        System.out.println("Informe a sua altura(x.xx): ");
        Double altura = scanner.nextDouble();

        System.out.println("Olá! Meu nome é " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Tenho " + altura + " metros. E estou estudando java!" );

        scanner.close();
    }
}