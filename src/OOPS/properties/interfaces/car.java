package OOPS.properties.interfaces;

import java.sql.SQLOutput;

public  class car implements engine ,brake,mediaplayer{
    @Override
    public void brake() {
        System.out.println("brake likea normal car");
    }

    @Override
    public void disc() {
        System.out.println("disc likea normal car");
    }


    @Override
    public void screen() {
        System.out.println("screen likea normal car");
    }

    @Override
    public void start() {
        System.out.println("music start");
    }

    @Override
    public void stop() {
        System.out.println("stop likea normal car");
    }

    @Override
    public void acc() {
        System.out.println("acc likea normal car");
    }
}
