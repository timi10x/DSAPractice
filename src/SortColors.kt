/*
Given an array nums with n objects colored red, white, or blue,
sort them in-place so that objects of the same color are adjacent,
with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]


Constraints:
n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.
 */

fun sortColors(nums: IntArray): IntArray {
    var start = 0
    var end = nums.size - 1
    var current = 0

    while(current <= end) {
        when(nums[current]) {
            0 -> {
                swap(nums, start, current)
                current++
                start++
            }

            1 -> current++

            2 -> {
                swap(nums, current, end)
                end--
            }
        }
    }

    return nums
}

fun swap(nums: IntArray, i: Int, j: Int) {
    val temp = nums[i]
    nums[i] = nums[j]
    nums[j] = temp
}

fun main() {
    print(sortColors(intArrayOf(2,0,2,1,1,0)).joinToString(", "))
}