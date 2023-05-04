class Solution {
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        Queue<Integer> rq = new LinkedList<>();
        Queue<Integer> dq = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                rq.add(i);
            } else {
                dq.add(i);
            }
        }
        while (!rq.isEmpty() && !dq.isEmpty()) {
            int r = rq.poll();
            int d = dq.poll();
            if (d < r) {
                dq.add(d + n);
            } else {
                rq.add(r + n);
            }
        }
        return rq.isEmpty() ? "Dire" : "Radiant";
    }
}