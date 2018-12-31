package de.hahn.blog.elpagedef.view.beans;

import oracle.adf.controller.v2.lifecycle.PagePhaseEvent;
import oracle.adf.controller.v2.lifecycle.PagePhaseListener;

public class MyPagePhaseListenerB implements PagePhaseListener {
    public MyPagePhaseListenerB() {
        super();
        System.out.println("MyPagePhaseListenerB created");

    }

    @Override
    public void afterPhase(PagePhaseEvent pagePhaseEvent) {
        // TODO Implement this method
        System.out.println("MyPagePhaseListenerB afterPhase called");

    }

    @Override
    public void beforePhase(PagePhaseEvent pagePhaseEvent) {
        // TODO Implement this method
        System.out.println("MyPagePhaseListenerB beforePhase called");
    }
}
