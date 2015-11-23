package ex7_1;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class RWL {

    static class Dict {

        Map<Integer,Double> data = new HashMap();
        ReadWriteLock rwl = new ReentrantReadWriteLock(true);
        Lock readLock = rwl.readLock();
        Lock writeLock = rwl.writeLock();

        public void put(Integer key, Double value) {
            writeLock.lock();
            try {
                data.put(key, value);
            } finally {
                writeLock.unlock();
            }
        }

        public Double get(Integer key) {
            readLock.lock();
            try {
                return data.get(key);
            } finally {
                readLock.unlock();
            }
        }

        public void Print(){
            System.out.print(data);
        }

    }

}