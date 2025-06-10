package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo {
    private final Bar bar;
    private final ArrayList<Baz> bazs = new ArrayList<>();
    private final Qux qux = new Qux();
    private Corge corge;

    public Foo(final Bar bar) {
        this.bar = bar;
    }

    public void addBaz(final Baz baz) {
        this.bazs.add(baz);
    }

    public List<Baz> getBaz() {
        return new ArrayList<>(this.bazs);
    }

    public Bar getBar() {
        return this.bar;
    }

    public Corge getCorge() {
        return this.corge;
    }

    public void setCorge(final Corge corge) {
        if (this.corge != null) {
            this.corge.setFoo(null);
        }
        if (this.corge.getFoo() != this) {
            this.corge.setFoo(this);
        }
        ;
    }
}
