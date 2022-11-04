var isPalindrome = function(x) {
    var rev = [];
    var origS = x.toString();
    var orig = Array.from(String(origS), Number);
    for(var i = orig.length-1; i > -1; i--){
        console.log(orig[i]);
        rev.push(orig[i]);
    }
    
    if(rev.toString() === orig.toString()){
        return true;
    }
    else{
        return false;
    }
};