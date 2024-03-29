package com.metalogic.graph;

import com.intellij.psi.PsiMethod;
import com.metalogic.graph.ui.MethodButton;

import javax.swing.*;
import java.util.LinkedList;

public class MethodNode extends Node<PsiMethod> {
    public MethodNode(final PsiMethod method) {
        super(method);
        System.out.println("method = " + method);
    }

    public void setHasOverridingMethods(boolean hasOverridingMethods) {
        this.hasOverridingMethods = hasOverridingMethods;
    }

    public void setHasSuperMethods(boolean hasSuperMethods) {
        this.hasSuperMethods = hasSuperMethods;
    }

    protected JComponent ui(final SmallGraph graphParent, LinkedList<Node> path) {
        return box(graphParent, path, new MethodButton(psiElement, hasOverridingMethods, hasSuperMethods));
    }
}
