class Solution {
    public int lastRemaining(int n) {
        int head = 1, step = 1;
        boolean dir = true; 
        while (n > 1) {
            if (dir)
                head += step;
            else
                head += n%2 == 0? 0 : step;
            step *= 2;
            n /= 2;
            dir =! dir;
        }
        return head;
    }
}