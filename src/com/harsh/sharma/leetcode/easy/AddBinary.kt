package com.harsh.sharma.leetcode.easy

import kotlin.math.pow

/*

    67. Add Binary

    https://leetcode.com/problems/add-binary/

 */

// Best Solution with Explanation available
fun addBinary(a: String, b: String): String {
    val sb = StringBuilder()
    //Google immutability or string vs stringbuilder if you don't know why we use this instead of regular string

    var i = a.length - 1
    var j = b.length - 1

    var carry = 0
    //two pointers starting from the back, just think of adding two regular ints from you add from back

    while (i >= 0 || j >= 0) {
        var sum = carry //if there is a carry from the last addition, add it to carry
        if (j >= 0) sum += b[j--] - '0' //we subtract '0' to get the int value of the char from the ascii
        if (i >= 0) sum += a[i--] - '0'
        sb.append(sum % 2) //if sum==2 or sum==0 append 0 cause 1+1=0 in this case as this is base 2 (just like 1+9 is 0 if adding ints in columns)
        carry = sum / 2 //if sum==2 we have a carry, else no carry 1/2 rounds down to 0 in integer arithematic
    }

    if (carry != 0) sb.append(carry) //leftover carry, add it

    return sb.reverse().toString()
}


// Extra Function not needed for solution but can be helpful to For Binary to String
fun convertBinaryToDecimal(input: Long): Int {
    var num = input
    var decimalNumber = 0
    var i = 0
    var remainder: Long

    while (num.toInt() != 0) {
        remainder = num % 10
        num /= 10
        decimalNumber += (remainder * 2.0.pow(i.toDouble())).toInt()
        ++i
    }
    return decimalNumber
}




fun main() {
    // https://www.tutorialspoint.com/how-to-convert-binary-to-decimal (Binary To Decimal Tutorial)

    println("" +
            "101 [${convertBinaryToDecimal(101)}]" +
            " + 1 [${convertBinaryToDecimal(1)}] " +
            "= ${addBinary("101", "1")} [${convertBinaryToDecimal(110)}]"
    )

    println("" +
            "1010 [${convertBinaryToDecimal(1010)}]" +
            " + 1111 [${convertBinaryToDecimal(1111)}] " +
            "= ${addBinary("1010", "1111")} [${convertBinaryToDecimal(11001)}]"
    )
}