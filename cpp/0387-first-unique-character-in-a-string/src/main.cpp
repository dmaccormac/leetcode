#include "Solution.h"
#include <iostream>
using namespace dmaccormac;
using namespace std;

int main() {

    Solution solution;

    string s = "leetcode";
    cout << solution.firstUniqChar(s) << endl;

    s = "loveleetcode";
    cout << solution.firstUniqChar(s) << endl;

    s = "aabb";
    cout << solution.firstUniqChar(s) << endl;
}