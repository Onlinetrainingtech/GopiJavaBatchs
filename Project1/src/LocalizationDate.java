import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LocalizationDate {

	public static void main(String[] args) {
		
		/*DateFormat df=DateFormat.getDateInstance(DateFormat.FULL,new Locale("en","US"));
		
		String d1=df.format(new Date());
		
		System.out.println(d1);*/
		
		DateFormat df=DateFormat.getTimeInstance(DateFormat.FULL,new Locale("en","US"));
		
		String d1=df.format(new Date());
		
		System.out.println(d1);

	}

}
