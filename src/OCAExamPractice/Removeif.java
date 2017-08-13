package OCAExamPractice;

import java.util.ArrayList;
import java.util.List;

public class Removeif {
	public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(9);
		list.add(30);
		list.add(11);
		list.removeIf(e->e%2 !=0);
		System.out.println(list);
	}

}
