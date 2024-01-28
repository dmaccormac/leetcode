#include "../include/Solution.h"
#include <iostream>
#include <vector>
using namespace std;
using namespace dmaccormac;

vector<int> Solution::twoSum(vector<int> &nums, int target) {

    // approach - unordered_map and calculate difference

    // loop over each number in vector and store number/index in unordered_map
    // for each num, the other value we're looking for is: target - current num
    // if we have that other value in the map, then we have found the two nums
    // return index of current num and index of other num from unordered_map

    // time complexity: O(n)
    // space complexity: O(n)

    unordered_map<int, int> map;

    for (int i = 0; i < nums.size(); i++) {
        int diff = target - nums[i];

        if (map.find(diff) != map.end())
            return {map[diff], i};

        map.insert({nums[i], i});
    }
    return {};
}
