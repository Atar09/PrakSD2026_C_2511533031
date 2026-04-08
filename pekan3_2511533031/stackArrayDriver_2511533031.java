package pekan3_2511533031;
import java.util.*;
public class stackArrayDriver_2511533031 {

	public static void main(String[] args) {
		stackArray_2511533031 s= new stackArray_2511533031();
		s.push_3031(10);
		s.push_3031(20);
		s.push_3031(30);
		System.out.println(s.pop_3031() + " dikeluarkan dari stack");
		System.out.println("Elemen teratas adalah :" + s.peak_3031());
		System.out.print("Element pada stack :");
		s.print_3031();
		
	}

}
