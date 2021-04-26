package com.getman.myappfilmsearch

data class ExampleDataClass(val hello: String = "Hello", val name: String = "World"){
    override fun toString(): String {
        return hello + " " + name
    }
}
