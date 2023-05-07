package Stream;

import java.util.Arrays;

import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamClass {
	public static void main(String[] args) {

		
		List<Integer> list =  Arrays.asList(1,2,3,4,5,6,7,3456, 3456, 9,34, 44, 34, 44, 23, 433);

		List<Integer> filterdData = 
				list.stream()
					.filter(x -> x % 2 == 0)
					.map(n -> n/2)
					.distinct()
					.sorted((a,b) -> (b - a))
					.limit(3)
					.collect(Collectors.toList());
		System.out.println(filterdData);
	}
}

