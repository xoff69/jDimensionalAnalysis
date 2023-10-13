package com.xoff.dimanalysis.dimension;

public enum Unit {

    M("M"), L("L"), K("K"), T("T"), I("I"), N("N"), J("J");

    public final String label;

    private Unit(String label) {
        this.label = label;
    }
}
