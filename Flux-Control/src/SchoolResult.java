public class SchoolResult {
    public static void main(String[] args) {

        // TODO: Declara variável de nota do aluno e mensagem de retorno
        double note = 6;
        String returnMessage = "";

        // Usando operadores if/else
        // Realiza o controle de fluxo e verifica se a nota do aluno é maior que a
        // média, resultando em aprovado ou reprovado

        if (note >= 7)
            returnMessage = "Aprovado!";
        else if (note >= 5 && note < 7)
            returnMessage = "Prova de recuperação!";
        else
            returnMessage = "Reprovado!";

        // Usando operadores ternários
        // returnMessage = (note >= 7) ? "Aprovado" : "Reprovado";

        // Mensagem exibindo o resultado final do aluno
        System.out.println("Resultado final: " + returnMessage);

    }
}
