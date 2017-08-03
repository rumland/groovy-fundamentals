package com.umland.pluralsight

import spock.lang.Specification

class HelloWorldTest extends Specification {
    def 'test default hello world message'() {
        given:
        def helloWorld = new HelloWorld()

        expect:
        helloWorld.getMessage() == "Hello, World"
    }
}
