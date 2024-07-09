import java.time.*;
import java.time.format.*;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        String dateFull = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String dateMedium = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String dateShort = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));

        System.out.println(dateFull + '\n' + dateMedium + '\n' + dateShort);
    }
}