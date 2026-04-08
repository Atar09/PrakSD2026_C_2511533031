package pekan3_2511533031;

import java.util.*;

class Siswa_2511533031 {
	String nama;
	int nim;
	
	public Siswa_2511533031(String nama, int nim) {
		this.nama = nama;
		this.nim = nim;
	}
	
	@Override
	public String toString() {
		return "Nim: " + nim + ", Nama: " + nama;
	}
}
public class SiswaStack_2511533031 {
	private ArrayList<Siswa_2511533031> stack;
	
	public SiswaStack_2511533031() {
		stack = new ArrayList<>();
	}
	
	public void push(Siswa_2511533031 mhs) {
		stack.add(mhs);
	}
	public Siswa_2511533031 pop() {
		if (!isEmpty_3031()) {
			return stack.remove(stack.size() - 1);
		}
		return null;
	}
	
	public Siswa_2511533031 peek() {
		if (!isEmpty_3031()) {
			return stack.get(stack.size() - 1);
	}
		return null;
	}
	
	public boolean isEmpty_3031() {
		return stack.isEmpty();
	}
	
	public void tamppilkanSiswa_3031() {
		for (int i = stack.size() - 1; i >=0; i--) {
			System.out.println(stack.get(i));
		}
	}
	public static void main(String[] args) {
		SiswaStack_2511533031 studentStack = new SiswaStack_2511533031();
		
		Siswa_2511533031 mhs1 = new Siswa_2511533031("Ali", 1);
		Siswa_2511533031 mhs2 = new Siswa_2511533031("Boby", 2);
		Siswa_2511533031 mhs3 = new Siswa_2511533031("Charles", 3);

		studentStack.push(mhs1);
		studentStack.push(mhs2);
		studentStack.push(mhs3);
		
		System.out.println("Siswa di dalam stack:");
		studentStack.tamppilkanSiswa_3031();
		
		System.out.println("siswa teratas " + studentStack.peek());
		System.out.println("mengeluarkan siswa teratas dari stack: " + studentStack.pop());
		System.out.println("daftar siswa setelah di pop :");
		studentStack.tamppilkanSiswa_3031();
	}
		
}