class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        map<int,int> mp;
        for(auto c:nums){
            mp[c]++;
        }
        auto cmp = [](const pair<int,int>& a, const pair<int,int>& b) {
            return a.second < b.second; 
        };
        priority_queue<pair<int,int>, vector<pair<int,int>>, decltype(cmp)> pq(mp.begin(), mp.end(), cmp);

        vector<int> ans;
        while(k--){
            ans.emplace_back(pq.top().first); pq.pop();
        }
        return ans;
    }
};
