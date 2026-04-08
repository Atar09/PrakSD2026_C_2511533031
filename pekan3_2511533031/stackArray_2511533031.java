package pekan3_2511533031;

public class stackArray_2511533031 {
	static final int MAX_3031 = 1000;
	int top_3031;
	int a[] = new int [MAX_3031];
	boolean isEmpty_2511533031()
	{
		return (top_3031 < 0);
	}
	stackArray_2511533031()
	{
		top_3031 = -1;
	}
	boolean push_3031(int x)
	{
		if (top_3031 >= (MAX_3031 - 1)) {
			System.out.println(x + " dimasukkan dalam stack");
			return false;
		}
		else {
			a[++top_3031] = x;
			System.out.println(x + " dimasukkan dalam stack");
			return true;
			}
		}
	
	int pop_3031()
	{
		if (top_3031 < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a[top_3031--];
			return x;
		}
	}
	int peak_3031()
	{
		if (top_3031 < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a[top_3031];
			return x;
		}
	}
	void print_3031() {
	for (int i = top_3031;i>-1;i--) {
		System.out.print(" "+ a[i]);
	}
		
	}
}
