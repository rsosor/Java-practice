package com.macro.rsosor.designpatterns.iteratorpattern.impl;

import com.macro.rsosor.designpatterns.iteratorpattern.Aggregate;
import com.macro.rsosor.designpatterns.iteratorpattern.Employee;
import com.macro.rsosor.designpatterns.iteratorpattern.Iterator;

import java.util.ArrayList;
import java.util.List;

public class CompanyA implements Aggregate {

    List<Employee> employees = new ArrayList<>();

    public CompanyA() {
        employees.add(new Employee("小萱", "業務"));
        employees.add(new Employee("小安", "工程師"));
        employees.add(new Employee("小可", "工程師"));
        employees.add(new Employee("小蘭", "專案經理"));
        employees.add(new Employee("小跳", "吉祥物"));
        employees.add(new Employee("小芬", "助理"));
    }

    @Override
    public Iterator createIterator() {
        return new CompanyAIterator(this);
    }
}
