package com.umland.customtask

import org.gradle.api.internal.tasks.testing.TestResultProcessor
import org.gradle.api.internal.tasks.testing.detection.TestExecuter
import org.gradle.api.tasks.testing.Test

class TestLister extends Test {
    TestLister() {
        setTestExecuter(new TestExecuter() {
            @Override
            void execute(Test testTask, TestResultProcessor testResultProcessor) {
                println "Should run ${testTask.name}"
            }
        })
    }
}
