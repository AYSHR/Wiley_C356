package lambada;

import java.util.function.Supplier;

public class builtinsupplier {

	public static void main(String[] args) {
		Supplier<String> msg= () -> "msg printed";
		System.out.print(msg.get());
		
		

	}

}
