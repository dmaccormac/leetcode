#include "Solution.h"
#include <iostream>
using namespace dmaccormac;
using namespace std;

int main() {

    vector nums1 = {1, 2, 3, 0, 0, 0};
    vector nums2 = {2, 5, 6};
    int m = 3;
    int n = 3;

    Solution solution;
    solution.merge(nums1, m, nums2, n);

    for (auto item : nums1)
        cout << to_string(item) + " ";
}