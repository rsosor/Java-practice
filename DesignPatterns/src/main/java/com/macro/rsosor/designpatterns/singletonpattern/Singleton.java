package com.macro.rsosor.designpatterns.singletonpattern;

public class Singleton {

    private volatile static Singleton instance;     // volatile 保證從主記憶體讀取，並且以 DCL 寫法完成單例模式

    private static final Object syncLock = new Object();

    private Singleton() {}

    // 可能整個系統都要存取這個類別，可能有多個 process 或 thread 同時存取
    // 為了讓線程安全添加 synchronized
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (syncLock) {   // synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                    /**
                     給 Singleton 的實例分配記憶體；
                     呼叫 Singleton 的建構函數，初始化成員欄位；
                     將 instance 物件指向分配的記憶體空間(此時 instance 不是 null )。
                     **/
                }
            }
        }
        return instance;
    }

    // 如果該對象被用於序列化，可以保證對象在序列化前後保持一致
    private Object readResolve() {
        return instance;
    }
}
