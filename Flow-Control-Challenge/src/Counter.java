
import java.util.Locale;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println(
                "Vamos imprimir os números entre dois valores digitados, é necessário que o segundo número seja maior que o primeiro!");
        System.out.println("Vamos começar?");

        System.out.println("Digite o primeiro número:");
        int numberOne = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int numberTwo = scanner.nextInt();

        scanner.close();

        try {
            counting(numberOne, numberTwo);
        } catch (InvalidParametersException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    static void counting(int parameterOne, int parameterTwo) throws InvalidParametersException {
        if (parameterOne >= parameterTwo) {
            throw new InvalidParametersException();
        } else {
            for (int x = parameterOne; x <= parameterTwo; x++) {
                System.out.println("Imprimindo o número " + x);
            }
        }
    }

}
