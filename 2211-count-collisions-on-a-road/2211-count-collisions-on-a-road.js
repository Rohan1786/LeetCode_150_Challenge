/**
 * @param {string} directions
 * @return {number}
 */
var countCollisions = function(directions) {
    let arr = directions.split('');
    let  n = arr.length;
    let ans=0;
    let i=0;
    let j=n-1;
    while(i<n && arr[i]=='L') i++;
    while(j>=0 && arr[j]=='R') j--;
    for(let k=i; k<=j; k++){
        if(arr[k]!='S'){
            ans++;
        }
    }
    return ans;
};