package lambada;

public class Lambadclass {

	static String printthing(Printable thing) {
		
		return thing.print("*");
	}
	public static void main(String[] args) {
		product p=new product();
	//	p.print();
	//	printthing(p);
	/* Printable lam=() -> System.out.println("from lambada"); */
		//Printable lam= s-> System.out.println("from lambada"+s);
		Printable lam= s-> {return "wiley"+s;};
		System.out.println(printthing(lam));
		
		//printthing(() -> System.out.println("from lambada"));

	}

}
