package OOPS.properties.interfaces;

import java.sql.SQLOutput;

public class media implements mediaplayer{
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
        System.out.println("music stop");
    }
}
