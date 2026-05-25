package pekan8_2511533031;

public class MergeSort_2511533031 {
	void merge_3031(int arr_3031[], int l_3031, int m_3031, int r_3031) {
		// find sizes of two subarrays to be maarged
		int n1_3031 = m_3031 - l_3031 + 1;
		int n2_3031 = r_3031 - m_3031;
		// create temp arrays
		int L_3031[] = new int[n1_3031];
		int R_3031[] = new int[n2_3031];
		// copy data to temp arrays
		for (int i_3031 = 0; i_3031 < n1_3031; ++i_3031)
			L_3031[i_3031] = arr_3031[l_3031 + i_3031 ];
		for (int j_3031 = 0; j_3031 < n2_3031; ++j_3031)
			R_3031[j_3031] = arr_3031[m_3031 + 1 + j_3031];
		int i_3031 = 0, j_3031 = 0;
		// intial index of merged subarray array
		int k_3031 = l_3031;
		while (i_3031 <n1_3031 && j_3031 < n2_3031) {
			if (L_3031[i_3031] <= R_3031[j_3031]) {
				arr_3031[k_3031] = L_3031[i_3031];
				i_3031++;
			} else {
				arr_3031[k_3031] = R_3031[j_3031];
				j_3031++;
			}
			k_3031++;
		}
		// copy remaining elemen of L_3031[] if any
		while (i_3031 < n1_3031) {
			arr_3031[k_3031] = L_3031[i_3031];
			i_3031++;
			k_3031++;
		}
		// copy remining elements of R_3031[] if any
		while (j_3031 < n2_3031) {
			arr_3031[k_3031] = R_3031[j_3031];
			j_3031++;
			k_3031++;
		}
	}
	void sort_3031(int arr_3031[], int l_3031, int r_3031) {
		if (l_3031 < r_3031) {
			// find the middle points
			int m_3031 = (l_3031 + r_3031) / 2;
			// sort first and second halves
			sort_3031 (arr_3031, l_3031, m_3031);
			sort_3031 (arr_3031, m_3031 + 1, r_3031);
			// Merge the sorted halves
			merge_3031(arr_3031, l_3031, m_3031, r_3031);
		}
	}
	// A utility function to print array of size n
	static void printArray_3031(int arr_3031[]) {
		int n_3031 = arr_3031.length;
		for (int i_3031 = 0; i_3031 < n_3031; ++i_3031)
			System.out.print(arr_3031[i_3031] + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		int arr_3031[] = { 12, 11, 13, 5, 6, 7};
		System.out.println("sebelum terurut");
		printArray_3031(arr_3031);
		MergeSort_2511533031 ob_3031 = new MergeSort_2511533031();
		ob_3031.sort_3031(arr_3031, 0, arr_3031.length - 1);
		System.out.println("\nSesudah terurut menggunakan  merge Sort");
		printArray_3031(arr_3031);
	}

}
