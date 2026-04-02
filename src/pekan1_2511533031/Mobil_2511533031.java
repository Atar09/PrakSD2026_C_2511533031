package pekan1_2511533031;

public class Mobil_2511533031 {

    private String nama;
    private int tahun;
    private int cc;
    private double harga;
    private String merk;

    // constructor
    public Mobil_2511533031(String nama, int tahun, int cc, double harga, String merk) {
        this.nama = nama;
        this.tahun = tahun;
        this.cc = cc;
        this.harga = harga;
        this.merk = merk;
    }

    // ===== SELECTOR (getter)
    public String getNama() { return nama; }
    public int getTahun() { return tahun; }
    public int getCc() { return cc; }
    public double getHarga() { return harga; }
    public String getMerk() { return merk; }

    // ===== MUTATOR (setter)
    public void setHarga(double harga) {
        this.harga = harga;
    }

    // ===== TAMBAH MOBIL (membuat objek baru)
    public static Mobil_2511533031 tambahMobil(String nama, int tahun, int cc, double harga, String merk) {
        return new Mobil_2511533031(nama, tahun, cc, harga, merk);
    }

    // ===== HAPUS MOBIL (mengosongkan data)
    public void hapusMobil() {
        this.nama = "";
        this.tahun = 0;
        this.cc = 0;
        this.harga = 0;
        this.merk = "";
    }

    // tampilkan data
    public void tampilkan() {
        System.out.println("Nama  : " + nama);
        System.out.println("Tahun : " + tahun);
        System.out.println("CC    : " + cc);
        System.out.println("Harga : " + harga);
        System.out.println("Merk  : " + merk);
    }
}