package jdk.collection.hashmap;

/**
 * Created by zhx on 2018/7/5.
 * @see java.util.HashMap
 */

public class HashMap<K, V> implements Map<K, V> {

    private static final int DEFUALT_CAPACITY = 16;

    private static final double DEFUALT_EXTENTION = 0.75;


    private Entry<K, V>[] table = null;

    //计算扩容后table大小的因子 DEFUALT_CAPACITY=16 ： 2 32：
    private int threshold = 0;

    public HashMap(){
        this();
    }

    public HashMap(int newCapacity,double ex){
        DEFUALT_CAPACITY = newCapacity;
    }

    @Override
    public V put(K k, V v) {
        return v;
    }

    @Override
    public V get(K k) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    class Entry<K, V> implements Map.Entry<K, V> {

        int hash;

        K k;

        V v;

        Map.Entry<K, V> next;

        public Entry(int hash, K k, V v) {
            this.hash = hash;
            this.k = k;
            this.v = v;
        }

        @Override
        public K getK() {
            return k;
        }

        @Override
        public V getV(K k) {
            return v;
        }
    }

}
