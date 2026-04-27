package pekan4_2511533031;
public class QueueArrayDriver_2511533031 {

	public static void main(String[] args) {
		QueueArray_2511533031 queue_3031 = new QueueArray_2511533031(1000);
		queue_3031.enqueue_3031(10);
		queue_3031.enqueue_3031(20);
		queue_3031.enqueue_3031(30);
		queue_3031.enqueue_3031(40);
		System.out.println("Item di depan "+ queue_3031.front_3031());
		System.out.println("Item paling belakang "+ queue_3031.rear_3031());
		System.out.println("tampilan queue");
		queue_3031.display_3031();
		System.out.println();
		System.out.println(queue_3031.dequeue_3031() + " dihapus dari queue");
		System.out.println("Item di depan: "+ queue_3031.front_3031());
		System.out.println("Item paling belakang: "+ queue_3031.rear_3031());
		System.out.println("tampilan queue setelah satu data dihapus");
		queue_3031.display_3031();
	}
}
