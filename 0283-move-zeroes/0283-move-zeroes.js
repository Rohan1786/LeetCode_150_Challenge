/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function(nums) {
    let index=0;
    for(let num of nums){
       if(num!==0){
        nums[index]=num;;
        index++;
       }
    }
    while(index<nums.length){
        nums[index]=0;
        index++;
    }
   return nums;
};