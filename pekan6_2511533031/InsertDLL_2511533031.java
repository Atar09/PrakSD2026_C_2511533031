package pekan6_2511533031;

public class InsertDLL_2511533031 {
	//menambahkan node di awal DLL
	static NodeDLL_2511533031 insertBegin(NodeDLL_2511533031 head_3031, int data_3031) {
		// buat node baru
		NodeDLL_2511533031 new_node_3031 = new NodeDLL_2511533031(data_3031);
		// jadikan pointer nextnya head
		new_node_3031.next_3031 = head_3031;
		// jadikan pointer prev head ke new_node
		if (head_3031 !=  null) {
			head_3031.prev_3031 = new_node_3031;
		}
		return new_node_3031;
	}
	// fungsi menambahkan node di akhir
	public static NodeDLL_2511533031 insertEnd(NodeDLL_2511533031 head_3031, int newData_3031) {
		//buat node baru
		NodeDLL_2511533031 newNode_3031 = new NodeDLL_2511533031(newData_3031);
		// jika DLL null jadikan end
		if (head_3031 == null) {
			head_3031 = newNode_3031;
		}
		else {
			NodeDLL_2511533031 curr_3031 = head_3031;
			while (curr_3031.next_3031 != null) {
				curr_3031 = curr_3031.next_3031;
			}
			curr_3031.next_3031 = newNode_3031;
			newNode_3031.prev_3031 = curr_3031;
		}
		return head_3031;
	}
	// fungsi menambahkan node di posisis tertentu
	public static NodeDLL_2511533031 insertAtposition(NodeDLL_2511533031 head_3031, int pos_3031, int new_data_3031) {
		// buat node baru
		NodeDLL_2511533031 new_node_3031 = new NodeDLL_2511533031(new_data_3031);
		if (pos_3031 == 1) {
			new_node_3031.next_3031 = head_3031;
			if (head_3031 != null) {
				head_3031.prev_3031 = new_node_3031; }
			head_3031 = new_node_3031;
			return head_3031;
			}
			NodeDLL_2511533031 curr_3031 = head_3031;
			for (int i = 1; i < pos_3031 -1 && curr_3031 != null; ++i) {
				curr_3031 = curr_3031.next_3031; }
			if (curr_3031 == null) {
				System.out.println("Posisi tidak ada");
				return head_3031;
			}
			new_node_3031.prev_3031 = curr_3031;
			new_node_3031.next_3031 = curr_3031.next_3031;
			curr_3031.next_3031 = new_node_3031;
			if (new_node_3031.next_3031 != null) {
				new_node_3031.next_3031.prev_3031 = new_node_3031;
			}
			return head_3031;
		}
	
		public static void printList(NodeDLL_2511533031 head_3031) {
			NodeDLL_2511533031 curr_3031 = head_3031;
			while (curr_3031 != null) {
				System.out.print(curr_3031.data_3031 + " <-> ");
				curr_3031 = curr_3031.next_3031;
			}
			System.out.println();
		}
		public static void main(String[] args) {
		    // membuat dll 2 <-> 3 <-> 5
			NodeDLL_2511533031 head_3031 = new NodeDLL_2511533031(2);
		    head_3031.next_3031 = new NodeDLL_2511533031(3);
		    head_3031.next_3031.prev_3031 = head_3031;
		    head_3031.next_3031.next_3031 = new NodeDLL_2511533031(5);
		    head_3031.next_3031.next_3031.prev_3031 = head_3031.next_3031;
		    
		    //cetak DLL awal
		    System.out.print("DLL Awal: ");
		    printList(head_3031);
		    
		    // tambah 1 di awal
		    head_3031 = insertBegin(head_3031, 1);
		    System.out.print(
		            "simpul 1 ditambah di awal: ");
		    printList(head_3031);
		    
		    // tambah 6 di akhir
		    System.out.print(
		            "simpul 6 ditambah di akhir: ");
		    int data_3031 = 6;
		    head_3031 = insertEnd(head_3031, data_3031);
		    printList(head_3031);
		    
		    // menambah node 4 di posisi 4
		    System.out.print("tambah node 4 di posisi 4: ");
		    int data2_3031 = 4;
		    int pos_3031 = 4;
		    head_3031 = insertAtposition(head_3031, pos_3031, data2_3031); 
		    printList(head_3031);
		}
}
	

