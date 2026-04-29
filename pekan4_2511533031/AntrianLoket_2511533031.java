package pekan4_2511533031;

import java.util.*;
public class AntrianLoket_2511533031 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue_2511533031 antrian = new Queue_2511533031(5);
        int pilihan_3031;

        do {
            System.out.println("=== PROGRAM ANTRIAN LOKET ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Hapus Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Reverse");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan_3031 = sc.nextInt();
            sc.nextLine(); // buang newline

            switch (pilihan_3031) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama_3031 = sc.nextLine();
                    antrian.enqueue_3031(nama_3031);
                    break;

                case 2:
                    antrian.dequeue_3031();
                    break;

                case 3:
                    antrian.display_3031();
                    break;

                case 4:
                    antrian.reverse_3031();
                    break;

                case 5:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan_3031 != 5);

        sc.close();
    }
}