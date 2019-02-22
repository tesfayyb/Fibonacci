import java.util.*;

public class Fibonacci {
public static ArrayList<Integer> fibonacciGenerator(int n) {
		
		ArrayList<Integer> fib = new ArrayList<Integer>();
		int x;
	
		
		for (int i = 0; i < n; i++) {
			
			if (i == 0 || i == 1) {
				x = i;
			} 
			
			else {
				x= fib.get(i - 1) + fib.get(i - 2);
			}
			
			fib.add(x);
		}
		return fib;
}

	public static void main(String[] args) {
		
		System.out.println(fibonacciGenerator(10));
	

	}


}
