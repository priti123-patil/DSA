package bitwise;

public class count_set_bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=30;
        
        System.out.println(Integer.toBinaryString(n));
	    
        //it will calculate the number of set bits in a binary representation of a number
        int setbits = 0;
        
        int count = 0;
        
        while(n > 0)
        {
        	count++;
        	
        	n= n & (n-1);
        }
        
        System.out.println(count);
	}

}
