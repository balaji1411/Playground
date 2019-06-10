import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in  = new Scanner(System.in);
	    int n = in.nextInt();
        int va1 = n;
	    for(int curr_row = 1; curr_row <= n; curr_row++)
        {
          for(int curr_col = va1; curr_col >=1; curr_col--)
          {
            System.out.print(curr_col);
          }
          va1--;
          System.out.println();
        }
    }
}
	 
