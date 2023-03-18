package patterns;

public class right_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int n=5;
		
		for(int row=0;row<n;row++)
		{
			for(int col=0;col<=(n-row-1);col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
}
