package OOPS.properties.interfaces;

public class nicecar {
    private engine engine;
    private mediaplayer player=new media();
    public nicecar() {
        engine=new powerengine();
    }
    public nicecar(engine engine) {
        this.engine=engine;
    }

    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }


    public void startmusic(){
        player.start();
    }
    public void stopmusic(){
        player.stop();
    }

    public void upgradingengine(){
        this.engine=new electricengines();
    }
}
