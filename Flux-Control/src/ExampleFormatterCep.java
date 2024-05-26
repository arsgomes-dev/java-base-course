public class ExampleFormatterCep {
    public static void main(String[] args) {
        try {
            String cepFormatter = formatterCep("2376500764");
            System.out.println(cepFormatter);
        } catch (CepInvalidException e) {
            // TODO Auto-generated catch block
            System.out.println("O cep é inválido!");
        }
    }

    static String formatterCep(String cep) throws CepInvalidException {
        if (cep.length() != 10)
            throw new CepInvalidException();
        // simulando um cep formatado
        return "23.765.003-04";
    }
}
