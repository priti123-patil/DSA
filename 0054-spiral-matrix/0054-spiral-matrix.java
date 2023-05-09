class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res=new ArrayList<>();   
        int r = matrix.length, c = matrix[0].length;
        int sRow = 0 , sCol = 0 , eRow = r-1, eCol = c-1;
        int count = 0;
        int total = r*c;
        while(count < total) {
        //Print starting row
        for(int i = sCol; count < total && i <= eCol; i++) {
            res.add(matrix[sRow][i]);
            count++;
        }
        sRow++;
        //print ending column
        for(int i = sRow; count < total && i <= eRow; i++) {
            res.add(matrix[i][eCol]);
            count++;
        }
        eCol--;
        //print ending row
        for(int i = eCol; count < total && i >= sCol; i--) {
            res.add(matrix[eRow][i]);
            count++;
        }
        eRow--;
        //print starting column
        for(int i = eRow; count < total && i >= sRow; i--) {
            res.add(matrix[i][sCol]);
            count++;
        }
        sCol++; 
        }
        return res;
    }
}