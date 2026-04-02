package pekan1_2511533031;

public class Driver_2511533031 {

    public static void main(String[] args) {

        // tambah mobil
        Mobil_2511533031 mobil1 = Mobil_2511533031.tambahMobil(
                "Fortuner", 2022, 2400, 550000000, "Toyota"
        );

        Mobil_2511533031 mobil2 = Mobil_2511533031.tambahMobil(
                "Pajero", 2021, 2500, 600000000, "Mitsubishi"
        );

        // tampil awal
        System.out.println("=== DATA AWAL ===");
        System.out.println("\nMobil 1:");
        mobil1.tampilkan();

        System.out.println("\nMobil 2:");
        mobil2.tampilkan();

        // update harga
        mobil1.setHarga(530000000);
        mobil2.setHarga(550000000);

        System.out.println("\n=== SETELAH UPDATE HARGA ===");
        System.out.println("\nMobil 1:");
        mobil1.tampilkan();

        System.out.println("\nMobil 2:");
        mobil2.tampilkan();

        // hapus mobil1
        mobil1.hapusMobil();

        System.out.println("\n=== SETELAH HAPUS MOBIL 1 ===");
        System.out.println("\nMobil 1:");
        mobil1.tampilkan();

        System.out.println("\nMobil 2:");
        mobil2.tampilkan();
    }
}