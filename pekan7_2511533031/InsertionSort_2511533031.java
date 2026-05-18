package pekan7_2511533031;

public class InsertionSort_2511533031 {
	public static void insertionSort(int[] arr_3031) {
		int n_3031 = arr_3031.length;
		for (int i_3031 = 1; i_3031 < n_3031; i_3031++) {
			int key_3031 = arr_3031[i_3031];
			int j_3031 = i_3031 - 1;
			while (j_3031 >= 0 && arr_3031 [j_3031] > key_3031) {
				arr_3031[j_3031 + 1] =arr_3031[j_3031];
				j_3031--;
			}
			arr_3031[j_3031 + 1] = key_3031;
		}
	}
	public static void main(String[] args) {
		int arr_3031[] = { 23, 78, 45, 8, 32, 56, 1 };
		int n_3031 = arr_3031.length;
		System.out.printf("array yang belum terurut:\n");
		for (int i_3031 = 0; i_3031 < n_3031; i_3031++)
			System.out.print(arr_3031[i_3031] + " ");
		System.out.println("");
		insertionSort(arr_3031);
		System.out.printf("array yang terurut:\n");
		for (int i_3031 = 0; i_3031 < n_3031; i_3031++)
			System.out.print(arr_3031[i_3031] + " ");
		System.out.println("");
		
	}
}
