package pekan7_2511533031;

public class selectionSort_2511533031 {
    public static void selectionSort_3031(int[] arr_3031) {
        int n_3031 = arr_3031.length;
        for (int i_3031 = 0; i_3031 < n_3031; i_3031++) {
            int minIndex_3031 = i_3031;
            for (int j_3031 = i_3031 + 1; j_3031 < n_3031; j_3031++) {
                if (arr_3031[j_3031] < arr_3031[minIndex_3031]) {
                    minIndex_3031 = j_3031;
                }
            }
            int temp_3031 = arr_3031[i_3031];
            arr_3031[i_3031] = arr_3031[minIndex_3031];
            arr_3031[minIndex_3031] = temp_3031;
        }
    }
    public static void main(String[] args) {
        int arr_3031[] = {23, 78, 45, 8, 32, 56, 1};
        int n_3031 = arr_3031.length;
        System.out.printf("array yang belum terurut:\n");
        for (int i_3031 = 0; i_3031 < n_3031; i_3031++) 
            System.out.print(arr_3031[i_3031] + " ");
        System.out.println("");
        selectionSort_3031(arr_3031);
        System.out.printf("array yang terurut:\n");
        for (int i_3031 = 0; i_3031 < n_3031; i_3031++) 
            System.out.print(arr_3031[i_3031] + " ");
        System.out.println("");
    }
}
