package pekan4_2511533031;
import java.util.*;
public class ReverseData_25115330331 {

	public static void main(String[] args) {
		Queue<Integer> q_3031 = new LinkedList<Integer>();
		q_3031.add(1);
		q_3031.add(2);
		q_3031.add(3);
		System.out.println("sebelum reverse" + q_3031);
		Stack<Integer> s_3031 = new Stack<Integer>();
		while (!q_3031.isEmpty()) { // Q -> S
			s_3031.push(q_3031.remove());
		}
		while (!s_3031.isEmpty()) { // S -> Q
			q_3031.add(s_3031.pop());
		}
		System.out.println("sesudah reverse= " + q_3031); // {3, 2, 1}
	}
}
