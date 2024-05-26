import java.util.Locale;
import java.util.Scanner;

public class CashMachine {
    public static void main(String[] args) throws Exception {

        // TODO: importar classe scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        // declara variáveis de saldo e mensagem de returno
        double balance = 250.00;
        String returnMessage = "";
        // mensagem perguntando valor que o cliente deseja sacar
        System.out.println("Digite o valor de queseja sacar:");
        // recebe o valor digitado pelo usuário para saque
        double amountWithdraw = scanner.nextDouble();

        // realiza o controle de fluxo para verificar se o valor desejado para saque
        // esta disponível no saldo

        // Usando operadores if/else
        if (amountWithdraw <= balance) {
            returnMessage = "Saque autorizado, aguarde um instante!";
            balance = balance - amountWithdraw; // calcula o novo saldo do cliente
        } else {
            returnMessage = "Infelizmente você não possui saldo suficiente!";
        }

        // Usando operadores ternários
        /*
         * returnMessage = (amountWithdraw <= balance) ? "Saque autorizado, aguarde um
         * instante!" : "Infelizmente você não possui saldo suficiente!";
         * balance = (amountWithdraw <= balance) ? balance - amountWithdraw : balance;
         */

        // mensagem exibindo o retorno da função anterior
        System.out.println(returnMessage);
        // mensagem exibindo o saldo da conta
        System.out.println("Seu saldo disponível é de R$" + balance);

        // fecha o fluxo da classe scanner
        scanner.close();
    }
}
