// Demonstrates the Collatz conjecture (no modes yet).
public class Collatz {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]); // highest seed
		String mode = args [1];
		

        // For each seed from 1 to N:
        for (int i = 1; i <= N; i++) {
             int steps = 1;
             int current = i;
			 if (mode.equals("v"))
			 {
            System.out.print(current); // Print the starting number
			 }
			// here ill put the while loop:
            while (current != 1) {
                if (current % 2 == 0) {
                    current = current / 2;
                } 
				else 
				{
                    current = current * 3 + 1;
                }
				if (mode.equals("v"))
				{
                System.out.print(" " + current);
				}
				steps ++;
                 }
		 if (mode.equals("v"))
		        {
			System.out.print( " (" + steps + ")");
			System.out.println();
				}
			
        }
		System.out.println("Every one of the first " + N +  " hailstone sequences reached 1.");
    }
}
// javac Collatz.java
// java Collatz 8