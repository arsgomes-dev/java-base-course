import java.text.NumberFormat;
import java.text.ParseException;

public class ExampleException {
    public static void main(String[] args) {
        Number valueNumber;
        try {
            valueNumber = NumberFormat.getInstance().parse("1.75");
            System.out.println(valueNumber);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
