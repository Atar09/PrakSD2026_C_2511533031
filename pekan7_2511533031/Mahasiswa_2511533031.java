package pekan7_2511533031;

public class Mahasiswa_2511533031 {

    // ===== ATRIBUT =====
    private String nama_3031;
    private String nim_3031;
    private String prodi_3031;

    // ===== CONSTRUCTOR =====
    public Mahasiswa_2511533031(String nama_3031, String nim_3031, String prodi_3031) {
        this.nama_3031 = nama_3031;
        this.nim_3031 = nim_3031;
        this.prodi_3031 = prodi_3031;
    }

    // ===== GETTER =====
    public String getNama_3031() {
        return nama_3031;
    }

    public String getNim_3031() {
        return nim_3031;
    }

    public String getProdi_3031() {
        return prodi_3031;
    }

    // ===== SETTER =====
    public void setNama_3031(String nama_3031) {
        this.nama_3031 = nama_3031;
    }

    public void setNim_3031(String nim_3031) {
        this.nim_3031 = nim_3031;
    }

    public void setProdi_3031(String prodi_3031) {
        this.prodi_3031 = prodi_3031;
    }

    // ===== toString =====
    @Override
    public String toString() {
        return nama_3031 + " | " + nim_3031 + " | " + prodi_3031;
    }
}