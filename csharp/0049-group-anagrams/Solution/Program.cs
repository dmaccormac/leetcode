
String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat", "aa" };
var solution = new Solution();
var result = solution.GroupAnagrams(strs);

foreach (var innerList in result)
{
    foreach (var item in innerList)
    {
        Console.Write(item + " ");
    }
    Console.WriteLine(); 
}
