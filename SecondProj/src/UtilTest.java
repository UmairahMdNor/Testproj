import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;


public class UtilTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Date dt = new Date();
		String currentDate = String.valueOf(dt.getDay());
		System.out.println("Current Date is :" + currentDate);
		System.out.println("Current Time is :" + dt.getTime());

		Calendar cal = Calendar.getInstance();
		String currentCalDate = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MONTH)+1) + "/" + 
		cal.get(Calendar.YEAR) + " " + cal.get(Calendar.HOUR) + ":" + cal.get(Calendar.MINUTE)
		+ ":" + cal.get(Calendar.SECOND) + " " + cal.getTimeZone().getDisplayName();
		
		System.out.println("Current Date is :" + currentCalDate);
		
		//cal.set(year, month, date, hourOfDay, minute, second);
		int year		= Integer.parseInt(args[0]);
		int month		= Integer.parseInt(args[1]);
		int date		= Integer.parseInt(args[2]);
		int hourOfDay	= Integer.parseInt(args[3]);
		int minute		= Integer.parseInt(args[4]);
		int second		= Integer.parseInt(args[5]);
		
		cal.set(year, month, date, hourOfDay, minute, second);
		
		String yourCalDate = cal.get(Calendar.DATE) + "/" + cal.get(Calendar.MONTH) + "/" + 
				cal.get(Calendar.YEAR) + " " + cal.get(Calendar.HOUR) + ":" + cal.get(Calendar.MINUTE)
				+ ":" + cal.get(Calendar.SECOND) + " " + cal.getTimeZone().getDisplayName();
		

		System.out.println("Your Date is :" + yourCalDate);
		
		*/
		
		LocalDate localDate = LocalDate.now();
		System.out.println("Current Date Before : " + localDate);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh");
		//DateTimeFormatter formatter2 = DateTimeFormatter.ISO_DATE_TIME;
		
			String text = localDate.format(formatter);
			
			System.out.println("Current Date formatted :" + text);
			
			LocalDateTime parsedDate = LocalDateTime.parse(args[0], formatter);
			
			System.out.println("Your Parsed Date is :" + parsedDate.format(formatter));
		
		
		

		
	

	}

}

/*
to set Calendar

1. Accepts arguments
2. convert parameter from string to int
3. Set the parameters 
4. Display the results
*/
