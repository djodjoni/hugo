package io.apptik.hugo4j.example;

import hugo.weaving.DebugLog;
import io.apptik.hugo4j.Hugo;


public class Main {
    public static void main(String[] args) {
        Hugo.setEnabled(false);
        Main m = new Main();
        System.out.println("Res: " +   m.checkItOut("1", "2"));

        Hugo.setEnabled(true);
        System.out.println("Res: " +  m.checkItOut("3", "4"));
    }


    @DebugLog
    private String checkItOut(String one, String two) {
        String three;
        three = one + " plus " + two;
        return three;
    }
}
