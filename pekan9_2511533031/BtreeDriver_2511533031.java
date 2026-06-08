package pekan9_2511533031;

public class BtreeDriver_2511533031 {
	public static void main(String[] args) {
		// membuat pohon
	BTree_2511533031 tree_3031 = new BTree_2511533031();
	System.out.print("Jumlah Simpul awal pohon: ");
	System.out.println(tree_3031.countNodes_3031());
	// menambahkan simpul data 1
	Node_2511533031 root_3031 = new Node_2511533031(1);
	// menjadikan simpul 1 sebagai root
	tree_3031.setRoot_3031(root_3031);
	System.out.println("Jumlah simpul jika hanya ada root");
	System.out.println(tree_3031.countNodes_3031());
	Node_2511533031 node2_3031 = new Node_2511533031(2);
	Node_2511533031 node3_3031 = new Node_2511533031(3);
	Node_2511533031 node4_3031 = new Node_2511533031(4);
	Node_2511533031 node5_3031 = new Node_2511533031(5);
	Node_2511533031 node6_3031 = new Node_2511533031(6);
	Node_2511533031 node7_3031 = new Node_2511533031(7);
	Node_2511533031 node8_3031 = new Node_2511533031(8);
	Node_2511533031 node9_3031 = new Node_2511533031(9);
	root_3031.setLeft_3031(node2_3031);
	node2_3031.setLeft_3031(node4_3031);
	node2_3031.setRight_3031(node5_3031);
	node4_3031.setRight_3031(node8_3031);
	root_3031.setRight_3031(node3_3031);
	node3_3031.setLeft_3031(node6_3031);
	node3_3031.setRight_3031(node7_3031);
	node6_3031.setLeft_3031(node9_3031);
	// set root_3031
	tree_3031.setCurrent_3031(tree_3031.getRoot_3031());
	System.out.println("menampilkan simpul terakhir:");
	System.out.println(tree_3031.getCurrent_3031().getData_3031());
	System.out.println("Jumlah simpul; setelah simpul 7 ditambahkan");
	System.out.println(tree_3031.countNodes_3031());
	System.out.println("InOrder: ");
	tree_3031.printInorder_3031();
	System.out.println("\nPreorder: ");
	tree_3031.printInorder_3031();
	System.out.println("\nPostorder: ");
	tree_3031.printPostOrder_3031();
	System.out.println("\nMenampilkan simpul dalam bentuk pohon");
	tree_3031.print_3031();
	}
}