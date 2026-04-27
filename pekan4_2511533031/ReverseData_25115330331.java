package pekan4_2511533031;
import java.util.*;
public class ReverseData_25115330331 {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println("sebelum reverse" + q);
		Stack<Integer> s = new Stack<Integer>();
		while (!q.isEmpty()) { // Q -> S
			s.push(q.remove());
		}
		while (!s.isEmpty()) { // S -> Q
			q.add(s.pop());
		}
		System.out.println("sesudah reverse= " + q); // {3, 2, 1}
	}
}
