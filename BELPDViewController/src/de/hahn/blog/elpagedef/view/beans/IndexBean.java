package de.hahn.blog.elpagedef.view.beans;

import javax.faces.event.ActionEvent;

import oracle.adf.controller.v2.lifecycle.PagePhaseListener;

public class IndexBean {
    String usePPListener = "1";

    public IndexBean() {
    }


    public void setUsePPListener(String usePPListener) {
        this.usePPListener = usePPListener;
    }

    public String getUsePPListener() {
        return usePPListener;
    }

    public PagePhaseListener getPagePhaseListener2Use() {
        if (getUsePPListener() != null && getUsePPListener().equals("2")) {
            return new MyPagePhaseListenerB();
        } else {
            return new MyPagePhaseListenerA();
        }
    }
}
