package src.oops_6;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Lab188 {

	public static void main(String[] args) {
		List<Integer> marks = new ArrayList<>();
		marks.add(123);
		marks.add(234);
		marks.add(121);
		Collections.sort(marks);
		System.out.println(marks);
	}
}
