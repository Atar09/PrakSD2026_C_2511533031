package pekan4_2511533031;

public class Queue_2511533031 {

    // === DEKLARASI VARIABEL ===
    private int front_3031;
    private int rear_3031;
    private int max_3031;
    private String[] queue_3031;

    // === KONSTRUKTOR ===
    public Queue_2511533031(int max_3031) {
        this.max_3031   = max_3031;
        this.queue_3031 = new String[max_3031];
        this.front_3031 = -1;
        this.rear_3031  = -1;
    }

    // isEmpty_3031() - cek apakah antrian kosong
    public boolean isEmpty_3031() {
        return front_3031 == -1;
    }

    // isFull_3031() - cek apakah antrian penuh
    public boolean isFull_3031() {
        return rear_3031 == max_3031 - 1;
    }

    // enqueue_3031() - tambah pelanggan ke belakang antrian
    public void enqueue_3031(String nama_3031) {
        if (isFull_3031()) {
            System.out.println("Antrian penuh! Tidak bisa menambah data.");
            return;
        }
        if (isEmpty_3031()) {
            front_3031 = 0;
        }
        rear_3031++;
        queue_3031[rear_3031] = nama_3031;
        System.out.println("Data berhasil ditambahkan ke antrian");
    }

    // dequeue_3031() - hapus pelanggan dari depan antrian
    public void dequeue_3031() {
        if (isEmpty_3031()) {
            System.out.println("Antrian kosong! Tidak ada data yang dihapus.");
            return;
        }
        String dilayani_3031 = queue_3031[front_3031];

        // Geser semua elemen ke depan
        for (int i_3031 = front_3031; i_3031 < rear_3031; i_3031++) {
            queue_3031[i_3031] = queue_3031[i_3031 + 1];
        }

        queue_3031[rear_3031] = null;
        rear_3031--;

        if (rear_3031 < front_3031) {
            front_3031 = -1;
            rear_3031  = -1;
        }

        System.out.println(dilayani_3031 + " telah dilayani");
    }

    // display_3031() - tampilkan seluruh isi antrian
    public void display_3031() {
        if (isEmpty_3031()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Isi antrian:");
        for (int i_3031 = front_3031; i_3031 <= rear_3031; i_3031++) {
            System.out.println((i_3031 - front_3031 + 1) + ". " + queue_3031[i_3031]);
        }
    }

    // reverse_3031() - balik seluruh isi antrian
    public void reverse_3031() {
        if (isEmpty_3031()) {
            System.out.println("Antrian kosong!");
            return;
        }

        int kiri_3031  = front_3031;
        int kanan_3031 = rear_3031;

        while (kiri_3031 < kanan_3031) {
            String temp_3031  = queue_3031[kiri_3031];
            queue_3031[kiri_3031]  = queue_3031[kanan_3031];
            queue_3031[kanan_3031] = temp_3031;

            kiri_3031++;
            kanan_3031--;
        }

        System.out.println("Isi antrian setelah dibalik:");
        for (int i_3031 = front_3031; i_3031 <= rear_3031; i_3031++) {
            System.out.println((i_3031 - front_3031 + 1) + ". " + queue_3031[i_3031]);
        }
    }
}