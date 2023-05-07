package lambada;

import java.util.function.BiConsumer;

public class biconsumer {

	public static void main(String[] args) {
		BiConsumer<Integer,Integer> hm= (Integer age,Integer sal) -> { if(age>18 && sal >1000) {  System.out.println("valid");}
		else
			System.out.println("valid");
		};
		hm.accept(21, 100098);
	}

}
