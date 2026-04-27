package pekan4_2511533031;
public class QueueArray_2511533031 {
	int front_3031, rear_3031, size_3031;
	int capacity_3031;
	int array_3031[];
	
	public QueueArray_2511533031(int capacity) {
		this.capacity_3031 = capacity;
		front_3031 = this.size_3031 = 0;
		rear_3031 = capacity -1;
		array_3031 = new int[this.capacity_3031];
	}
	
	boolean isFull_3031(QueueArray_2511533031 queue) {
		return (queue.size_3031 == queue.capacity_3031);
	}
	
	boolean isEmpty_3031(QueueArray_2511533031 queue) {
		return (queue.size_3031 == 0);
	}
	
	void enqueue_3031(int item) {
		if (isFull_3031(this))
		return;
		this.rear_3031 = (this.rear_3031 + 1) % this.capacity_3031;
		this.array_3031[this.rear_3031] = item;
		this.size_3031 = this.size_3031 + 1;
		System.out.println(item + " enqueued to queue");
	}
	
	int dequeue_3031() {
		if (isEmpty_3031(this))
			return Integer.MIN_VALUE;
		int item = this.array_3031[this.front_3031];
		this.front_3031 = (this.front_3031 + 1) % this.capacity_3031;
		this.size_3031 = this.size_3031 - 1;
		return item;
	}
	int front_3031() {
		if (isEmpty_3031(this))
			return Integer.MIN_VALUE;
		
		return this.array_3031[this.front_3031];
	}
	int rear_3031() {
		if (isEmpty_3031(this))
			return Integer.MIN_VALUE;
		
		return this.array_3031[this.rear_3031];
	}
		//mencetak elemen antrian
	void display_3031() {
		int i;
		if (front_3031 == rear_3031) {
			System.out.println("\nAntrian Kosong\n");
			return;
		}
		//kunjungi dari belakang dan cetak
		for (i = front_3031; i < rear_3031; i++) {
			System.out.printf(" %d <-- ", array_3031[i]);
		}
		return;
	}
}
