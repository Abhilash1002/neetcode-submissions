class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        map<string,vector<string>> mp;
        int n = strs.size();
        for(int i=0;i<n;i++){
            string s = strs[i];
            vector<int> v(26,0);
            for(char c:s){
                v[c-'a']++;
            }
            string key = "";
            for(int c:v){
                key = key + to_string(c) + ",";
            }
            mp[key].emplace_back(s);
        }
        vector<vector<string>> ans;
        for(auto c:mp){
            ans.emplace_back(c.second);
        }
        return ans;
    }
};
