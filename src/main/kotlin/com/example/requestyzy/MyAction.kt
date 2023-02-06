package com.example.requestyzy

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.actionSystem.PlatformDataKeys
import com.intellij.openapi.ui.Messages

class MyAction: AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        var project = e.getData(PlatformDataKeys.PROJECT)
        val psiFile = e.getData(CommonDataKeys.PSI_FILE)
        var classPath = psiFile?.virtualFile?.path;

        Messages.showMessageDialog(project,"guide-idea-plugin-create-project-by-platform: " + classPath, "Hi IDEA Plugin", Messages.getInformationIcon())
    }
}