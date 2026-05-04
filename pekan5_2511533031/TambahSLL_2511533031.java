package pekan5_2511533031;

public class TambahSLL_2511533031 {
    public static NodeSLL_2511533031 insertAtFront(NodeSLL_2511533031 head_3031, int value_3031) {
        NodeSLL_2511533031 new_node_3031 = new NodeSLL_2511533031(value_3031);
        new_node_3031.next_3031 = head_3031;
        return new_node_3031;
    }
    // fungsi menambahkan node di akhir SLL
    public static NodeSLL_2511533031 insertAtEnd(NodeSLL_2511533031 head_3031, int value_3031) {
        // buat sebuah node dengan sebuah nilai
        NodeSLL_2511533031 newNode_3031 = new NodeSLL_2511533031(value_3031);
        // jika list kosong maka node jadi head
        if (head_3031 == null) {
            return newNode_3031;
        }
        // simpan head ke variabel sementara
        NodeSLL_2511533031 last_3031 = head_3031;
        // telusuri ke node akhir
        while (last_3031.next_3031 != null) {
            last_3031 = last_3031.next_3031;
        }
        // ubah pointer
        last_3031.next_3031 = newNode_3031;
        return head_3031;
    }
    static NodeSLL_2511533031 GetNode_3031(int data_3031) {
        return new NodeSLL_2511533031(data_3031);
    }
    static NodeSLL_2511533031 insertPos(NodeSLL_2511533031 headNode_3031, int position_3031, int value_3031) {
        NodeSLL_2511533031 head_3031 = headNode_3031;
        if (position_3031 < 1)
            System.out.print("Invalid position");
        if (position_3031 == 1) {
            NodeSLL_2511533031 new_node_3031 = new NodeSLL_2511533031(value_3031);
            new_node_3031.next_3031 = head_3031;
            return new_node_3031;
        } else {
            while (position_3031-- != 0) {
                if (position_3031 == 1) {
                    NodeSLL_2511533031 newNode_3031 = GetNode_3031(value_3031);
                    newNode_3031.next_3031 = headNode_3031.next_3031;
                    headNode_3031.next_3031 = newNode_3031;
                    break;
                }
                headNode_3031 = headNode_3031.next_3031;
            }
            if (position_3031 != 1)
                System.out.print("Posisi di luar jangkauan");   }
        return head_3031;
    }
    public static void printList(NodeSLL_2511533031 head_3031) {
        NodeSLL_2511533031 curr_3031 = head_3031;
        while (curr_3031.next_3031 != null) {
            System.out.print(curr_3031.data_3031 + "-->");
            curr_3031 = curr_3031.next_3031;
        }
        if (curr_3031.next_3031 == null) {
            System.out.print(curr_3031.data_3031);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // buat linked list 2->3->5->6
        NodeSLL_2511533031 head_3031 = new NodeSLL_2511533031(2);
        head_3031.next_3031 = new NodeSLL_2511533031(3);
        head_3031.next_3031.next_3031 = new NodeSLL_2511533031(5);
        head_3031.next_3031.next_3031.next_3031 = new NodeSLL_2511533031(6);

        // cetak list asli
        System.out.print("Senarai berantai awal:");
        printList(head_3031);

        // tambahkan node baru di depan
        System.out.print("tambah 1 simpul di depan: ");
        int data_3031 = 1;
        head_3031 = insertAtFront(head_3031, data_3031);

        // cetak update list
        printList(head_3031);

        // tambahkan node baru di belakang
        System.out.print("tambah 1 simpul di belakang: ");
        int data2_3031 = 7;
        head_3031 = insertAtEnd(head_3031, data2_3031);

        // cetak update list
        printList(head_3031);

        System.out.print("tambah 1 simpul ke data 4: ");
        int data3_3031 = 4;
        int pos_3031 = 4;
        head_3031 = insertPos(head_3031, pos_3031, data3_3031);

        // cetak update list
        printList(head_3031);
    }
}