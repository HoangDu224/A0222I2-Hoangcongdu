function findFibonacci(n: number): number {
    if (n < 0) {
        return -1;
    } else if (n == 0 || n == 1) {
        return n;
    } else {
        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }
}

let total: number = 0;
for (let i = 0; i < 10; i++) {
    console.log(findFibonacci(i))
    total += findFibonacci(i);
}
console.log("total:" + total);
