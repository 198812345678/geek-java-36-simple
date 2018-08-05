### Exception和Error有什么区别？

* Exception 和 Error都继承了Throwable，都可以被捕获

> NoClassDefFoundError和ClassNotFoundException的不同
>> * 两个都是运行时出现
>> * ClassNotFoundException编译时对应class或许有，或许没有；NoClassDefFoundError编译时是有对应class的
>> * ClassNotFoundException通过反射加载对应class但不存在时出现，比如使用Class.forName(), ClassLoader.loadClass() and ClassLoader.findSystemClass()
>> * NoClassDefFoundError现象类似于，编译完成后，把class文件删除掉（或者对JVM来说不是同一个class），然后运行时就报错了
>> * NoClassDefFoundError导致启动失败，ClassNotFoundException只是运行时抛异常
>> * [ClassNotFoundException vs. NoClassDefFoundError](https://dzone.com/articles/java-classnotfoundexception-vs-noclassdeffounderro)
>> * [What causes and what are the differences between NoClassDefFoundError and ClassNotFoundException?](https://stackoverflow.com/questions/1457863/what-causes-and-what-are-the-differences-between-noclassdeffounderror-and-classn)


* Error导致JVM本身不正常运行，比如OOM

* 为方便阅读，应该catch明确的异常，另外可能有人希望RuntimeException扩散出去，不应该在较底层被捕获
* Throw early, catch late 比如NPE在底层可能被包装，或者造成比较深的异常堆栈，不直观，所以被throw early比较直观；catch late 在更高层面，因为有了清晰的（业务）逻辑，往往会更清楚合适的处理方式是什么
* try-catch有性能开销，影响JVM优化，不应该利用异常控制代码流程
* 实例化exception会对现场的堆栈进行快照，比较重