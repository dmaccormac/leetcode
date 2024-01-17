package io.github.dmaccormac;

import java.util.ArrayList;
import java.util.List;

// first row is always set to 1
// first and last cells of each row are always set to 1

// use nested for loop:
// -- i = row by row. j = cell by cell
// -- insert to current cell: previous_row[j-1] + previous_row[j]

// time complexity: O(n^2)

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        if (numRows == 0)
            return result;

        result.add(new ArrayList<>());
        result.get(0).add(1);

        for (int i = 1; i < numRows; i++) {
            var prev = result.get(i - 1);
            var curr = new ArrayList<Integer>();

            curr.add(1);

            for (int j = 1; j < prev.size(); j++)
                curr.add(prev.get(j - 1) + prev.get(j));

            curr.add(1);

            result.add(curr);
        }

        return result;

    }
}