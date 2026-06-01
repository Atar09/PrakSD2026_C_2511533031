package pekan8_2511533031;
import java.util.Scanner;

public class Sorting_2511533031 {

 // Array maksimal 20 lagu, nama pakai 4 digit terakhir NIM
 static Lagu_2511533031[] dataLagu_3031 = new Lagu_2511533031[20];
 static int    jumlahLagu_3031 = 0;

 //  inputData_3031() – mengisi minimal 7 lagu ke dalam array
  static void inputData_3031() {
     dataLagu_3031[0]  = new Lagu_2511533031("Bohemian Rhapsody",       "Queen",               354);
     dataLagu_3031[1]  = new Lagu_2511533031("Shape of You",            "Ed Sheeran",          234);
     dataLagu_3031[2]  = new Lagu_2511533031("Blinding Lights",         "The Weeknd",          200);
     dataLagu_3031[3]  = new Lagu_2511533031("Rolling in the Deep",     "Adele",               228);
     dataLagu_3031[4]  = new Lagu_2511533031("As It Was",               "Harry Styles",        167);
     dataLagu_3031[5]  = new Lagu_2511533031("Uptown Funk",             "Mark Ronson ft Bruno",270);
     dataLagu_3031[6]  = new Lagu_2511533031("I Want It That Way",      "Backstreet Boys",	   213);
     jumlahLagu_3031   = 7;
 }

 //  mergeSort_3031() – Merge Sort berdasarkan Judul A-Z
 //  Parameter: array Lagu, indeks kiri, indeks kanan
 static void mergeSort_3031(Lagu_2511533031[] arr, int kiri, int kanan) {
     if (kiri >= kanan) return; // base case

     int tengah = (kiri + kanan) / 2;

     // Rekursi kiri dan kanan
     mergeSort_3031(arr, kiri, tengah);
     mergeSort_3031(arr, tengah + 1, kanan);

     // Gabungkan dua sub-array yang sudah terurut
     merge_3031(arr, kiri, tengah, kanan);
 }

 //  merge_3031() – menggabungkan dua bagian array terurut
 static void merge_3031(Lagu_2511533031[] arr, int kiri, int tengah, int kanan) {
     int ukuranKiri  = tengah - kiri + 1;
     int ukuranKanan = kanan - tengah;

     // Array sementara
     Lagu_2511533031[] tempKiri  = new Lagu_2511533031[ukuranKiri];
     Lagu_2511533031[] tempKanan = new Lagu_2511533031[ukuranKanan];

     // Salin data ke array sementara
     for (int i = 0; i < ukuranKiri;  i++) tempKiri[i]  = arr[kiri + i];
     for (int j = 0; j < ukuranKanan; j++) tempKanan[j] = arr[tengah + 1 + j];

     int i = 0, j = 0, k = kiri;

     // Bandingkan dan gabungkan berdasarkan judul (A-Z)
     while (i < ukuranKiri && j < ukuranKanan) {
         // compareToIgnoreCase agar tidak terpengaruh huruf besar/kecil
         if (tempKiri[i].judul_3031.compareToIgnoreCase(tempKanan[j].judul_3031) <= 0) {
             arr[k] = tempKiri[i];
             i++;
         } else {
             arr[k] = tempKanan[j];
             j++;
         }
         k++;
     }

     // Salin sisa elemen yang belum masuk
     while (i < ukuranKiri)  { arr[k] = tempKiri[i];  i++; k++; }
     while (j < ukuranKanan) { arr[k] = tempKanan[j]; j++; k++; }
 }

 //  tampilData_3031() – menampilkan isi array dataLagu_3031
 static void tampilData_3031(String keterangan) {
     System.out.println("\n" + keterangan);
     System.out.println("--------------------------------------------------");
     for (int i = 0; i < jumlahLagu_3031; i++) {
         Lagu_2511533031 l = dataLagu_3031[i];
         System.out.printf("%2d. %-35s | %-25s | %d detik%n",
                 i + 1, l.judul_3031, l.penyanyi_3031, l.durasi_3031);
     }
     System.out.println("--------------------------------------------------");
 }

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("=== Sorting Playlist NIM: 2511533031 ===      ");
     System.out.println("-----------------------------------------------");
     System.out.println("Pilih Algoritma (1=Shell, 2=Quick, 3=Merge): ");
     System.out.print("Masukkan pilihan Anda: ");

     int pilihan = sc.nextInt();

     // Isi data awal
     inputData_3031();

     // Tampilkan data sebelum sorting
     tampilData_3031("Data Sebelum Sorting:");

     if (pilihan == 3) {
         // Jalankan Merge Sort
         mergeSort_3031(dataLagu_3031, 0, jumlahLagu_3031 - 1);
         tampilData_3031("Data Setelah Merge Sort (Judul A-Z):");
     } else {
         System.out.println("\n[INFO] Program ini mengimplementasikan Merge Sort (pilihan 3).");
         System.out.println("       Menjalankan Merge Sort secara otomatis...");
         mergeSort_3031(dataLagu_3031, 0, jumlahLagu_3031 - 1);
         tampilData_3031("Data Setelah Merge Sort (Judul A-Z):");
     }

     System.out.println("\n[INFO] Sorting selesai. Terima kasih!");
     sc.close();
 }
}