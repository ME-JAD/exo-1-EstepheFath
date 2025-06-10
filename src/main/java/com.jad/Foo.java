package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo {
    private final Bar bar;
    private final ArrayList<Baz> bazs = new ArrayList<>();

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
}
