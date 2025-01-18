var scoreOfString = function(s) {
    let cnt = 0 ;
    for(let i = 1 ; i< s.length ; i++ ){
        cnt += Math.abs(s.charCodeAt(i) - s.charCodeAt(i - 1));
    }
    return cnt;
};