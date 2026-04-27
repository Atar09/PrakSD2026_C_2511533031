package pekan4_2511533031;
import java.util.*;
public class IterasiQueue_2511533031 {

	public static void main(String[] args) {
		Queue<String> q_3031 = new LinkedList<> ();
		
		q_3031.add("Praktikum");
		q_3031.add("Struktur");
		q_3031.add("Data");
		q_3031.add("dan");
		q_3031.add("Algoritma");
		Iterator<String> iterator = q_3031.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		
	}

}
