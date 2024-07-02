class Solution {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        unordered_map<int,int> mp1;
        unordered_map<int,int> mp2;
        vector<int> ans;
        for(auto n:nums1){
            mp1[n]++;
        }
        for(auto n:nums2){
            mp2[n]++;
        }

        for(auto m:mp1){
            auto found = mp2.find(m.first);
            if(found!=mp2.end()){
                int r = min(found->second, m.second);
                // if(m.second==)
                for(int i=0; i<r; i++){
                    ans.push_back(m.first);
                }
            }
        }
        return ans;

    }
};