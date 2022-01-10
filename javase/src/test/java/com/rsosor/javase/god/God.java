package com.rsosor.javase.god;

public class God {

    private int a;

    private int god;

    public void god(int index) {
        if (index > 1) {
            god(index - 2);
            god += 4 * ((index) / 2);
            System.out.print(god + " ");
        } else {
            god = 0;
            System.out.print(god + " ");
        }
    }
}
