package HASHMAP;

import javax.swing.text.html.parser.Entity;
import java.util.*;

class MapUsingHash{
    private Entity[] entities;
    public MapUsingHash(){
        entities=new Entity[100];
    }

public void put(String key,String value){
        int hash=Math.abs(key.hashCode() % entities.length);
        entities[hash]=new Entity(key, value);
}
public String get(String key){
        int hash=Math.abs(key.hashCode() % entities.length);
        if(entities[hash]!=null&&entities[hash].key.equals(key)){
            return entities[hash].value;
        }
        return null;
}
public void remove(String key){
        int hash=Math.abs(key.hashCode() % entities.length);
        if(entities[hash]!=null&&entities[hash].key.equals(key)){
            entities[hash]=null;
        }
}
    private class Entity{
        String key;
        String value;
        public Entity(String key,String value){
            this.key=key;
            this.value=value;
        }
    }

}

public class main {
    public static void main(String[] args) {
//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("a", 1);
//        map.put("b", 2);
//        map.put("c", 3);
//        System.out.println(map.get("b"));

        MapUsingHash mh=new MapUsingHash();
        mh.put("Mango","King of fruits");
        mh.put("Kiwi","denque");
        mh.put("key3","value3");
        mh.put("key4","value4");
        System.out.println(mh.get("Kiwi"));

    }
}
