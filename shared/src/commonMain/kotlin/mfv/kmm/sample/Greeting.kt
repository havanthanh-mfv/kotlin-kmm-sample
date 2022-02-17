package mfv.kmm.sample

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}