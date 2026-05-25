package pekan8_2511533031;

public class ShellSort_2511533031 {
	
	public static void shellSort_3031(int[] A_3031) {
		int n_3031 = A_3031.length;
		int gap_3031 = n_3031 / 2;
		while (gap_3031 > 0) {
			for (int i_3031 = gap_3031; i_3031 < n_3031; i_3031++) {
				int temp_3031 = A_3031[i_3031];
				int j_3031 = i_3031;
				while (j_3031 >= gap_3031 && A_3031 [j_3031 - gap_3031] > temp_3031) {
					A_3031[j_3031] = A_3031[j_3031 - gap_3031];
					j_3031 = j_3031 - gap_3031;
				}
				A_3031[j_3031] = temp_3031;
			}
			gap_3031 = gap_3031 / 2;
		}
	}

	public static void main(String[] args) {
		int[] data_3031 = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};
		
		System.out.print("Sebelum: ");
		printArray_3031(data_3031);
		
		shellSort_3031(data_3031);
		
		System.out.print("Sesudah (shell sort): ");
		printArray_3031(data_3031);
	}
	public static void printArray_3031(int[] arr_3031) {
		for (int i_3031 : arr_3031) System.out.print(i_3031 + " ");
		System.out.println();
	}
}
