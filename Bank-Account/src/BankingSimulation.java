import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class BankingSimulation {
    public static void main(String[] args) {

        DecimalFormat fmt = new DecimalFormat("0.0");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double saldo = 0;
        boolean continuar = true;
        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Saldo atual: " + fmt.format(saldo));
                    break;
                case 2:
                    Double saque = scanner.nextDouble();
                    if (saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saldo atual: " + fmt.format(saldo));
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + fmt.format(saldo));
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false; // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
