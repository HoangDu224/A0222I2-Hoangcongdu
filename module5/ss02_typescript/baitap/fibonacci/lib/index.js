"use strict";
function findFibonacci(n) {
    if (n < 0) {
        return -1;
    }
    else if (n == 0 || n == 1) {
        return n;
    }
    else {
        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }
}
var total = 0;
for (var i = 0; i < 10; i++) {
    console.log(findFibonacci(i));
    total += findFibonacci(i);
}
console.log("total:" + total);
