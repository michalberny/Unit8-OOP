package com.engeto.training;

public abstract class Credentials {
    private String forename;
    private String surename;

    public Credentials(String forename, String surename) {
        this.forename = forename;
        this.surename = surename;
    }

    public String getForename() {
        return forename;
    }

    public String getSurename() {
        return surename;
    }
}
