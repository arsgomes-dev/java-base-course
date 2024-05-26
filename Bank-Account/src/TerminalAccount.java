import java.util.Locale;
import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) {
        // TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Exibir mensagem

        System.out.println("Por favor, digite o número da Agência:");
        int agency = scanner.nextInt();

        System.out.println("Por favor, digite o número da conta:");
        int account_number = scanner.nextInt();

        System.out.println("Por favor, digite seu nome:");
        String name = scanner.next();

        System.out.println("Por favor, digite seu sobrenome:");
        String surname = scanner.next();

        System.out.println("Por favor, digite o valor que deseja depositar:");
        double deposit = scanner.nextDouble();

        System.out.println("Olá " + name + " " + surname
                + ", obrigado por criar uma conta em nosso banco, sua\r\n" + //
                " agência é " + agency + ", conta " + account_number + " e o seu saldo de R$" + deposit
                + ", já esta disponível para saque.");

        // TODO: "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua
        // agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível
        // para saque".

        scanner.close();
    }
}
