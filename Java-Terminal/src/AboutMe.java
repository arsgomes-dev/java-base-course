import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Digite seu nome:");
            String name = scanner.next();

            System.out.println("Digite seu sobrenome:");
            String surname = scanner.next();

            System.out.println("Digite sua idade:");
            int age = scanner.nextInt();

            System.out.println("Digite sua altura:");
            double height = scanner.nextDouble();

            scanner.close();

            System.out.println("Olá, me chamo " + name + " " + surname);
            System.out.println("Tenho " + age + " anos");
            System.out.println("Minha altura é " + height + "cm");
        } catch (InputMismatchException e) {
            System.out.println("Os campos idade/altura precisa ser numérico!");
        }
    }
}
