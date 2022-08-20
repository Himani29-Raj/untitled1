import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DATE {
    public static void main(String[] args) {
        DateFormat df = DateFormat.getDateInstance();
        Date date = new Date();
//        df.setLocale(Locale.ITALY);
        String s = df.format(date);
        System.out.println(date);
    }
}
