package com.github.lihuu.simplecodegenerator.services

import com.github.lihuu.simplecodegenerator.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
