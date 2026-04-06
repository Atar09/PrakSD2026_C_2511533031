package pekan2_2511533031;


public class DaftarkataDriver_2511533031 {

	public static void main(String[] args) {
		DaftarKata_2511533031 al = new DaftarKata_2511533031();
		
		// Menambah elemen (akhir)
		al.tambah_2511533031("kami");
		al.tambah_2511533031("informatika");
		
		// Menyisipkan elemen pada index 1
		al.tambahPada_2511533031(1, "Mahasiswa");
		
		// Cetak isi awal
		System.out.println("Awal    : " + al);
		
		//mengubah elemen (index 1)
		al.ubahElemen_2511533031(1, "Departemen");
		System.out.println("Setelah Ubah: " + al);
		
		// Menghapus elemen (hapus index 0)
		String terhapus = al.hapusElemen_2511533031(0);
		System.out.println("Terhapus  : " + terhapus);
		System.out.println("Setelah Hapus: " + al);
		
		// Iterasi pada ArrayList (cetak setiap elemen)
		System.out.println("Iterasi");
		al.iterasiCetak_2511533031();
		System.out.println();

	}

}
