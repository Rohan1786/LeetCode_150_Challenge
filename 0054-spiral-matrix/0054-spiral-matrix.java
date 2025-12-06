class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int left=0, top=0;
        int bottom = n-1, right=m-1;
       List<Integer> list = new ArrayList<>();
      while (left <= right && top <= bottom)
 {
            for(int i=left; i<=right; i++){
              list.add(matrix[top][i]);
            }
            top+=1;
            for(int i=top; i<=bottom; i++){
                list.add(matrix[i][right]);
            }
            right-=1;        
        if(top<=bottom){
            for(int i=right; i>=left; i--){
                list.add(matrix[bottom][i]);
            }
            bottom-=1;
           }
        if(left<=right){
            for(int i=bottom; i>=top; i--){
                list.add(matrix[i][left]);
            }
            left+=1;
           }
       }
       return list;
    }
}