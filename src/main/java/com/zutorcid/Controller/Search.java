package com.zutorcid.Controller;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Search {
    private String expression;
    private String foundElement;
private String path;

    private String worksSince;
    private String worksTo;

    public String getWorksSince() {
        return worksSince;
    }

    public void setWorksSince(String worksSince) {
        this.worksSince = worksSince;
    }

    public String getWorksTo() {
        return worksTo;
    }

    public void setWorksTo(String worksTo) {
        this.worksTo = worksTo;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
