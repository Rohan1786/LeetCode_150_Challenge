class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        
        long total = 0;
        for (int x : nums) total += x;
        
        int need = (int)(total % p);
        if (need == 0) return 0;  
        long prefix = 0; 
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        
        int ans = n;
        
        for (int i = 0; i < n; i++) {
            prefix = (prefix + nums[i]) % p; 
            int target = (int)((prefix - need + p) % p);
            
            if (map.containsKey(target)) {
                int len = i - map.get(target);
                ans = Math.min(ans, len);
            } 
            map.put((int)prefix, i);
        }
        
        return ans == n ? -1 : ans;
    }
}
