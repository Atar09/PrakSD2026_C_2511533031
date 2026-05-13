package pekan6_2511533031;

import java.util.*;
public class Musik_2511533031 {
    // Pointer kepala (awal) dan ekor (akhir) DLL
    private Lagu_2511533031 head_3031;
    private Lagu_2511533031 tail_3031;
    
    // Constructor — playlist dimulai kosong
    public Musik_2511533031() {
        head_3031 = null;
        tail_3031 = null;
    }
    // 1. tambahLagu_3031 — menambah lagu baru di AKHIR playlist
    public void tambahLagu_3031(String judul, String penyanyi) {
        Lagu_2511533031 lagubaru_3031 = new Lagu_2511533031(judul, penyanyi);

        if (head_3031 == null) {
            // Playlist kosong — node pertama sekaligus jadi head dan tail
            head_3031 = lagubaru_3031;
            tail_3031 = lagubaru_3031;
        } else {
            // Sambungkan ke akhir list
            lagubaru_3031.prev_3031 = tail_3031;
            tail_3031.next_3031     = lagubaru_3031;
            tail_3031               = lagubaru_3031;
        }
        System.out.println("Lagu berhasil ditambahkan!");
    }

    // 2. hapusLaguAwal_3031 — menghapus lagu pertama (head)
    public void hapusLaguAwal_3031() {
        if (head_3031 == null) {
            System.out.println("Playlist kosong, tidak ada lagu yang dihapus.");
            return;
        }

        System.out.println("Menghapus lagu: \"" + head_3031.getJudul_3031() + "\" - " + head_3031.getPenyanyi_3031());

        if (head_3031 == tail_3031) {
            // Hanya ada satu lagu, kosongkan list
            head_3031 = null;
            tail_3031 = null;
        } else {
            // Geser head ke node berikutnya, putus referensi lama
            head_3031           = head_3031.next_3031;
            head_3031.prev_3031 = null;
        }
        System.out.println("Lagu berhasil dihapus!");
    }
    // 3. tampilMaju_3031 — menampilkan semua lagu awal → akhir
    public void tampilMaju_3031() {
        if (head_3031 == null) {
            System.out.println("Playlist kosong.");
            return;
        }

        System.out.println("===== Playlist (Maju) =====");
        Lagu_2511533031 current_3031 = head_3031;
        int nomor_3031 = 1;

        while (current_3031 != null) {
            System.out.println(nomor_3031 + ". " + current_3031.getJudul_3031()
                    + " - " + current_3031.getPenyanyi_3031());
            current_3031 = current_3031.next_3031;
            nomor_3031++;
        }
        System.out.println("===========================");
    }

    // ----------------------------------------------------------
    // 4. tampilMundur_3031 — menampilkan semua lagu akhir → awal
    //    (memanfaatkan pointer prev — fitur utama DLL)
    // ----------------------------------------------------------
    public void tampilMundur_3031() {
        if (tail_3031 == null) {
            System.out.println("Playlist kosong.");
            return;
        }

        System.out.println("===== Playlist (Mundur) =====");
        Lagu_2511533031 current_3031 = tail_3031;
        int nomor_3031 = 1;

        while (current_3031 != null) {
            System.out.println(nomor_3031 + ". " + current_3031.getJudul_3031()
                    + " - " + current_3031.getPenyanyi_3031());
            current_3031 = current_3031.prev_3031;   // mundur lewat pointer prev
            nomor_3031++;
        }
        System.out.println("=============================");
    }
    // 5. cariLagu_3031 — mencari lagu berdasarkan judul
    //    (tidak case-sensitive)
    public void cariLagu_3031(String judul) {
        if (head_3031 == null) {
            System.out.println("Playlist kosong, tidak ada lagu untuk dicari.");
            return;
        }

        Lagu_2511533031 current_3031 = head_3031;
        int posisi_3031 = 1;
        boolean ditemukan_3031 = false;

        while (current_3031 != null) {
            if (current_3031.getJudul_3031().equalsIgnoreCase(judul)) {
                System.out.println("Lagu ditemukan di posisi " + posisi_3031 + ":");
                System.out.println("  Judul    : " + current_3031.getJudul_3031());
                System.out.println("  Penyanyi : " + current_3031.getPenyanyi_3031());
                ditemukan_3031 = true;
                break;
            }
            current_3031 = current_3031.next_3031;
            posisi_3031++;
        }

        if (!ditemukan_3031) {
            System.out.println("Lagu \"" + judul + "\" tidak ditemukan dalam playlist.");
        }
    }
    // main — program utama dengan menu interaktif
    public static void main(String[] args) {
        Scanner scanner_3031 = new Scanner(System.in);
        Musik_2511533031 playlist_3031 = new Musik_2511533031();

        int pilihan_3031;

        do {
            System.out.println("=== Playlist Musik NIM: 2511533031 ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Hapus Lagu Pertama");
            System.out.println("3. Lihat Playlist (Maju)");
            System.out.println("4. Lihat Playlist (Mundur)");
            System.out.println("5. Cari Lagu");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");

            pilihan_3031 = scanner_3031.nextInt();
            scanner_3031.nextLine(); // buang newline sisa

            switch (pilihan_3031) {
                case 1:
                    System.out.print("Judul   : ");
                    String judul_3031    = scanner_3031.nextLine();
                    System.out.print("Penyanyi: ");
                    String penyanyi_3031 = scanner_3031.nextLine();
                    playlist_3031.tambahLagu_3031(judul_3031, penyanyi_3031);
                    break;
                case 2:
                    playlist_3031.hapusLaguAwal_3031();
                    break;
                case 3:
                    playlist_3031.tampilMaju_3031();
                    break;
                case 4:
                    playlist_3031.tampilMundur_3031();
                    break;
                case 5:
                    System.out.print("Masukkan judul lagu yang dicari: ");
                    String cari_3031 = scanner_3031.nextLine();
                    playlist_3031.cariLagu_3031(cari_3031);
                    break;
                case 6:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

        } while (pilihan_3031 != 6);

        scanner_3031.close();
    }
}