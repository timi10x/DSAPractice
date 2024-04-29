fun groupAnagrams(strs: Array<String>): List<List<String>> {
    return strs.groupBy { str -> str.groupingBy { it }.eachCount() }.values.toList()
}

fun main() {
    print("${groupAnagrams(arrayOf("eat","tea","tan","ate","nat","bat"))}")
}