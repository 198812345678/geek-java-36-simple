### 对java平台的理解

* JRE java runtime environment Java运行时环境，包括JVM和Java类库（TODO native？）
* JDK java development kit 是JRE的超集，同时包括编译器/诊断工具（jmap、jstack）
* JIT just-in-time，动态编译器，在运行时将热点代码（的字节码吧）编译成机器码（TODO 也是针对字节码吧，只是方法维度，而不是一行一行？）
    生成的机器码缓存起来，不用每次运行都解释
* AOT Ahead-of-Time Compilation, Java9，编译时就生成了机器码，运行时直接执行机器码

> 解释执行还是编译执行？指的运行的时候吧，java还是编译语言
>> * 理论上，Java代码被编译成字节码，运行时由JVM将字节码解释成机器码，这是解释执行
>> * 但是JVM厂商实现时会有JIT动态编译，这时候就是编译执行

* 运行时，JVM通过类加载器加载字节码，解释或者编译执行