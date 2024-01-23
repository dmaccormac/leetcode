#include "../include/Solution.h"
#include <iostream>
#include <vector>
using namespace dmaccormac;
using namespace std;

int main() {
    Solution solution;
    vector nums = {1, 2, 3};
    vector ans = solution.getConcatenation(nums);

    for (int i : ans)
        cout << i << ' ';
}