var twoSum = function(nums, target) {
    var ans = [];
    var dict = {};
    for(var i = 0; i < nums.length; i++){
        var toFind = target - nums[i];
        if(toFind in dict){
            ans.push(i);
            ans.push(dict[toFind]);
        }
        else{
            dict[nums[i]] = i;
        }
    }
    return ans;
};
