package pekan5_2511533031;

public class Pasien_2511533031 {
	  private String namaPasien_3031;       
	  private String penyakit_3031;         
	  private int nomorAntrian_3031;        
	  private Pasien_2511533031 next_3031;  
	  //Constructor untuk menginisialisasi semua atribut node Pasien.
	    public Pasien_2511533031(String namaPasien_3031, String penyakit_3031, int nomorAntrian_3031) {
	    this.namaPasien_3031   = namaPasien_3031;
	    this.penyakit_3031     = penyakit_3031;
	    this.nomorAntrian_3031 = nomorAntrian_3031;
	    this.next_3031         = null; // default: belum ada node berikutnya
	    }
	  // Mengembalikan nama pasien 
	  public String getNamaPasien_3031() {
	  return namaPasien_3031;
	  } 
	  // Mengembalikan keluhan / penyakit pasien 
	  public String getPenyakit_3031() {
	  return penyakit_3031;
	  }
	  // Mengembalikan nomor antrian pasien 
	  public int getNomorAntrian_3031() {
	  return nomorAntrian_3031;
	  }
	  // Mengembalikan pointer ke node pasien berikutnya 
	  public Pasien_2511533031 getNext_3031() {
	  return next_3031;
	  }
	  // Mengubah nama pasien
	  public void setNamaPasien_3031(String namaPasien_3031) {
	  this.namaPasien_3031 = namaPasien_3031;
	  }
	  // Mengubah keluhan / penyakit pasien
	  public void setPenyakit_3031(String penyakit_3031) {
	  this.penyakit_3031 = penyakit_3031;
	  }
	  // Mengubah nomor antrian pasien
	  public void setNomorAntrian_3031(int nomorAntrian_3031) {
	  this.nomorAntrian_3031 = nomorAntrian_3031;
	  }
	  // Mengubah pointer ke node pasien berikutnya
	  public void setNext_3031(Pasien_2511533031 next_3031) {
	  this.next_3031 = next_3031;
	  }
	}
