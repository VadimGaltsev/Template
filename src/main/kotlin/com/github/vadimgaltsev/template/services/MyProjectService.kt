package com.github.vadimgaltsev.template.services

import com.intellij.openapi.project.Project
import com.github.vadimgaltsev.template.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
