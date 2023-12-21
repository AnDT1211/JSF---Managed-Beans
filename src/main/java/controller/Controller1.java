package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Controller1 {
    String toPage = "hello";

    public String getToPage() {
        return toPage;
    }

    public void setToPage(String toPage) {
        this.toPage = toPage;
    }
}
