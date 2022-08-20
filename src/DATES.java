import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.Date;

public class DATES {
    static Date d = new Date(0);
    static String ds = "December 15,2004";
    static DateFormat df = DateFormat.getDateInstance();
    public static void main(String[] args) {


        try {
            d = df.parse(ds);
        }catch (ParseException e){
            System.out.println("Unable to parse " + ds);
        }
d.setTime((60*60*24) + d.getTime());
        System.out.println(d);
    }
}
