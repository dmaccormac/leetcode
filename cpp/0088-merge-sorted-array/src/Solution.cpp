// Approach: Fill from back using three pointers

// i and j initially point to last populated items in each array
// k initially points to the last element of nums1
// nums1: [1, 2, 3, 0, 0, 0]  nums2: [2, 5, 6]
// --------------i--------k-----------------j

// compare values at i and j in nums1 and nums2
// copy the larger value to k position in nums1
// decrement indexes (i and k) or (j and k)

// Time: O(n+m)
// Space: O(1)

#include "Solution.h"
#include <iostream>
using namespace std;
using namespace dmaccormac;

void Solution::merge(vector<int> &nums1, int m, vector<int> &nums2, int n) {

    int i = m - 1;
    int j = n - 1;
    int k = m + n - 1;

    while (j >= 0) {
        if (i >= 0 && nums1[i] > nums2[j]) {
            nums1[k--] = nums1[i--];
        } else {
            nums1[k--] = nums2[j--];
        }
    }
}
