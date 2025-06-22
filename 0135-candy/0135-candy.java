class Solution {
    public int candy(int[] ratings) {
        // int n = ratings.length;
        // int[] candy = new int[n];
        // Arrays.fill(candy, 1);

        // for (int i = 1; i < n; i++) {
        //     if (ratings[i] > ratings[i - 1]) {
        //         candy[i] = candy[i - 1] + 1; 
        //     }
        // }

        // for (int i = n - 2; i >= 0; i--) {
        //     if (ratings[i] > ratings[i + 1]) {
        //         candy[i] = Math.max(candy[i], candy[i + 1] + 1); 
        //     }
        // }

        // int totalCandies = 0;
        // for (int c : candy) {
        //     totalCandies += c;
        // }

        // return totalCandies;
        int n = ratings.length;
        int[] count = new int[n];
        Arrays.fill(count,1);
        for(int i =1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
         count[i]=Math.max(count[i],count[i-1]+1);
            } 
        }
       
        for(int i =n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
            count[i] = Math.max(count[i],count[i+1]+1);
            } 
        }
        int result =0;
        for(int i =0;i<n;i++){
           
           result+=count[i];
        }
        return result;
    }
}