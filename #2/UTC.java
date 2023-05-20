import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

class UTC {

    public static void main(String[] args)
    {

        // Creating a Date class object
        // to take local time from the user
        Date localTime = new Date();

        // Creating a DateFormat class object to
        // convert the localtime to UTC (GMT)
        DateFormat s = new SimpleDateFormat("dd/MM/yyyy"
                + " "
                + " HH:mm:ss");

        // function will helps to get the GMT Timezone
        // using the getTimeZOne() method
        s.setTimeZone(TimeZone.getTimeZone("GMT"));

        // One can get any other time zone also
        // by passing some other argument to it

        // Printing the local time
        System.out.println("Local Time:" + localTime);

        // Printing the GMT time to
        // illustrate changes in GMT time
        System.out.println("UTC : "
                + s.format(localTime));
    }
}
