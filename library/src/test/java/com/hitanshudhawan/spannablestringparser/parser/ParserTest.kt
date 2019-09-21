package com.hitanshudhawan.spannablestringparser.parser

import com.hitanshudhawan.spannablestringparser.TestingUtils
import com.hitanshudhawan.spannablestringparser.parse
import com.hitanshudhawan.spannablestringparser.tokenize
import org.junit.Assert.assertEquals
import org.junit.Test

class ParserTest {

    @Test
    fun test001() {
        assertEquals(
            listOf(
                Node("Hello Hitanshu")
            ),
            TestingUtils.testingStrings.getValue(1).tokenize().parse()
        )
    }

}