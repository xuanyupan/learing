# 从String到常量池的思考

> 1.String 不可变么？，StringBuffer 与 StringBuilder。str = str + "123"； 深层含义
>
> 2.String对象的创建，与new相关的创建。
>
> 3.== 与 equals
>
> 4.常量池，方法区与堆.创建对象。

## String可变不可变？

- 答案是不可变的，原因是Java 源码中指定了 string是final类型

 ```private final char value[]; ```String底层是字符串数组。

- StringBuffer 与 StringBuilder是可变的，但是StringBuffer是线程安全的，但是速度会相对慢一点；StringBuilder线程不安全，但是速度快，所以如果遇到只是单线程问题，选择用StringBuilder

  > 具体详细写一下两个底层。

- str = str + "123" 为什么在变化？实际上后面是创建了一个新的String对象，然后把这个str指向了新生成的这个对象上



 ## String创建对象

- 我们经常会写 `String str = new String()；` 这一行代码实际上在内存中创建了String，左边的str是指向他的引用。`String str = new String("123");` 这个在内存中实际上创建了两个对象

## == 与 equals



### 常量池，方法区与堆.创建对象。

