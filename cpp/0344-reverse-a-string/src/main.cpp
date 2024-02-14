#include "Solution.h"
#include <iostream>
using namespace dmaccormac;
using namespace std;

int main() {

    vector<char> text = {'h', 'e', 'l', 'l', 'o'};

    Solution solution;
    solution.reverseString(text);

    for (auto ch : text)
        cout << ch;
}