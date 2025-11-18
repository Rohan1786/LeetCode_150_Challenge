/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let freq={}
    for(let i=0; i<nums.length; i++){
        let complement= target-nums[i];
        // if (freq.hasOwnProperty(complement)){
            if(complement in freq){
            return  [freq[complement], i];
        }
        freq[nums[i]]=i
    }
    return []
};