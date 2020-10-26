/*
    Author: Timofey Chicherin (TimDev, TwMicro)
    Collaborators: [no]
    License: Apache License 2.0
    GitHub: https://github.com/twmicro/technolib/
*/

var toPrint = ""
/*
    readLines -
    Reads a count of lines
*/

// Simple variant
fun readLines(count: Int): MutableList<String> {
    val lines = mutableListOf<String>()
    for (i in 0 until count) lines.add(readLine()!!)
    return lines
}

// Inline variant, works like forEach
inline fun readLines(count: Int, action: (String) -> Unit): MutableList<String> {
    val lines = mutableListOf<String>()
    for (i in 0 until count) {
        lines.add(readLine()!!)
        action.invoke(lines.last())
    }
    return lines
}


/*
    readMultiLineIntList -
    Reads a count of lines and converts it to MutableList<Int>
*/

// Simple variant
fun readMultiLineIntList(count: Int): MutableList<Int> {
    val lines = mutableListOf<Int>()
    for (i in 0 until count) lines.add(readLine()!!.toInt())
    return lines
}

// Inline variant, works like forEach
inline fun readMultiLineIntList(count: Int, action: (Int) -> Unit): MutableList<Int> {
    val lines = mutableListOf<Int>()
    for (i in 0 until count) {
        lines.add(readLine()!!.toInt())
        action.invoke(lines.last())
    }
    return lines
}


/*
    readIntList -
    Reads single line of integers
*/

// Simple variant
fun readIntList(seperator: String = " "): MutableList<Int> = readLine()!!.split(seperator).toIntList()

// Inline variant, works like forEach
fun readIntList(seperator: String = " ", action: (Int) -> Unit) = readIntList(seperator).forEach(action)

/*
    List<String>.toIntList -
    Converts string list to int list
*/

fun List<String>.toIntList(): MutableList<Int> {
    val result = mutableListOf<Int>()
    forEach {
        result.add(it.toInt())
    }
    return result
}

/*
    order(ln) -
    Adds text to print stack. Don't forget to use drop() or dropln() in the end of your program!
    (ln) - adds \n to the end of text
*/

fun order(text: String)  {
    toPrint += text
}

fun orderln(text: String)  {
    toPrint += text + "\n"
}

/*
    drop(ln) -
    Prints all the text from the print stack
*/
fun drop() = print(toPrint)
fun dropln() = println(toPrint)

/*
    readInt -
    Shortcut for readLine()!!.toInt()
*/
fun readInt(): Int = readLine()!!.toInt()