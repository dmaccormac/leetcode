// Approach: Dictionary to group anagrams together

// Use a char array to count the frequency of chars in each word
// Example: "acdc" -> [1, 0, 2, 1, 0, 0, ... 0]
// Use this a dict key and to identify anagrams and group them together

// time: O(N*K), where N is the length of strs, and K is the maximum length of a string in strs
// space: O(N*K), the total information content stored in dict
public class Solution
{
    public IList<IList<string>> GroupAnagrams(string[] strs)
    {
        var dict = new Dictionary<string, IList<string>>();
        foreach (var word in strs)
        {
            var key = GetHashKey(word);

            if (dict.TryGetValue(key, out var value))
                value.Add(word);
            else
                dict.Add(key, new List<string> { word });
        }

        return dict.Values.ToList();
    }
    private string GetHashKey(string s)
    {
        var key = new char[26];
        foreach (var letter in s)
            key[letter - 'a']++;
        return new string(key);
    }
}
