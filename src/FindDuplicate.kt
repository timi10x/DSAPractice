/*
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
Example 3:

Input: nums = [3,3,3,3,3]
Output: 3

Constraints:
1 <= n <= 10^5
nums.length == n + 1
1 <= nums[i] <= n
All the integers in nums appear only once except for precisely one integer which appears two or more times.
 */

fun findDuplicate(nums: IntArray): Int {
    val set = HashSet<Int>()
    for(num in nums) {
        if(!set.add(num)) {
            return num
        }
    }
    throw IllegalArgumentException("No duplicate found")
}

fun main() {
    print("${findDuplicate(intArrayOf(1,3,4,2,2))}")
}