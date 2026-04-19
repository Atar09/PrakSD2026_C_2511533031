package pekan2_2511533031;

import java.util.*;
public class Playlist_2511533031 {
    public static void main(String[] args) {
        ArrayList<Musik_2511533031> playlist = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int pilihan;

        do {
            System.out.println("=== Playlist Musik NIM: 2511533031 ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Lihat Playlist");
            System.out.println("3. Hapus Lagu");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Judul: ");
                    String judul = input.nextLine();

                    System.out.print("Penyanyi: ");
                    String penyanyi = input.nextLine();

                    System.out.print("Durasi: ");
                    int durasi = input.nextInt();

                    playlist.add(new Musik_2511533031(judul, penyanyi, durasi));
                    System.out.println("Lagu ditambahkan!");
                    break;

                case 2:
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist kosong.");
                    } else {
                        for (int i = 0; i < playlist.size(); i++) {
                            Musik_2511533031 lagu = playlist.get(i);
                            System.out.println((i + 1) + ". " 
                                + lagu.getJudul_3031() + " - " 
                                + lagu.getPenyanyi_3031() + " (" 
                                + lagu.getDurasi_3031() + " detik)");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Hapus index: ");
                    int index = input.nextInt();

                    if (index > 0 && index <= playlist.size()) {
                        playlist.remove(index - 1);
                        System.out.println("Lagu dihapus.");
                    } else {
                        System.out.println("Index tidak valid.");
                    }
                    break;

                case 4:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan tidak ada.");
            }

        } while (pilihan != 4);
    }
}