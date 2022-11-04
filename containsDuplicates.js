var containsDuplicate = function(nums) {
    const numsSet = new Set(nums);
    console.log(nums.length)
    if(numsSet.size < nums.length){
        return true;
    }
    else{
        return false;
    }
};