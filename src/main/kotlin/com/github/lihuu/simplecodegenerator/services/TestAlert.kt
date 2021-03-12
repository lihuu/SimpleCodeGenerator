package com.github.lihuu.simplecodegenerator.services

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class TestAlert : AnAction() {

    override fun actionPerformed(e: AnActionEvent) {
        println("Action Performed")
    }
}
