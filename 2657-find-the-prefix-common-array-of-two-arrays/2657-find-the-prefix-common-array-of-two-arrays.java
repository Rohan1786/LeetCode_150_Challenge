class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        // int n=A.length;
        // int[]count=new int[n];
        
        // for(int i=0;i<n;i++){
        //     int cnt=0;
        //     for(int j=0;j<i+1;j++){
        //            for(int k=0;k<i+1;k++){
        //            if(A[j]==B[k]){
        //             cnt++;
        //             break;
        //            }
        //            }  
        //     }
        //     count[i]=cnt;
        // }

        //avaerage approach
         int n = A.length;

        int[] result = new int[n];

        boolean[] isPresentA = new boolean[n+1];
        boolean[] isPresentB = new boolean[n+1];

        for(int i = 0; i < n; i++) {
            isPresentA[A[i]] = true;
            isPresentB[B[i]] = true;

            int count = 0;
            for(int num = 1; num <= n; num++) {
                if(isPresentA[num] == true && isPresentB[num] == true) {
                    count++;
                }
            }

            result[i] = count;
        }

        return result;
    
    }}



//best optimal approach
// Map<Integer,Integer>map=new HashMap<>();
//   int cnt=0;
// for(int i=0;i<n;i++){
  
//     map.put(A[i],map.getOrDefault(A[i],0)+1);
//    if(map.get(A[i])==2){
//     cnt++;
//    }
//    map.put(B[i],map.getOrDefault(B[i],0)+1);
//    if(map.get(B[i])==2){
//     cnt++;
//    }
//    count[i]=cnt;
// }
//   return count;
//     }
// }