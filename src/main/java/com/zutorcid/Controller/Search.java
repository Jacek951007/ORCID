package com.zutorcid.Controller;

import java.util.List;

public class Search {
    private String expression;
    private List<String> foundElement;

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public List<String> getFoundElement() {
        return foundElement;
    }

    public void setFoundElement(List<String> foundElement) {
        this.foundElement = foundElement;
    }
}
