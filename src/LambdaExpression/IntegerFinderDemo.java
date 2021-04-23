package LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class IntegerFinderDemo {

	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(1, 3, 5, 1, 7, 2, 8, 4, 9, 8, 11);
		find(ints, 9);
		findInteger(ints, 8);
		findInteger(ints, 67);

	}

	static void find(List<Integer> ints, int num) {
		boolean found = false;
		for (Integer integer : ints) {
			if (integer.equals(num)) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println(num + " Found");
		} else {
			System.out.println(num + " not found");
		}
	}

	static void findInteger(List<Integer> integers, int num) {
		if (integers.contains(num)) {
			System.out.println(num + " Found");
		} else {
			System.out.println(num + " not found");
		}
	}
}
