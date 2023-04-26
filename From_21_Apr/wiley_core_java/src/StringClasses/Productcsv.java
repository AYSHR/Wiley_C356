package StringClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
class Product{
	String pname;
	String price;
	public void setpname(String name) {
		this.pname=name;
	}
	public void setprice(String rupee) {
		this.price=rupee;
	}
}
public class Productcsv {
public static void main(String[] args) {
	String data="hp_Victus,55990,ASUS_tuf,4990,ASUS_Vivubook,47990,lrnovo_thinbook,45490";
	StringTokenizer st1 =new StringTokenizer(data,",");
	int i=0;
	List<Product> pro=new ArrayList<>();
	while(st1.hasMoreElements()) {
		if((i%2)==0) {
			pro.add(new Product().setpname(st1.nextToken());
		i++;
		}
		else {
			pro.add(new Product().setprice(st1.nextToken()));
		i++;
		}
		//System.out.println(st1.nextToken());
	}
}
}
