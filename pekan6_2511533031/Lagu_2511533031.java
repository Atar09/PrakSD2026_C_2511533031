package pekan6_2511533031;

public class Lagu_2511533031 {

    // Atribut data lagu
    private String judul_3031;
    private String penyanyi_3031;

    // Pointer ke node berikutnya dan sebelumnya
    Lagu_2511533031 next_3031;
    Lagu_2511533031 prev_3031;

    // Constructor
    public Lagu_2511533031(String judul_3031, String penyanyi_3031) {
        this.judul_3031 = judul_3031;
        this.penyanyi_3031 = penyanyi_3031;
        this.next_3031 = null;
        this.prev_3031 = null;
    }

    // Getter
    public String getJudul_3031() {
        return judul_3031;
    }

    public String getPenyanyi_3031() {
        return penyanyi_3031;
    }

    // Setter
    public void setJudul_3031(String judul_3031) {
        this.judul_3031 = judul_3031;
    }

    public void setPenyanyi_3031(String penyanyi_3031) {
        this.penyanyi_3031 = penyanyi_3031;
    }
}