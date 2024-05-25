import java.util.Locale;
import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        scanner.close();
    }
}
