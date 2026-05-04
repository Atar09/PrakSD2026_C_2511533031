package pekan5_2511533031;

public class PencarianSLL_2511533031 {
    static boolean searchKey(NodeSLL_2511533031 head_3031, int key_3031) {
        NodeSLL_2511533031 curr_3031 = head_3031;
        while (curr_3031 != null) {
            if (curr_3031.data_3031 == key_3031)
                return true;
            curr_3031 = curr_3031.next_3031; }
        return false; }
    public static void traversal(NodeSLL_2511533031 head_3031) {
        // mulai dari head
        NodeSLL_2511533031 curr_3031 = head_3031;
        // telusuri sampai pointer null
        while (curr_3031 != null) {
            System.out.print(" " + curr_3031.data_3031);
            curr_3031 = curr_3031.next_3031; }
        System.out.println();}
    public static void main(String[] args) {
        NodeSLL_2511533031 head_3031 = new NodeSLL_2511533031(14);
        head_3031.next_3031 = new NodeSLL_2511533031(21);
        head_3031.next_3031.next_3031 = new NodeSLL_2511533031(13);
        head_3031.next_3031.next_3031.next_3031 = new NodeSLL_2511533031(30);
        head_3031.next_3031.next_3031.next_3031.next_3031 = new NodeSLL_2511533031(10);
        System.out.print("Penelusuran SLL : ");
        traversal(head_3031);
        // data yang akan dicari
        int key_3031 = 30;
        System.out.print("cari data " + key_3031 + " = ");
        if (searchKey(head_3031, key_3031))
            System.out.println("ketemu");
        else
            System.out.println("tidak ada");
    }
}