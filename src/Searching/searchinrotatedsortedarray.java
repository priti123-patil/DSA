package Searching;

public class searchinrotatedsortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]=new int[] {11, 15, 26, 38, 9, 10};
    int sum=45;
    boolean flag=false;
    for(int i=0;i<5;i++)
    {
    	for(int j=0;j<5;j++)
    	{
    		if(arr[i]+arr[j]==sum)
    		{
    			flag=true;
    		}
    		
    	}
    	
    }
    System.out.println(flag);
	}

}
