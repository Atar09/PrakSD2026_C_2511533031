package pekan5_2511533031;
import java.util.*;
public class RumahSakit_2511533031 {

    // pointer ke node pertama (head)
    private Pasien_2511533031 head_3031 = null;
    // menyimpan nomor antrian (auto increment)
    private int nomor_3031 = 0;
    // Method untuk menambahkan pasien ke antrian (Insert di tail)
    public void tambahPasien_3031(String nama_3031, String penyakit_3031) {
        nomor_3031++; // nomor antrian bertambah otomatis
        // membuat node pasien baru
        Pasien_2511533031 baru_3031 = new Pasien_2511533031(nama_3031, penyakit_3031, nomor_3031);
        // jika antrian kosong, node baru menjadi head
        if (head_3031 == null) {
            head_3031 = baru_3031;
        } 
        // jika tidak kosong, telusuri sampai node terakhir
        else {
            Pasien_2511533031 temp_3031 = head_3031;
            while (temp_3031.getNext_3031() != null) {
                temp_3031 = temp_3031.getNext_3031();
            }
            // hubungkan node terakhir dengan node baru
            temp_3031.setNext_3031(baru_3031);
        }
        System.out.println("Pasien berhasil didaftarkan! Nomor Antrian: " + nomor_3031);
    }
    // Method untuk memanggil pasien (Delete Head)
    public void panggilPasien_3031() {
        // jika antrian kosong
        if (head_3031 == null) {
            System.out.println("Antrian kosong!");
            return;
        }
        // tampilkan data pasien yang dipanggil
        System.out.println("Memanggil: " + head_3031.getNamaPasien_3031() +
                " | Keluhan: " + head_3031.getPenyakit_3031());
        // pindahkan head ke node berikutnya
        head_3031 = head_3031.getNext_3031();
    }
    // Method untuk menampilkan seluruh antrian (Display)
    public void tampilkanAntrian_3031() {
        // jika antrian kosong
        if (head_3031 == null) {
            System.out.println("Antrian kosong!");
            return;
        }
        Pasien_2511533031 temp_3031 = head_3031;
        System.out.println("=== Daftar Antrian ===");
        // menelusuri dari head sampai null
        while (temp_3031 != null) {
            System.out.println(
                temp_3031.getNomorAntrian_3031() + ". " +
                temp_3031.getNamaPasien_3031() + " (" +
                temp_3031.getPenyakit_3031() + ")"
            );
            temp_3031 = temp_3031.getNext_3031();
        }
    }
    // Method untuk mencari pasien berdasarkan nama (Search)
    public void cariPasien_3031(String nama_3031) {
        Pasien_2511533031 temp_3031 = head_3031;
        boolean ketemu_3031 = false;
        // telusuri seluruh linked list
        while (temp_3031 != null) {
            // pencarian tidak membedakan huruf besar/kecil
            if (temp_3031.getNamaPasien_3031().equalsIgnoreCase(nama_3031)) {
                System.out.println("Pasien ditemukan: " +
                        temp_3031.getNamaPasien_3031() +
                        " | Keluhan: " + temp_3031.getPenyakit_3031() +
                        " | No: " + temp_3031.getNomorAntrian_3031());
                ketemu_3031 = true;
                break;
            }
            temp_3031 = temp_3031.getNext_3031();
        }
        // jika tidak ditemukan
        if (!ketemu_3031) {
            System.out.println("Pasien tidak ditemukan.");
        }
    }
    // Method untuk menampilkan status antrian
    public void status_3031() {
        // jika antrian kosong
        if (head_3031 == null) {
            System.out.println("Antrian kosong!");
            return;
        }
        int jumlah_3031 = 0;
        Pasien_2511533031 temp_3031 = head_3031;
        // menghitung jumlah pasien
        while (temp_3031 != null) {
            jumlah_3031++;
            temp_3031 = temp_3031.getNext_3031();
        }
        // menampilkan hasil
        System.out.println("Jumlah pasien: " + jumlah_3031);
        System.out.println("Pasien terdepan: " + head_3031.getNamaPasien_3031());
    }
    // Method utama (main program)
    public static void main(String[] args) {
        Scanner sc_3031 = new Scanner(System.in);
        RumahSakit_2511533031 rs_3031 = new RumahSakit_2511533031();
        int pilih_3031;
        do {
            System.out.println("\n=== Antrian Rumah Sakit NIM: 2511533031 ===");
            System.out.println("1. Daftarkan Pasien (Insert)");
            System.out.println("2. Panggil Pasien (Delete Head)");
            System.out.println("3. Tampilkan Antrian (Display)");
            System.out.println("4. Cari Pasien (Search)");
            System.out.println("5. Cek Status Antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilih_3031 = sc_3031.nextInt();
            sc_3031.nextLine();
            switch (pilih_3031) {
                case 1:
                    System.out.print("Masukkan Nama Pasien : ");
                    String nama_3031 = sc_3031.nextLine();
                    System.out.print("Masukkan Keluhan     : ");
                    String penyakit_3031 = sc_3031.nextLine();
                    rs_3031.tambahPasien_3031(nama_3031, penyakit_3031);
                    break;
                case 2:
                    rs_3031.panggilPasien_3031();
                    break;
                case 3:
                    rs_3031.tampilkanAntrian_3031();
                    break;
                case 4:
                    System.out.print("Masukkan nama yang dicari : ");
                    String cari_3031 = sc_3031.nextLine();
                    rs_3031.cariPasien_3031(cari_3031);
                    break;
                case 5:
                    rs_3031.status_3031();
                    break;
                case 6:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih_3031 != 6);
        sc_3031.close();
    }
}

