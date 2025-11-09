// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int num = Integer.parseInt (args[0]);
		double denominator = -1;
		double ratio;
		double pi = 0;

		for (int i = 0; i < num; i++)
		{
			denominator = denominator + 2; 
			ratio = 1 / denominator;
			if (i%2==0)
			{
               pi = pi + ratio;
			}
			else 
			{
				pi = pi - ratio;
			}
		}
        pi = pi*4;
		System.out.println(pi);
	}
}
