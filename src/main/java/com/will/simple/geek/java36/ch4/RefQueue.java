package com.will.simple.geek.java36.ch4;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class RefQueue {

    public void enqueue() throws InterruptedException {
        String obj = new String("a");
        ReferenceQueue<String> refQueue = new ReferenceQueue<>();
        PhantomReference<String> ref = new PhantomReference<>(obj, refQueue);
        obj = null;
        System.gc();
        String refObj = ref.get();
        Reference<? extends String> dequeueRef = refQueue.remove();
        String dequeueObj = dequeueRef.get();
        System.out.println(dequeueObj);
    }
}
