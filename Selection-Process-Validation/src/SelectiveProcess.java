import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SelectiveProcess {
    public static void main(String[] args) throws Exception {
        String[] candidate = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA",
                "DANIELA", "JORGE" };
        int approved = 0;
        for (int i = 0; i < candidate.length; i++) {
            double targetValue = randomTargetValue();
            boolean generalReturn = analyzeCandidate(candidate[i], targetValue);
            if (generalReturn == true && approved <= 5) {
                approved++;
                System.out.println(approved);
                if (approved == 5) {
                    break;
                }
            }

        }
    }

    static boolean analyzeCandidate(String sequenceCandidate, double intendedSalary) {
        double baseSalary = 2000.00;
        String message;
        boolean generalReturn = false;
        if (baseSalary >= intendedSalary) {
            message = "LIGAR PARA O CANDIDATO";
            generalReturn = true;

        } else if (baseSalary == intendedSalary) {
            message = " LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA";
            generalReturn = true;

        } else {
            message = "AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS";
            generalReturn = false;

        }
        System.out.println(message);
        return generalReturn;
    }

    private static double randomTargetValue() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    private static boolean touching() {
        boolean answered = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + answered);
        // negando o ato de continuar tocando
        return !answered;
    }
}
