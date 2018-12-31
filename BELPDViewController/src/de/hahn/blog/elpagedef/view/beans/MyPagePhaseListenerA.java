package de.hahn.blog.elpagedef.view.beans;

import oracle.adf.controller.v2.lifecycle.PagePhaseEvent;
import oracle.adf.controller.v2.lifecycle.PagePhaseListener;

public class MyPagePhaseListenerA implements PagePhaseListener {
    public MyPagePhaseListenerA() {
        super();
        System.out.println("MyPagePhaseListenerA created");
    }

    @Override
    public void afterPhase(PagePhaseEvent pagePhaseEvent) {
        // TODO Implement this method
        System.out.println("MyPagePhaseListenerA afterPhase called");
    }

    @Override
    public void beforePhase(PagePhaseEvent pagePhaseEvent) {
        // TODO Implement this method
        System.out.println("MyPagePhaseListenerA beforePhase called");
    }
}
