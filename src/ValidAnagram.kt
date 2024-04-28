/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 *
 * Example 1:
 *
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 *
 * Input: s = "rat", t = "car"
 * Output: false
 *
 *
 * Constraints:
 *
 * 1 <= s.length, t.length <= 5 * 10^4
 * s and t consist of lowercase English letters.
 *
 */

fun isAnagram(s: String, t: String): Boolean {
    val sLength = s.length
    val tLength = t.length
    val charCount = IntArray(26)

    if(sLength != tLength) return false

    for(i in 0..<sLength) {
        charCount[s[i] - 'a']++ //we want to minus ever character we see at the beginning
        charCount[t[i] - 'a']-- //and minus every character we see at the end, so we'd have zero
    }

    return charCount.all { it == 0 }
}

fun main() {
    val s = "rat"
    val t = "car"
    print(isAnagram(s, t))
}