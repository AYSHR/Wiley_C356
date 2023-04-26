package Random;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class CurrencyClass {

	public static void main(String[] args) {
	//  Currency usd= Currency.getInstance("USD");
	   NumberFormat frm= NumberFormat.getCurrencyInstance(Locale.US);
	   String formatdate=frm.format(108.9);
	   System.out.println(formatdate);
	 double price=6789.09;
	 Locale local =new Locale("en","US");
	 NumberFormat frm1= NumberFormat.getCurrencyInstance(local);
	 String fprice=frm1.format(price);
	 System.out.println(fprice);
	 
	 DecimalFormat df=new DecimalFormat("#,##0.00");
	 df.setPositivePrefix("$");
	 String resvaql=df.format(price);
	 System.out.println("custom price :"+resvaql);
	 
	 Currency cur=Currency.getInstance("USD");
	 String symbol=cur.getSymbol();
	 String code=cur.getCurrencyCode();
	 System.out.println(symbol+" "+code);
	 

	}

}
