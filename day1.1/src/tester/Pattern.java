package tester;

/*
 * 3 2 1
 * 3 2
 * 3
 * */
public class Pattern {
	public static void main(String[] args) {
		printPattern(3);
	}
	private static void printPattern(int num) {
		for(int i=num; i>0 ;i--) {
			for(int j = num; j >num-i; j--) {
				System.out.print(j+ " ");	
			}
			System.out.println();
			 
		}
	}
}
