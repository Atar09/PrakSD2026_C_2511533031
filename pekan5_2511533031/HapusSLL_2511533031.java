package pekan5_2511533031;

public class HapusSLL_2511533031 {
	// fungsi untuk menghapus head
	public static NodeSLL_2511533031 deleteHead(NodeSLL_2511533031 head_3031) {
		// jika SLL kosong
		if (head_3031 == null)
			return null;
		// pindahkan head ke node berikutnya
		head_3031 = head_3031.next_3031;
		// Return head baru
		return head_3031; }
		// fungsi menghapus node terakhir SLL
		public static NodeSLL_2511533031 removeLastNode (NodeSLL_2511533031 head_3031) {
			//jika list kosong, return null
			if (head_3031 == null) {
				return null;
			}
			//jika list satu node, hapus node dan return null
			if (head_3031.next_3031 == null) {
				return null;
			}
			//temukan node terakhir ke dua
			NodeSLL_2511533031 secondLast = head_3031;
			while  (secondLast.next_3031.next_3031 != null) {
				secondLast = secondLast.next_3031;
			}
			// hapus node terakhir
			secondLast.next_3031 = null;
			return head_3031; }
		// fungsi menghapus node di posisi tertentu
		public static NodeSLL_2511533031 deleteNode(NodeSLL_2511533031 head_3031, int position_3031) {
		    NodeSLL_2511533031 temp_3031 = head_3031;
		    NodeSLL_2511533031 prev_3031 = null;
		    // jika linked list null
		    if (temp_3031 == null)
		        return head_3031;
		    // kasus 1: head dihapus
		    if (position_3031 == 1) {
		        head_3031 = temp_3031.next_3031;
		        return head_3031;
		    }
		    // kasus 2: menghapus node di tengah
		    // telusuri ke node yang dihapus
		    for (int i = 1; temp_3031 != null && i < position_3031; i++) {
		        prev_3031 = temp_3031;
		        temp_3031 = temp_3031.next_3031;
		    }
		    // jika ditemukan, hapus node
		    if (temp_3031 != null) {
		        prev_3031.next_3031 = temp_3031.next_3031;
		    } else {
		        System.out.println("Data tidak ada");
		    }
		    return head_3031;
		}
		// fungsi mencetak SLL
		public static void printList (NodeSLL_2511533031 head_3031) {
			NodeSLL_2511533031 curr_3031 = head_3031;
			while (curr_3031.next_3031 != null) {
				System.out.print(curr_3031.data_3031+"-->");
				curr_3031 = curr_3031.next_3031;
				if (curr_3031.next_3031 == null) {
					System.out.print(curr_3031.data_3031);
					System.out.println(); 
				}
			}
		}
		//kelas main
		public static void main(String[] args) {
			// buat SLL 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
			NodeSLL_2511533031 head_3031 = new NodeSLL_2511533031(1);
			head_3031.next_3031 = new NodeSLL_2511533031(2);
			head_3031.next_3031.next_3031 = new NodeSLL_2511533031(3);
			head_3031.next_3031.next_3031.next_3031 = new NodeSLL_2511533031(4);
			head_3031.next_3031.next_3031.next_3031.next_3031 = new NodeSLL_2511533031(5);
			head_3031.next_3031.next_3031.next_3031.next_3031.next_3031 = new NodeSLL_2511533031(6);
			//cetak list awal
			System.out.println("list awal: ");
			printList(head_3031);
			//hapus head
			head_3031 = deleteHead(head_3031);
			System.out.println("List setelah head dhapus: ");
			printList(head_3031);
			//hapus node terakhir
			head_3031 = removeLastNode(head_3031);
			printList(head_3031);
			// Deleting node at position 2
			int position_3031 = 2;
			head_3031 = deleteNode(head_3031, position_3031);
			//print list after deletion
			System.out.println("List setelah posisi 2 dihapus: ");
			printList(head_3031);
		}
}
