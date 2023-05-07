package lambada;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class bifunctionclass {

	public static void main(String[] args) {
		UnaryOperator<Integer> n= a->a^1;
		System.out.println(n.apply(0));
		
		BinaryOperator<Integer> m= (a,b)->a^b;
		System.out.println(m.apply(10,5));

	}

}
