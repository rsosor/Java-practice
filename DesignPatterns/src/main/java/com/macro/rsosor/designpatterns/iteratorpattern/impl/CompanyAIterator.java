package com.macro.rsosor.designpatterns.iteratorpattern.impl;

import com.macro.rsosor.designpatterns.iteratorpattern.Iterator;

public class CompanyAIterator implements Iterator {

    private CompanyA companyA;

    private int current = 0;

    public CompanyAIterator(CompanyA companyA) {
        this.companyA = companyA;
    }

    @Override
    public Object first() {
        return companyA.employees.get(current);
    }

    @Override
    public Object next() {
        Object ret = null;
        current++;
        if (current < companyA.employees.size()) {
            ret = companyA.employees.get(current);
        }
        return ret;
    }

    @Override
    public boolean isDone() {
        return current >= companyA.employees.size() ? true : false;
    }

    @Override
    public Object currentItem() {
        return companyA.employees.get(current);
    }
}
