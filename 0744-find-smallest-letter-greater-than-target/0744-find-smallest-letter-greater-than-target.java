class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0;
		int h = letters.length-1;
		int mid = 0;
		while(l <= h) {
			mid = l+(h-l)/2;
            if(target < letters[mid])
				h = mid - 1;
			else
				l = mid + 1;
		}
		return letters[l %  letters.length];
    } 
}