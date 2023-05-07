package Assignment;

import java.text.NumberFormat;
import java.util.Locale;

public class DifferCurrency {

	public static void main(String[] args) {
		double price=435.78;
		NumberFormat frm0= NumberFormat.getCurrencyInstance(Locale.US);
		   String formatdate1=frm0.format(price);
		System.out.println("money in dollar ="+formatdate1);
		price*=81.75;
		  NumberFormat frm= NumberFormat.getCurrencyInstance(new Locale("en","IN"));
		  String formatdate2=frm.format(price);
		   System.out.println("MONEY IN INR ="+formatdate2);
		 //  price=435.78;
		   price*=0.011;
		   System.out.println(price);
		   NumberFormat frm1= NumberFormat.getCurrencyInstance(Locale.FRANCE);
			  String formatdate3=frm1.format(price);
			   System.out.println("MONEY IN EUROS ="+ formatdate3);
	}

}
