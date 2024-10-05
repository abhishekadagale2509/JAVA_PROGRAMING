import java.util.*;

public class swappingg
{
  public static void main (String args[])
  {
	Scanner sc = new Scanner (System.in);
	int a, b;
	  System.out.printf ("entere two val");
	  a = sc.nextInt ();
	  b = sc.nextInt ();
	  System.out.printf ("before swap ");
                System.out.printf("%d \t %d", a, b);
	  a = a + b;
	  b = a - b;
	  a = a - b;
	  System.out.printf ("after swapping");
        System.out.printf(" %d %d", a, b);

  }
}
