package com.umland.pluralsight


class LearnClosure {
    def message = {
        println "Howdy partner"
    }

    def displayMessage() {
        message()
    }

    def displayMessageManyTimes(n) {
        (1..n).each({ nth ->
            sleep(1000)
            println "Howdy at " + "${new Date()} for $nth time"
        })
    }

    def displayMessageManyEvenTimes(n) {
        (1..n).findAll({it%2 == 0}).each({ nth ->
            sleep(1000)
            println "Howdy at " + "${new Date()} for $nth time"
        })
    }
}
