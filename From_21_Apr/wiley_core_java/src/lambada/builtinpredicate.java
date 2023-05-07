package lambada;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class builtinpredicate {

	public static void main(String[] args) {
		Predicate<String> checklen=(String str)-> str.length()==4;
		List<String> fi=Arrays.asList("JAVA","PYTHON","JIRA");
		fi.forEach(l -> {if(checklen.test(l)) {
			System.out.println(l);
		}});
				
	

}
}
