package pekan2_2511533031;

import java.util.ArrayList;
public class ArrrayList1_2511533031 {
public static void main(String[] args) {
// Size of the Arraylist
	int n = 5;
// Declaring the arraylist with the initial size n
	ArrayList<Integer> arrli = new ArrayList<Integer>(n);
// aspending new elementz ar the list
for (int i = 1; i <= n; i++)
	arrli.add(i);
// printing elements
System.out.println(arrli);
//remove element at index 3
arrli.remove(3);
// Displaying the arraylist
//after deletion
System.out.println(arrli);
// Printing elements one by one
for (int i = 0; i < arrli.size(); i++)
	System.out.println(arrli.get(i) + " ");


}


}
