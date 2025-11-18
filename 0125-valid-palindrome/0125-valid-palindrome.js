/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
     let str = s.toLowerCase().replace(/[^a-z0-9]/g, "");
 
    let rev = str.split("").reverse().join("");
 
    return str === rev;
};