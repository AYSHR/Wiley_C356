package IOStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ProductList {
	private String name;
	private int price;
	private double stars;

	public ProductList(String name, String price, String stars) {
		this.name = name;
		int p=Integer.parseInt(price);
		this.price = p;
		double d=Double.parseDouble(stars);
		this.stars = d;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public double getStars() {
		return stars;
	}

	public static void main(String[] args) throws IOException {
		List<ProductList> pro = new ArrayList<>();
		try {
			FileReader reader = new FileReader("D:\\apr_25\\wiley_core_java\\Product.csv");
			BufferedReader br = new BufferedReader(reader);
			String line = "";
			while ((line = br.readLine()) != null) {
				StringTokenizer data = new StringTokenizer(line, ",");
				String name1 = data.nextToken();
				String price1 = data.nextToken();
				// int priceact=Integer.valueOf(price1);
				//String price1 = data.nextToken();
				String stars1 = data.nextToken();
				// double starsact=Double.parseDouble(stars1);
				ProductList p = new ProductList(name1, price1, stars1);
				pro.add(p);
			}
			br.close();
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.printf("%-30s %-10s %-5s %n","product name","price","rating");
		for (ProductList p1 : pro) {
			System.out.printf("%-30s %-10d %-5f %n",p1.getName(),p1.getPrice(),p1.getStars());
		}

	}

}
