package pekan4_2511533031;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList_2511533031 {

	public static void main(String[] args) {
		Queue<Integer> q_3031 = new LinkedList<>();
		// tambah elemen (0, 1, 2, 3, 4, 5) ke antrean
		for (int i = 0; i < 6; i++)
			q_3031.add(i);
		// Menampilkan isi antrean.
		System.out.println("Elemen Antrean " + q_3031);
		// Untuk menghapus kepala antrean
		int hapus_3031 = q_3031.remove();
		System.out.println("Hapus Elemen = " + hapus_3031);
		System.out.println(q_3031);
		// Untuk melihat antrean terdepan
		int depan_3031 = q_3031.peek();
		System.out.println("Kepala Antrean = " + depan_3031);
		// Untuk melihat panjang antrean
		int banyak_3031 = q_3031.size();
		System.out.println("Size Antrean = " + banyak_3031);
		
	}

}
