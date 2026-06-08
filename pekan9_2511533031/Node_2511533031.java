package pekan9_2511533031;

public class Node_2511533031 {
	int data_3031;
	Node_2511533031 left_3031;
	Node_2511533031 right_3031;
	public Node_2511533031(int data_3031) {
		this.data_3031 = data_3031;
		left_3031 = null;
		right_3031 = null;
	}
	public void setLeft_3031(Node_2511533031 node_3031) {
		if (left_3031 == null)
			left_3031 = node_3031;
	}
	public void setRight_3031(Node_2511533031 node_3031) {
		if (right_3031 == null)
			right_3031 = node_3031;
	}
	public Node_2511533031 getLeft_3031() {
		return left_3031;
	}
	public Node_2511533031 getRight_3031() {
		return right_3031;
	}
	public int getData_3031() {
		return data_3031;
	}
	public void setData_3031() {
		this.data_3031 = data_3031;
	}
	void printPreorder_3031(Node_2511533031 node_3031) {
		if (node_3031 == null)
			return;
		System.out.println(node_3031.data_3031 + " ");
		printPreorder_3031(node_3031.left_3031);
		printPreorder_3031(node_3031.right_3031);
	}
	void printPostorder_3031(Node_2511533031 node_3031) {
		if (node_3031 == null)
			return;
		printPostorder_3031(node_3031.left_3031);
		printPostorder_3031(node_3031.right_3031);
		System.out.print(node_3031.data_3031 + " ");
	}
	void printInorder_3031(Node_2511533031 node_3031) {
		if (node_3031 == null)
			return;
		printInorder_3031(node_3031.left_3031);
		System.out.print(node_3031.data_3031 + " ");
		printInorder_3031(node_3031.right_3031);
	}
	public String print_3031 () {
		return this.print_3031 ("",true,"");
	}
	public String print_3031 (String prefix_3031, boolean isTail_3031, String sb_3031) {
		if  (right_3031 != null) {
			right_3031.print_3031 (prefix_3031 + (isTail_3031 ? "|  ": " "), false, sb_3031 );
		}
		System.out.println(prefix_3031 + (isTail_3031 ? "\\--" : "/--")+ data_3031);
		if (left_3031 != null) {
			left_3031.print_3031(prefix_3031 + (isTail_3031 ? " " : " | "), true, sb_3031);
		}
		return sb_3031;
	}
}