package com.example

import org.jetbrains.spek.api.Spek
import kotlin.test.assertEquals

class HelloWorldSpec: Spek({

    given("A hello function") {
        on("when invoked") {
            val result = hello()
            it("should say hello") {
                assertEquals("Hello", result)
            }
        }
    }


})