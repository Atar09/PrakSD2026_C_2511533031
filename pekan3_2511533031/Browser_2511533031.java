package pekan3_2511533031;

import java.util.Scanner;
import java.util.Stack;

public class Browser_2511533031 {
    public static void main(String[] args) {
        Stack<Website_2511533031> history = new Stack<>();
        Scanner input = new Scanner(System.in);

        int pilihan;

        do {
            System.out.println("=== Browser History NIM: 2511533031 ===");
            System.out.println("1. Kunjungi Website (Push)");
            System.out.println("2. Tombol Back (Pop)");
            System.out.println("3. Lihat Halaman Aktif (Peek)");
            System.out.println("4. Cek Status History");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Judul: ");
                    String judul = input.nextLine();

                    System.out.print("Masukkan URL: ");
                    String url = input.nextLine();

                    history.push(new Website_2511533031(judul, url));
                    System.out.println("Berhasil mengunjungi halaman!");
                    break;

                case 2:
                    if (!history.isEmpty()) {
                        Website_2511533031 removed = history.pop();
                        System.out.println("Kembali dari: " + removed.getJudul_3031());
                    } else {
                        System.out.println("History kosong, tidak bisa kembali.");
                    }
                    break;

                case 3:
                    if (!history.isEmpty()) {
                        Website_2511533031 current = history.peek();
                        System.out.println("Halaman saat ini:");
                        System.out.println("Judul: " + current.getJudul_3031());
                        System.out.println("URL: " + current.getUrl_3031());
                    } else {
                        System.out.println("Belum ada halaman yang dibuka.");
                    }
                    break;

                case 4:
                    if (history.isEmpty()) {
                        System.out.println("History kosong.");
                    } else {
                        System.out.println("Jumlah history: " + history.size());
                    }
                    break;

                case 5:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 5);
    }
}