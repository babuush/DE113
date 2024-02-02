import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_parser {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM - dd- yyyy  (EEEE)");
        String data_string = sdf.format(today);
        System.out.println(data_string);
        String dateString = data_string.substring(0,13);
        String[] dateArray = dateString.split("-");
        System.out.println("Date: "+dateArray[0].strip());
        System.out.println("Month: "+dateArray[1].strip());
        System.out.println("Year: "+dateArray[2].strip());

    }
}
