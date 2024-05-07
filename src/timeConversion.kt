/*
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
Example
• s = '12:01:00PM'
Return '12:01:00'.
• s = '12:01:00AM'
Return '00:01:00'.
Function Description
Complete the timeConversion function in the editor below.
It should return a new string representing the input time in 24-hour format. time Conversion has the following parameter(s):
• string s: a time in 12-hour format
Returns
• string: the time in 24-hour format
Input Format
A single string s that represents a time in 12-hour clock format (i.e.: hh:mm:ss AM or hh:mm:ssPM)
Constraints
• All input times are valid

Sample Input

07:05:45PM
Sample Output

19:05:45
 */
fun timeConversion(s: String): String {
    val parts = s.split(":")
    val hours = parts[0].toInt()
    val minutes = parts[1].toInt()
    val seconds = parts[2].substring(0, 2).toInt()
    val amPM = parts[2].substring(2)

    val twentyFourHrsFormat = when {
        amPM.equals("AM", ignoreCase = true) -> {
            if (hours == 12) {
                "00"
            } else {
                String.format("%02d", hours)
            }
        }
        amPM.equals("PM", ignoreCase = true) -> {
            if (hours == 12) {
                "12"
            } else {
                String.format("%02d", hours + 12)
            }
        }
        else -> ""
    }

    return "$twentyFourHrsFormat:${String.format("%02d", minutes)}:${String.format("%02d", seconds)}"
}

fun main() {
    print(timeConversion("12:01:00AM"))
}