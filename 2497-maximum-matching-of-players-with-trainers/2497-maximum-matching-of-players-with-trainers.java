class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int match = 0;
        Arrays.sort(players);
        Arrays.sort(trainers);
         int n = players.length;
         int m = trainers.length;
         int i =0;
         int j =0;
        while(i<n && j<m){
            if(players[i]>trainers[j]){
                j++;
            }
                else if(players[i]<=trainers[j]){
                    match++;
                    i++;
                    j++;
                }
            }
         
         return match;
    }
}