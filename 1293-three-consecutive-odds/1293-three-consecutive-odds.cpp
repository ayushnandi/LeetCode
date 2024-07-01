class Solution {
public:
    bool threeConsecutiveOdds(vector<int>& arr) {
        // Iterate through the array starting from the second element
        // and stopping at the second to last element.
        for(int i = 1; i < arr.size() - 1; ++i) {
            // Check if the current element, the previous element, and the next element are all odd.
            if(arr[i-1] % 2 != 0 && arr[i] % 2 != 0 && arr[i+1] % 2 != 0) {
                // If they are, return true immediately.
                return true;
            }
        }
        // If we complete the loop without finding three consecutive odd numbers, return false.
        return false;
    }
};