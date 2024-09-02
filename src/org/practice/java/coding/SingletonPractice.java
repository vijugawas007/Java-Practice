package org.practice.java.coding;

public class SingletonPractice {

    private static SingletonPractice instance = null;

    static {

    }

    private SingletonPractice() {
        instance =null;
    }

    public synchronized static SingletonPractice getInstance(){
        if(null == instance){
            instance = new SingletonPractice();
        }
        return instance;
    }
}
