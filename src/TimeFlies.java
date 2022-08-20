import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFlies {
    public static void main(String[] args) {
        DateTimeFormatter f1 = DateTimeFormatter.ISO_LOCAL_TIME;
        LocalTime t1 = LocalTime.parse("13:57:03",f1);
        try{
//            LocalTime t1 = LocalTime.parse("13:57:03",f1);
            System.out.println(t1);
        }catch (Exception e){
            System.out.println("yikes");
        }
        System.out.println(t1);
        System.out.println(t1.plusHours(1));
        System.out.println(t1.plusHours(4));
    }
}
