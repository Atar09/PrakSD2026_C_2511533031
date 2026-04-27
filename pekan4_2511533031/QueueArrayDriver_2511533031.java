package pekan4_2511533031;
public class QueueArrayDriver_2511533031 {

	public static void main(String[] args) {
		QueueArray_2511533031 queue = new QueueArray_2511533031(1000);
		queue.enqueue_3031(10);
		queue.enqueue_3031(20);
		queue.enqueue_3031(30);
		queue.enqueue_3031(40);
		System.out.println("Item di depan "+ queue.front_3031());
		System.out.println("Item paling belakang "+ queue.rear_3031());
		System.out.println("tampilan queue");
		queue.display_3031();
		System.out.println();
		System.out.println(queue.dequeue_3031() + " dihapus dari queue");
		System.out.println("Item di depan: "+ queue.front_3031());
		System.out.println("Item paling belakang: "+ queue.rear_3031());
		System.out.println("tampilan queue setelah satu data dihapus");
		queue.display_3031();
	}
}
