package jdk.collection.hashmap;

/**
 * 手写HashMap
 * Created by zhx on 2018/7/5.
 */

public interface Map<K,V> {

    V put(K k,V v);

    V get(K x);

    int size();

    public interface Entry<K,V>{

        K getK();

        V getV(K k);
    }

}
