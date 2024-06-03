import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SelectiveProcess {
    public static void main(String[] args) throws Exception {
        String[] candidates = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA",
                "DANIELA", "JORGE" };
        String[] candidateApproved = new String[5];
        int approved = 0;

        System.out.println("Candidatos selecionados: ");
        for (int i = 0; i < candidates.length; i++) {
            double targetValue = randomTargetValue();
            boolean generalReturn = analyzeCandidate(candidates[i], targetValue);
            if (generalReturn == true && approved <= 5) {
                candidateApproved[approved] = candidates[i];
                approved++;
                if (approved == 5) {
                    break;
                }
            }

        }
        System.out.println("______________________________");
        System.out.println(" ");
        /*
         * for (int x = 0; x < candidateApproved.length; x++) {
         * if (candidateApproved[x] != null) {
         * System.out.println(candidateApproved[x]);
         * }
         * }
         */
        System.out.println("Ligações realizadas pelo RH: ");
        for (String candidate : candidateApproved) {
            if (candidate != null)
                makeCall(candidate);
        }
    }

    static boolean analyzeCandidate(String sequenceCandidate, double intendedSalary) {
        double baseSalary = 2000.00;
        String message;
        boolean generalReturn = false;
        if (baseSalary >= intendedSalary) {
            message = "O candidato " + sequenceCandidate + " foi selecionado(a), ligar para o(a) candidato(a). ";
            System.out.println(message);
            generalReturn = true;

        } else if (baseSalary == intendedSalary) {
            message = "O candidato " + sequenceCandidate
                    + " foi selecionado, ligar para o(a) candidato(a), com contra proposta da pretensão salarial.";
            System.out.println(message);
            generalReturn = true;

        } else {
            // message = "AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS"; */
            generalReturn = false;

        }
        return generalReturn;
    }

    private static double randomTargetValue() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void makeCall(String candidate) {
        int attemptsMade = 1;
        boolean continueAttempts = true;
        boolean answered = false;
        do {
            answered = touching();
            continueAttempts = !answered;
            if (continueAttempts)
                attemptsMade++;
            else
                System.out.println("Contato realizado com sucesso!");
        } while (continueAttempts && attemptsMade < 3);

        if (answered)
            System.out.println("Conseguimos contato com " + candidate + " na " + attemptsMade + " tentativa.");
        else
            System.out.println("Não conseguimos contato com " + candidate
                    + ", foram realizadas " + attemptsMade + " tentativas, que é o número máximo permitido.");

    }

    private static boolean touching() {
        return new Random().nextInt(3) == 1;
    }
}
