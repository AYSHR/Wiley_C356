package generic;
//T  extends Animal & Serializable
// t extends Object will make it use animal as well as int,string as well
public class Printer<T  extends Animal> {
 T valtoprint;
 public Printer(T valtoprint) {
	 super();
	 this.valtoprint=valtoprint;
 }
 public void print() {
	 System.out.println(valtoprint);
 }
	

}
