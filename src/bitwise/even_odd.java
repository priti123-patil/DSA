package bitwise;

public class even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n=67;
         
         if( ( n & 1 ) == 0)
         {
        	 System.out.println("Number is even");
         }
         else
         {
        	 System.out.println("Number is odd");
         }
	}

}
