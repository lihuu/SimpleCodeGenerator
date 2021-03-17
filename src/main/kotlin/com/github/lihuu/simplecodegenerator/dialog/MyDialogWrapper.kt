package com.github.lihuu.simplecodegenerator.dialog;

import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;

class MyDialogWrapper : DialogWrapper(true) {
    init {
        init()
        setTitle("Test DialogWrapper")
    }


    @Override
    override fun createCenterPanel(): JComponent {
        val panel = JPanel(BorderLayout())
        val label = JLabel("春江潮水连海平")
        label.preferredSize = Dimension(100, 100)
        panel.add(label, BorderLayout.CENTER);
        val button = JButton("Ok");
        button.addActionListener { println("Clicked") }
        return panel;
    }
}
