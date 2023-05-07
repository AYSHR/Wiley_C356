package lambada;
interface wiley{
	int calc(int val);
}
public class functinalinterfaceclass {

	public static void main(String[] args) {
		wiley c= val-> {return val +54;};
		System.out.println("result "+c.calc(54));

	}

}
