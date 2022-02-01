package com.github.roharon.bicepidea.services

import com.intellij.openapi.project.Project
import com.github.roharon.bicepidea.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
