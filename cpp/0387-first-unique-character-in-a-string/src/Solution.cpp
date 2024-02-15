
// Approach: Store char counts in hashmap

// Initialize an unordered map to store character counts.
// Iterate through the string to update character counts in the map.
// Iterate through the string again, return index of the first character
// with a count of 1.

// Time: O(n)
// Space: O(u) where u is number of unique characters in the string

#include "Solution.h"
#include <iostream>
using namespace std;
using namespace dmaccormac;

int Solution::firstUniqChar(string s) {

    unordered_map<char, int> map;

    for (auto ch : s)
        map[ch]++;

    for (int i = 0; i < s.size(); i++)
        if (map[s[i]] == 1)
            return i;

    return -1;
}
