#include "Solution.h"
#include <iostream>
using namespace std;
using namespace dmaccormac;

// approach: two pointers

// i and j initialized to the start and end of the array respectively
// While i is less than j, perform the following steps:
// Swap the characters at positions i and j.
// Increment i and decrement j pointers
// When i becomes equal to j, the array will be reversed.

// time: (O)n
// space: (O)1

void Solution::reverseString(vector<char> &s) {
    int i = 0;
    int j = s.size() - 1;

    while (i < j)
        swap(s[i++], s[j--]);
}
