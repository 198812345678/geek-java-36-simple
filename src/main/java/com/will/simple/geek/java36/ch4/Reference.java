package com.will.simple.geek.java36.ch4;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 *
 */
public class Reference {

    /**
     * gc之后，软引用指向的对象没有被回收
     */
    public void softReference() {
        String str = new String("3");
        System.out.println(str);
        SoftReference<String> softReference = new SoftReference<String>(str);
        str = null;
        System.gc();
        String strSoftRef = softReference.get();
        System.out.println(str);
    }

    /**
     * gc之后弱引用指向null，原来指向的对象被回收
     */
    public void weakRef() {
        String str = new String("3");
        System.out.println(str);
        WeakReference<String> weakRef = new WeakReference<>(str);
        str = null;
        System.gc();
        String strWeakRef = weakRef.get();
        System.out.println(str);
    }

    /**
     * 因为有str2是强引用，所以对象不会被回收，那么弱引用也还有对象指向
     */
    public void weakRef2() {
        String str = new String("3");
        String str2 = str;
        System.out.println(str);
        WeakReference<String> weakRef = new WeakReference<>(str);
        str = null;
        System.gc();
        String strWeakRef = weakRef.get();
        System.out.println(str);
    }

    /**
     * get到弱引用指向的对象，并让强引用指向这个对象，那么GC不会回收该对象
     */
    public void weakRef3() {
        String str = new String("3");
        System.out.println(str);
        WeakReference<String> weakRef = new WeakReference<>(str);
        str = null;
        String strWeakRef = weakRef.get();
//        String str2 = strWeakRef;
        System.gc();
        System.out.println(str);
    }
}
