### 强引用、软引用、弱引用、幻象引用有什么区别？

> 强引用 
>> 普通引用，比如指向new出来的对象的引用，只要有强引用就不会被垃圾回收
>> 超出作用域或者赋值为null就可以被回收

> 软引用
>> 当JVM空间充足时，不会回收软引用指向的对象（TODO 是年轻代回收吗），
>> JVM 会确保在抛出 OutOfMemoryError 之前，清理软引用指向的对象
>> 如果还有空闲内存，就可以暂时保留缓存，当内存不足时清理掉

> 弱引用
>> 不能豁免垃圾回收，只是提供一种访问对象的途径
>> 如果试图获取时对象还在，就使用它，否则重现实例化

> 虚引用
>> TODO

* TODO 这几种引用之间有没有流转机制(无人工干预的)？

* 不同类型的引用之间怎么流转? get出来，用get的结果构造成其他类型的引用

* 引用队列，构造引用的时候，注册到一个引用队列上，当对象被GC之前，引用会入队，但是不能通过入队的引用再引用到对象，入队动作可以作为对象被GC前一些动作的触发
(TODO 弱引用和虚引用在引用队列中不同)

