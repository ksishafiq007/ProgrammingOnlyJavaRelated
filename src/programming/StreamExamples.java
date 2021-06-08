package programming;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
//import java.util.stream.Collectors;

public class StreamExamples {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(22, 23, 24, 25); // create a list of integers
		// demonstration of map method
		//ist<Integer> square = number.stream().map(m -> m * m).collect(Collectors.toList());
		//System.out.println(square);

		List<String> names = Arrays.asList("Reflection", "Inheritence", "Sanjita", "Collection", "Stream"); // create a
																											// list of
																											// String
		// demonstration of filter method
		//List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
		//System.out.println(result);

		// demonstration of sorted method
		//List<String> show = names.stream().sorted().collect(Collectors.toList());
		//System.out.println(show);

		//List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 3, 2); // create a list of integers
		// collect method returns a set
		//Set<Integer> squareSet = numbers.stream().map(x -> x * x).collect(Collectors.toSet());
		//System.out.println(squareSet);

		// demonstration of forEach method
		//number.stream().map(x -> x * x).forEach(y -> System.out.println(y));

		List<Integer> numberForReduce = Arrays.asList(2, 3, 4, 5); // create a list of integers
		// demonstration of reduce method
		//int even = numberForReduce.stream().filter(x -> x % 2 == 0).reduce(3, (ans, i) -> ans + i); // answer=0,answer=answer+i
		//System.out.println(even);

	}

}
