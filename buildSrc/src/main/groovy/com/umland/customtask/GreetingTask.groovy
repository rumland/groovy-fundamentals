package com.umland.customtask

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class GreetingTask extends DefaultTask {
    String greeting = 'Hello Roberto'

    @TaskAction
    def greet() {
        println greeting
    }
}
