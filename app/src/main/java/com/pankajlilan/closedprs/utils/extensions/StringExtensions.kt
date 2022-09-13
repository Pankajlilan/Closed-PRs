package com.pankajlilan.closedprs.utils.extensions

fun String?.isValid(): Boolean {
    return this != null && this.isNotEmpty() && this.isNotBlank()
}