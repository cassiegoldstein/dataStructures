var intersect = function(nums1, nums2) {
    ans =[]
    dict = {}
    for(let i = 0; i < nums1.length; i++){
        if(nums1[i] in dict){
            dict[nums1[i]]++;
        }
        else{
           dict[nums1[i]] = 1; 
        }
    }
    for(let i=0; i < nums2.length; i++){
        if(dict[nums2[i]] > 0){
            ans.push(nums2[i]);
            dict[nums2[i]]--;
        }
    }
    return ans;
};