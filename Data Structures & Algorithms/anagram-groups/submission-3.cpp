class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        map<string,vector<string>> mp;
        for(string s:strs){
            vector<int> v(26,0);
            for(char c:s){
                v[c-'a']++;
            }
            string key = "";
            for(int i=0;i<26;i++){
                key+='#'+v[i];
            }
            mp[key].push_back(s);
        }
        vector<vector<string>> ans;
        for(auto& [s,lst]:mp){
            ans.push_back(lst);
        }
        return ans;
    }
};
