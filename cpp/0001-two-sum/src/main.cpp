#include "../include/Solution.h"
#include <iostream>
#include <vector>
using namespace dmaccormac;
using namespace std;

int main() {
    Solution solution;
    vector<int> nums{2, 7, 11, 15};
    auto result = solution.twoSum(nums, 9);
    for (int i : result)
        cout << i << " ";
}