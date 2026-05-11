package pekan6_2511533031;

public class PenelusuranDLL_2511533031 {
    // fungsi penelusuran maju
    static void forwardTraversal(NodeDLL_2511533031 head_3031) {
        // memulai penelusuran dari head
        NodeDLL_2511533031 curr_3031 = head_3031;
        // lanjutkan sampai akhir
        while (curr_3031 != null) {
            // print data
            System.out.print(curr_3031.data_3031 + " <-> ");
            // pindah ke node berikutnya
            curr_3031 = curr_3031.next_3031;
        }
        // print spasi
        System.out.println();
    }
    // fungsi penelusuran mundur
    static void backwardTraversal(NodeDLL_2511533031 tail_3031) {
        // mulai dari akhir
        NodeDLL_2511533031 curr_3031 = tail_3031;
        // lanjut sampai head
        while (curr_3031 != null) {
            // cetak data
            System.out.print(curr_3031.data_3031 + " <-> ");
            // pindah ke node sebelumnya
            curr_3031 = curr_3031.prev_3031;
        }
        // cetak spasi
        System.out.println();
    }
    public static void main(String[] args) {
        // cetak DLL
        NodeDLL_2511533031 head_3031 = new NodeDLL_2511533031(1);
        NodeDLL_2511533031 second_3031 = new NodeDLL_2511533031(2);
        NodeDLL_2511533031 third_3031 = new NodeDLL_2511533031(3);
        
        head_3031.next_3031 = second_3031;
        second_3031.prev_3031 = head_3031;
        second_3031.next_3031 = third_3031;
        third_3031.prev_3031 = second_3031;
        
        System.out.println("Penelusuran maju: ");
        forwardTraversal(head_3031);
        
        System.out.println("Penelusuran Mundur: ");
        backwardTraversal(third_3031);
    }
}
