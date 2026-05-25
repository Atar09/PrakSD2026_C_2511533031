package pekan8_2511533031;

public class QuickSort_2511533031 {
	static void swap(int[] arr_3031, int i_3031, int j_3031) {
		int temp_3031 = arr_3031[i_3031];
		arr_3031[i_3031] = arr_3031[j_3031];
		arr_3031[j_3031] = temp_3031;
	}
	// metode tambahan untuk mengatur pivot menggunankan median-of-Three
	static void mediaofThree_3031(int[] arr_3031, int low_3031, int high_3031) {
		int mid_3031 = low_3031 + (high_3031 - low_3031) / 2;
		
		// urutkan elemen low, mid, high
		if (arr_3031[low_3031] > arr_3031[mid_3031]) {
			swap(arr_3031, low_3031, mid_3031);
		}
		if (arr_3031[low_3031] > arr_3031[high_3031]) {
			swap(arr_3031, low_3031, high_3031);
		}
		if (arr_3031[mid_3031] > arr_3031[high_3031]) {
			swap(arr_3031, mid_3031, high_3031);
		}
		swap(arr_3031, mid_3031, high_3031);
	}
	static int partition_3031(int[] arr_3031, int low_3031, int high_3031) {
		
		//panggil fungsi medianofThree sebelum menentukan pivot
		mediaofThree_3031(arr_3031, low_3031, high_3031);
		
		int pivot_3031 = arr_3031[high_3031]; // sekarang arr[high] sudah berisi nilai median
		int i_3031 = (low_3031 - 1);
		
		for (int j_3031 = low_3031; j_3031 <= high_3031 - 1; j_3031++) {
			// jika elemen saat ini lebih kecil dari atau sama dengan pivot
			if (arr_3031[j_3031] < pivot_3031) {
				// increment indeks elemen yang lebih kecil
				i_3031++;
				swap(arr_3031, i_3031, j_3031);
			}
		}
		swap(arr_3031, i_3031 + 1, high_3031);
		return (i_3031 + 1);
	}
	static void quickSort_3031(int[] arr_3031, int low_3031, int high_3031) {
		if (low_3031 < high_3031) {
			int pi_3031 = partition_3031(arr_3031, low_3031, high_3031);
			quickSort_3031(arr_3031, low_3031, pi_3031 - 1);
			quickSort_3031(arr_3031, pi_3031 + 1, high_3031);
		}
	}
	public static void printArr_3031(int[] arr_3031) {
		for (int i_3031 = 0; i_3031 < arr_3031.length; i_3031++) {
			System.out.print(arr_3031[i_3031] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr_3031 = {10, 7, 8, 9, 1, 5 };
		int N_3031 = arr_3031.length;
		System.out.print("Data sebelum diurutkan: ");
		printArr_3031(arr_3031);
		
		quickSort_3031(arr_3031, 0, N_3031 - 1);
		
		System.out.print("data terurut quicksort: ");
		printArr_3031(arr_3031);
	}

}
