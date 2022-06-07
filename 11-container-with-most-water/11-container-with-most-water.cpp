class Solution {
public:
    int maxArea(vector<int>& height) {
        int left = 0;
        int right = height.size() - 1;
        int res = INT_MIN;
        while(left < right) {
            res = max(res, min(height[left], height[right]) * (right - left));
            if(height[right] < height[left]) right--;
            else left++;
        }
        return res;
    }
};