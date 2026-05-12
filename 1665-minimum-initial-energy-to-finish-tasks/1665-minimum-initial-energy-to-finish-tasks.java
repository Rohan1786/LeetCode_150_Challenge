class Solution {
    public int minimumEffort(int[][] tasks) {
    Arrays.sort(tasks, (a, b)->(b[1]-b[0])-(a[1]-a[0]));
    int currentEnergy = 0;
    int initialEnergy =0;

      for(int arr[]:tasks){
        int actual = arr[0];
        int minimum = arr[1];
        if(currentEnergy < minimum){
            initialEnergy +=(minimum - currentEnergy);
            currentEnergy=minimum;
        }
        currentEnergy-=actual;
      }
   return initialEnergy;
      
    }
}