import java.text.NumberFormat;
import java.util.Locale;

public class LocalizationCurrency {

	public static void main(String[] args) {
		
		NumberFormat nft=NumberFormat.getCurrencyInstance(new Locale("de","DE"));
		
		String f1=nft.format(100000);
		
		System.out.println(f1);

	}

}
