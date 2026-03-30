package pekan1_2511533031;
import java.util.Scanner;
public class Jamdriver2_2511533031 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("=== Program Driver objek Jam ===");
		// 1. input jam pertama
		System.out.println("\n--- Input Jam 1 ---");
		Jam_2511533031 j1 = buatJamDariInput(input);
		
		// 2. input jam kedua
		System.out.println("\n--- Input Jam 2 ---");
		Jam_2511533031 j2 = buatJamDariInput(input);
		
		// 3. Menampilkan Data
		System.out.println("\n--- Hasil Operasi ---");
		System.out.println("Jam 1 (String)        : " + j1.toString());
		System.out.println("Jam 2 (String)        : " + j2.toString());
		System.out.println("Jam 1 dalam detik     : " + j1.toSeconds());
		System.out.println("Jam 2 dalam detik     : " + j2.toSeconds());
		
		// 4. Operasi Relasional (Perbandingan)
		int perbandingan = j1.compareTo(j2);
		if (perbandingan > 0) {
			System.out.println("Status			 : Jam 1 lebih lambat (setelah) Jam 2");
		} else if (perbandingan < 0) {
			System.out.println("Status			 : Jam 1 lebih awal (sebelum) Jam 2");
		} else {
			System.out.println("Status			 : Jam 1 dan Jam 2 sama persis");
		}
		
		// 5. Operasi Aritmatika
		System.out.println("Durasi (J1 ke J2)	: " + Jam_2511533031.durasiDetik(j1, j2) + " detik ");
		
		Jam_2511533031 jnext = j1.nextSecond();
		System.out.println("Jam 1 detik berikutnya: " + jnext);
		
		Jam_2511533031 jprev = j1.prevSecond();
		System.out.println("Jam 1 detik sebelumnya: " + jprev);
		
		// 6. Operasi penjumlahan jam
		Jam_2511533031 jHasilPlus = j1.plus(j2);
		System.out.println("Hasil J1 + J2      : " + jHasilPlus);
		
		input.close();
		System.out.println("\nProgram Selesai.");
	}
	
	private static Jam_2511533031 buatJamDariInput(Scanner sc) {
		int h, m, s;
		while (true) {
			System.out.print("Masukkan Jam (0-23)    :");
			h = sc.nextInt();
			System.out.print("Masukkan Menit (0-59)  :");
			m = sc.nextInt();
			System.out.print("Masukkan detik (0-59)  :");
			s = sc.nextInt();
			
			// Memanggil method static isValid dari kelas Jam
			if (Jam_2511533031.isValid(h, m, s)) {
				return new Jam_2511533031 (h, m, s);
			} else {
				System.out.println("[Error] input tidak valid! Silahkan ulangi");
			}
			
		}
	}

}
