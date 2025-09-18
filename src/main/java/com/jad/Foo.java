package com.jad;

import java.util.List;

public class Foo {
    private Bar bar;
    private List<Baz> bazs;
    private Qux qux;
    private Corge corge;
    private List<Grault> graults;

    public Foo(Bar bar) {
        this.bar = bar;
    }

    public void addBaz(Baz baz) {
    }

    public void addGrault() {
    }

    public Bar getBar() {
        return bar;
    }

    public List<Baz> getBazs() {
        return bazs;
    }

    public Qux getQux() {
        return qux;
    }

    public Corge getCorge() {
        return corge;
    }

    public void setCorge(Corge corge) {
        this.corge = corge;
    }

    public List<Grault> getGraults() {
        return graults;
    }
}