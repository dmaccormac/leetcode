// Approach: Traverse string from end

// Increment count for each non whitespace we hit
// When we hit the next whitespace, return the count

// Time: O(n)
// Space: (O)1

public class Solution
{
    public int LengthOfLastWord(string s)
    {

        int count = 0;
        for (int i = s.Length - 1; i > 0; i--)
        {
            if (!(s[i] == ' '))
                count++;

            if ((s[i] == ' ') && (count > 0))
                return count;

        }

        return count;
    }
}