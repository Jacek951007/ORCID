package com.zutorcid.Controller;

import java.util.List;

public class Search {
    private String expression;
    private String foundElement;
private String path;

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getFoundElement() {
        return foundElement;
    }

    public void setFoundElement(String foundElement) {
        this.foundElement = foundElement;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
