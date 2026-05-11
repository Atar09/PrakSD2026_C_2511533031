package pekan6_2511533031;

public class HapusDLL_2511533031 {
    // fungsi menghapus node awal
    public static NodeDLL_2511533031 delHead(NodeDLL_2511533031 head_3031) {
        if (head_3031 == null) {
            return null; }
        NodeDLL_2511533031 temp_3031 = head_3031;
        head_3031 = head_3031.next_3031;
        if (head_3031 != null) {
            head_3031.prev_3031 = null; }
        return head_3031;
    }
    // fungsi menghapus di akhir
    public static NodeDLL_2511533031 delLast(NodeDLL_2511533031 head_3031) {
        if (head_3031 == null) {
            return null; }
        if (head_3031.next_3031 == null) {
            return null; }
        NodeDLL_2511533031 curr_3031 = head_3031;
        while (curr_3031.next_3031 != null) {
            curr_3031 = curr_3031.next_3031;
        }
        // update pointer previous node
        if (curr_3031.prev_3031 != null) {
            curr_3031.prev_3031.next_3031 = null;
        }
        return head_3031;
        }
    // fungsi menghapus node posisi tertentu
    public static NodeDLL_2511533031 delPos(NodeDLL_2511533031 head_3031, int pos_3031) {
        // jika DLL kosong
        if (head_3031 == null) {
            return head_3031;
        }
        NodeDLL_2511533031 curr_3031 = head_3031;
        // telusuri sampai ke node yang akan dihapus
        for (int i_3031 = 1; curr_3031 != null && i_3031 < pos_3031; ++i_3031) {
            curr_3031 = curr_3031.next_3031;
        }
        // jika posisi tidak ditemukan
        if (curr_3031 == null) {
            return head_3031;
        }
        // Update pointer
        if (curr_3031.prev_3031 != null) {
            curr_3031.prev_3031.next_3031 = curr_3031.next_3031;
        }
        if (curr_3031.next_3031 != null) {
            curr_3031.next_3031.prev_3031 = curr_3031.prev_3031;
        }
        // jika yang dihapus head
        if (head_3031 == curr_3031) {
            head_3031 = curr_3031.next_3031;
        }
        return head_3031;
    }

    // fungsi mencetak DLL
    public static void printList(NodeDLL_2511533031 head_3031) {
        NodeDLL_2511533031 curr_3031 = head_3031;
        while (curr_3031 != null) {
            System.out.print(curr_3031.data_3031 + " ");
            curr_3031 = curr_3031.next_3031;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // buat sebuah DLL
        NodeDLL_2511533031 head_3031 = new NodeDLL_2511533031(1);
        head_3031.next_3031 = new NodeDLL_2511533031(2);
        head_3031.next_3031.prev_3031 = head_3031;
        head_3031.next_3031.next_3031 = new NodeDLL_2511533031(3);
        head_3031.next_3031.next_3031.prev_3031 = head_3031.next_3031;
        head_3031.next_3031.next_3031.next_3031 = new NodeDLL_2511533031(4);
        head_3031.next_3031.next_3031.next_3031.prev_3031 = head_3031.next_3031.next_3031;
        head_3031.next_3031.next_3031.next_3031.next_3031 = new NodeDLL_2511533031(5);
        head_3031.next_3031.next_3031.next_3031.next_3031.prev_3031 = head_3031.next_3031.next_3031.next_3031;

        System.out.print("DLL Awal: ");
        printList(head_3031);
        
        System.out.print("Setelah head dihapus: ");
        head_3031 = delHead(head_3031);
        printList(head_3031);
        
        System.out.print("Setelah node terakhir dihapus: ");
        head_3031 = delLast(head_3031);
        printList(head_3031);
        
        System.out.print("Menghapus node ke 2: ");
        head_3031 = delPos(head_3031, 2);
        printList(head_3031);
    }
}

