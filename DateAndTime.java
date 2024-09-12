package beginnerlevel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateAndTime {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println("\n\nDate and Time (Without format): "+date);
        
        DateFormat dateaformat = new SimpleDateFormat("dd/MM/YYYY");
        String currentDate = dateaformat.format(date);
        System.out.println("Current Date (With Format): "+currentDate);
        
        LocalTime time = LocalTime.now();
        System.out.println("Local Time (Without Format): "+time);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String FormattedTime = time.format(formatter);
        System.out.println("Formatted Time: "+FormattedTime+"\n\n");
    }
}
