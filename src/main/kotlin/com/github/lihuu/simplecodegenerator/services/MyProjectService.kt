package com.github.lihuu.simplecodegenerator.services

import com.github.lihuu.simplecodegenerator.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        // 打开项目的时候会运行
        println(MyBundle.message("projectService", project.name))
    }
}
