package patterns;

public class diff_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int n=5;
		
		for(int row=0;row<(n*2);row++)
		{
			if(row<=n)
			{
				for(int col=0;col<row;col++)
				{
					System.out.print("* ");
				}
			}
			else
			{
				for(int col=0;col<(2*n-row);col++)
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	
	}

}
