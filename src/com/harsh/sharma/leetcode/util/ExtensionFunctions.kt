package com.harsh.sharma.leetcode.util

fun Int.printAndNewLine() {
    println(this)
}

fun String.printAndNewLine() {
    println(this)
}

fun Char.printAndNewLine() {
    println(this)
}

fun Boolean.printAndNewLine() {
    println(this)
}

fun IntArray.printArrayElements() {
    this.forEach {
        print("$it\t")
    }
}

fun IntArray.printArrayElementsEndNewLine() {
    this.printArrayElements()
    println()
}

fun List<Int>.printArrayElements() {
    this.forEach {
        print("$it\t")
    }
}

fun List<Int>.printArrayElementsEndNewLine() {
    this.printArrayElements()
    println()
}

fun Array<String>.printArrayElements() {
    this.forEach {
        print("$it\t")
    }
}

fun Array<String>.printArrayElementsEndNewLine() {
    this.printArrayElements()
    println()
}