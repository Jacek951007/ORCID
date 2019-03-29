package com.zutorcid.Controller;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Search {
    private String expression;
    private String foundElement;
private String path;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date worksSince;
    private Date worksTo;

    public Date getWorksSince() {
        return worksSince;
    }

    public void setWorksSince(Date worksSince) {
        this.worksSince = worksSince;
    }

    public Date getWorksTo() {
        return worksTo;
    }

    public void setWorksTo(Date worksTo) {
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
