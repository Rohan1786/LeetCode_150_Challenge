/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function (s) {
    let stack = [];
    let set = new Set(['{', '(', '[', '<']);

    for (let ch of s) {
        if (set.has(ch)) {
            stack.push(ch);
        } else {
            if (stack.length > 0) {
                let top = stack[stack.length - 1];

                if (
                    (ch === ']' && top === '[') ||
                    (ch === '}' && top === '{') ||
                    (ch === ')' && top === '(') ||
                    (ch === '>' && top === '<')
                ) {
                    stack.pop();
                } else {
                    return false;  
                }
            } else {
                return false;   
            }
        }
    }

    return stack.length === 0;
};
