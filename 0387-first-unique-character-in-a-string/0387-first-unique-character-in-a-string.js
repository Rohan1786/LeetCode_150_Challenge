/**
 * @param {string} s
 * @return {number}
 */
var firstUniqChar = function(s) {
//     let field = new Array(26).fill(0);
//     for(ch of s){
//         field[ch.charCodeAt(0)-'a'.charCodeAt(0)]++;
//     }
//    for (let i = 0; i < s.length; i++) {
//         let ch = s[i];
//         if (field[ch.charCodeAt(0) - 'a'.charCodeAt(0)] === 1) {
//             return i;
//         }
//     }
// return -1;

let freq={}
for(ch of s){
    freq[ch]=(freq[ch]||0)+1
}
for(let i=0; i<s.length; i++){
    let ch=s[i];
    if(freq[ch]===1){
        return i;
    }

}
return -1;
};