/**
 * @param {number[]} nums
 * @return {number}
 */
var minimumOperations = function(nums) {
    let res=0
    for(let num of nums){
        let rem=num%3
        res+=Math.min(rem,  3-rem)
    }
    return res
};