const BubbleSort = (A) => {
    let s;
    do {
        s = false;
        for (var i=0; i < A.length-1; i++) {
            if (A[i] > A[i+1]) {
                var temp = A[i];
                A[i] = A[i+1];
                A[i+1] = temp;
                s = true;
            }
        }
    } while (s);
    return A;
}

console.log('generating array...');

let arr = [];
for ( let i = 0 ; i < 12; i++ )
    arr.push(Math.round(Math.random()*40))

console.log('Before order:', arr);
console.log('Then Order:', BubbleSort(arr));