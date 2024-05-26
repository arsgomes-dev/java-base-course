import java.util.concurrent.ThreadLocalRandom;

public class ExampleWhile {
    public static void main(String[] args) {
        double savings = 50.00;
        while (savings > 0) {
            Double sweetValue = randomValue();
            if (sweetValue > savings) {
                System.out.println("O valor da mesada é insuficiente para esse doce");
                break;
            } else {
                System.out.println("O doce no valor de R$" + sweetValue + ", foi adicionado a cestinha");
                savings = savings - sweetValue;
            }
        }
        System.out.println("Mesada: R$" + savings);
        System.out.println("O cliente gastou toda a sua mesada");
    }

    private static double randomValue() {
        return ThreadLocalRandom.current().nextDouble(0, 8);
    }
}
