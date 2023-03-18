package Searching;

public class CeilingOfaNumber {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        System.out.println(ceiling(arr,15));
        System.out.println(floor(arr,15));
    }
    //ceiling of a target is the smallest number greater than equal to target
    //in this example ceiling of 15 is 16 it is the next greater number
    //In ceiling we are returning start coz when target doesn't exist in s-e range
    //that means target is not there in arr so now s will become greater than end
    //and hence start will be the smallest number greater than target
    public static int ceiling(int[] arr , int target)
    {
        int s=0,e=arr.length-1;
        int mid=0;
        while(s<=e)
        {
            mid=s+(e-s) /2;
            if(arr[mid] == target)
            {
                return arr[mid];
            }
            else if(target < arr[mid])
            {
                e=mid-1;
            }
            else if(target > arr[mid])
            {
                s=mid+1;
            }
        }
        return arr[s];
    }
    //Floor of a target - greatest number less than or equal to target
    public static int floor(int[] arr,int target)
    {
        int s=0;
        int e=arr.length-1;
        int mid=0;
        while(s<=e)
        {
            mid=s+(e-s)/2;
            if(target < arr[mid])
            {
                e=mid-1;
            }
            else if(target > arr[mid])
            {
                s=mid+1;
            }
            else {
                return arr[e];
            }
        }
        return arr[e];
    }
}
