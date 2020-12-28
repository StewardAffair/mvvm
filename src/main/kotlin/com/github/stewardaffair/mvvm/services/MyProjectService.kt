package com.github.stewardaffair.mvvm.services

import com.intellij.openapi.project.Project
import com.github.stewardaffair.mvvm.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
