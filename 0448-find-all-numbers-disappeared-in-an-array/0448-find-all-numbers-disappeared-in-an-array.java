class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        boolean flag = false;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i<arr.length; i++){
            while(arr[i] != i+1 && arr[i] != arr[arr[i] - 1]){
                int j = arr[i]-1;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        for(int i=0; i<arr.length;i++){
            if(arr[i] != i+1){
                ans.add(i+1);
            }
        }
        return ans;
    }
}