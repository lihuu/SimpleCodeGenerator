package com.github.lihuu.simplecodegenerator.services

import com.github.lihuu.simplecodegenerator.dialog.MyDialogWrapper
import com.intellij.credentialStore.isMacOsCredentialStoreSupported
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.roots.ProjectRootManager
import com.intellij.openapi.vfs.VirtualFile

class TestAlert : AnAction() {


    override fun actionPerformed(e: AnActionEvent) {
        println("Action Performed")
        val p = e.project
        val projectName = p?.name
        println("Perform action in project $projectName")


        if(MyDialogWrapper().showAndGet()){
            println("Show Dialog")
        }


    }
}
