public class ExampleBreakContinue {
    public static void main(String[] args) {
        for (int x = 0; x <= 5; x++) {
            System.out.println("O número é: " + x);
            if (x == 5) {
                break;
            } else {
                continue;
            }
        }
    }
}
