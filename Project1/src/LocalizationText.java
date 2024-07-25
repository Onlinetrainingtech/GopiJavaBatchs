
import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationText {
    public static void main(String[] args) {
        Locale l1 = new Locale("fr", "FR");
        ResourceBundle myobj = ResourceBundle.getBundle("MessageBundle", l1);
        System.out.println(myobj.getString("message"));

        Locale l2 = new Locale("de", "DE");
        ResourceBundle myobj1 = ResourceBundle.getBundle("MessageBundle", l2);
        System.out.println(myobj1.getString("message"));
    }
}