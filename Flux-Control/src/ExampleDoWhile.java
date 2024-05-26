import java.util.Random;

public class ExampleDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");
        // DO/While, ele executa ao menos uma vez, depois entra no fluxo da condicional
        // while
        do {
            System.out.println("Telefone tocando...");
        } while (touching());

        System.out.println("Alô!!!");
    }

    private static boolean touching() {
        boolean answered = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + answered);
        // negando o ato de continuar tocando
        return !answered;
    }
}
