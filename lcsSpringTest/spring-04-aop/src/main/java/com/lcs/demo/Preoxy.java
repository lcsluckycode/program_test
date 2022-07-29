package com.lcs.demo;

public class Preoxy implements Rent{
    private Host host;

    public Preoxy(Host host) {
        this.host = host;
    }
    @Override
    public void rent() {
        host.rent();
    }
}
