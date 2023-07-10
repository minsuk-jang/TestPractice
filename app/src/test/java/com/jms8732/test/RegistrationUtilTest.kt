package com.jms8732.test


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty user name return false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Philipp",
            "123",
            "123"
        )

        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Carl",
            "123",
            "123"
        )

        assertThat(result).isTrue()
    }

    //empty password
    @Test
    fun `empty password return false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Carl",
            "",
            ""
        )

        assertThat(result).isFalse()
    }

    //password was repeated incorrectly
    @Test
    fun `password was repeated incorrectly return false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Carl",
            "123",
            "234"
        )

        assertThat(result).isFalse()
    }

    //password contains less than 2 digits
    @Test
    fun `password contains less than 2 digits return false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Carl",
            "2asdfasd",
            "asdfasdfa3"
        )

        assertThat(result).isFalse()
    }
}