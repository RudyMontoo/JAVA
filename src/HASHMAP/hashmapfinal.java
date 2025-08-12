package HASHMAP;

import java.util.ArrayList;
import java.util.LinkedList;

public class hashmapfinal<K, V> {
    ArrayList<LinkedList<Entity>> list;
    private int size = 0;
    private float lf = 0.5f;

    public hashmapfinal() {
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<>());
        }
    }

    public void put(K key, V value) {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);
        for (Entity entity : entities) {
            if (entity.key.equals(key)) {
                entity.value = value;
                return;
            }
        }
        if ((float) (size) / list.size() > lf) {
            reHash();
            hash = Math.abs(key.hashCode() % list.size());
            entities = list.get(hash); // recalculate entities after rehash
        }
        entities.add(new Entity(key, value));
        size++;
    }

    private void reHash() {
        System.out.println("we are now rehashing");
        ArrayList<LinkedList<Entity>> old = list;
        list = new ArrayList<>();
        for (int i = 0; i < old.size() * 2; i++) { // Double the number of buckets
            list.add(new LinkedList<>());
        }
        size = 0;
        for (LinkedList<Entity> bucket : old) {
            for (Entity entry : bucket) {
                put(entry.key, entry.value); // Re-insert into new buckets
            }
        }
    }

    public V get(K key) {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);
        for (Entity entity : entities) {
            if (entity.key.equals(key)) {
                return entity.value;
            }
        }
        return null;
    }

    public void remove(K key){
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);
        Entity target=null;
        for (Entity entity : entities) {
            if (entity.key.equals(key)) {
                target = entity;
                break;
            }
        }
        entities.remove(target);
        size--;
    }

    public boolean containsKey(K key) {
        return get(key) != null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (LinkedList<Entity> bucket : list) {
            for (Entity entity : bucket) {
                sb.append(entity.key).append("=").append(entity.value).append(",");
            }
        }
        return sb.append("]").toString();
    }
    private class Entity {
        K key;
        V value;

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}