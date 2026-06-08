package pekan9_2511533031;

public class BTree_2511533031 {
    private Node_2511533031 root_3031;
    private Node_2511533031 currentNode_3031;
    public BTree_2511533031() {
        root_3031 = null;
    }
    public boolean search_3031(int data_3031) {
        return search_3031(root_3031, data_3031);
    }
    private boolean search_3031(Node_2511533031 node_3031, int data_3031) {
        if (node_3031.getData_3031() == data_3031)
            return true;
        if (node_3031.getLeft_3031() != null)
            if (search_3031(node_3031.getLeft_3031(), data_3031))
                return true;
        if (node_3031.getRight_3031() != null)
            if (search_3031(node_3031.getRight_3031(), data_3031))
                return true;
        return false;
    }
    public void printInorder_3031() {
        root_3031.printInorder_3031(root_3031);
    }
    public void printPreOrder_3031() {
        root_3031.printPostorder_3031(root_3031);
    }
    public void printPostOrder_3031() {
        root_3031.printPostorder_3031(root_3031);
    }
    public Node_2511533031 getRoot_3031() {
        return root_3031;
    }
    public boolean isEmpty_3031 () {
		return root_3031 == null;
	}
	public int countNodes_3031 () {
		return countNodes_3031 (root_3031);
	}
	private int countNodes_3031 (Node_2511533031 node_3031) {
		int count_3031 = 1;
		if (node_3031 == null) {
			return 0;
		} else {
			count_3031 += countNodes_3031 (node_3031.getLeft_3031());
			count_3031 += countNodes_3031 (node_3031.getRight_3031());
			return count_3031;
		}
	}
	public void print_3031 () {
		root_3031.print_3031();
	}
	public Node_2511533031 getCurrent_3031 () {
		return currentNode_3031;
	}
	public void setCurrent_3031 (Node_2511533031 node_3031) {
		this.currentNode_3031 = node_3031;
	}
	public void setRoot_3031 (Node_2511533031 root_3031) {
		this.root_3031 = root_3031;
	}
}

