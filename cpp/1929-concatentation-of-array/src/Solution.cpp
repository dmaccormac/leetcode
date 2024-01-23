#include "../include/Solution.h"
#include <iostream>
#include <vector>
using namespace std;
using namespace dmaccormac;

vector<int> Solution::getConcatenation(vector<int> &nums) {
    int len = nums.size();
    vector<int> ans;

    for (int i = 0; i < len * 2; i++)
        ans.push_back(i % len);

    return ans;
}
