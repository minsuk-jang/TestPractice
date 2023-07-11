package com.jms8732.test

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test


internal class ResourceComparerTest{

    private lateinit var comparer : ResourceComparer


    @Before
    fun setup(){
        comparer = ResourceComparer()
    }


    @Test
    fun stringResourceSameAsGivenString_returnsTrue(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = comparer.isEqual(context,R.string.app_name, "Test")

        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceDifferentAsGivenString_returnFalse(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = comparer.isEqual(context,R.string.app_name,"asdoifjasoj")

        assertThat(result).isFalse()
    }
}