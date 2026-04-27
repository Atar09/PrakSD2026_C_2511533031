package pekan4_2511533031;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		// tambah elemen (0, 1, 2, 3, 4, 5) ke antrean
		for (int i = 0; i < 6; i++)
			q.add(i);
		// Menampilkan isi antrean.
		System.out.println("Elemen Antrean " + q);
		// Untuk menghapus kepala antrean
		int hapus = q.remove();
		System.out.println("Hapus Elemen = " + hapus);
		System.out.println(q);
		// Untuk melihat antrean terdepan
		int depan = q.peek();
		System.out.println("Kepala Antrean = " + depan);
		// Untuk melihat panjang antrean
		int banyak = q.size();
		System.out.println("Size Antrean = " + banyak);
		
	}

}
