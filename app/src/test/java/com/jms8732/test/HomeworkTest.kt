package com.jms8732.test

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class HomeworkTest {

    @Test
    fun `input negative is return 1`(){
        val result = Homework.fib(-1)

        assertThat(result).isEqualTo(1L)
    }

    @Test
    fun `input 0 is return 0`() {
        val result = Homework.fib(n = 0)
        assertThat(result).isEqualTo(0)
    }

    @Test
    fun `input 1 is return 1`() {
        val result = Homework.fib(n = 1)
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `input 2 is return 1`() {
        val result = Homework.fib(2)
        assertThat(result).isEqualTo(1)
    }


    @Test
    fun `((a+b) is return false`(){
        val result = Homework.checkBraces("((a+b)")
        assertThat(result).isFalse()
    }

    @Test
    fun `(a+b) is return true`(){
        val result = Homework.checkBraces("(a+b)")
        assertThat(result).isTrue()
    }

    @Test
    fun `)a+b( is return true`() {
        val result = Homework.checkBraces(")a+b(")
        assertThat(result).isTrue()
    }
}