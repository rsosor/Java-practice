package com.macro.demo.designpatterns.prototypepattern;

/**
 * 很多語言都已經內建了 prototype pattern 的這一個介面
 * （Java 是 Cloneable、C# 叫做 Prototype)，很多基礎類裡也已經寫好了 clone()，所以只要引用後實踐即可。
 */
public abstract class ProtoType implements Cloneable{

    public ProtoType clone() throws CloneNotSupportedException {
        return (ProtoType) super.clone();
    }
}
