class Solution {
public:
    vector<string> sortPeople(vector<string>& names, vector<int>& heights) {
        vector<pair<int, string>> peoples;
        for(int i = 0; i < heights.size(); i++){
            peoples.push_back({heights[i], names[i]});
        }
        sort(peoples.begin(), peoples.end());
        reverse(peoples.begin(), peoples.end());
        vector<string> ans;
        for(auto x: peoples){
            ans.push_back(x.second);
        }
        return ans;
    }
};