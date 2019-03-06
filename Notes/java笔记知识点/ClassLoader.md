# ClassLoader

种类：

BootStrapClassLoader： c++编写，加载核心库 java.* ，启动类加载器

ExtClassLoader： java编写,加载扩展库javax.*

AppClassLoader：java编写，加载程序所在目录

自定义ClassLoader：java编写，定制化加载



类的加载方式：隐式加载：new；显示加载：loadClass， forName

双亲委派模型，建议看这个 https://blog.csdn.net/huachao1001/article/details/52297075#commentBox

自己理解双亲委派模型其实是一种安全策略，任何类加载都先由父类加载器加载，没有才会给到子类加载



loadClass 与 forName的区别

首先了解类的装载过程：

1、加载通过ClassLoader加载class字节码，生成Class对象。 ClassLoader 调用 loadClass

2、链接：分为三个部分，校验：检查加载的class的正确性和安全性；准备：为类变量分配存储控件并设置初始值；解析：JVM将常量池内的符号引用转换为直接引用。

3、初始化：执行类变量赋值和静态代码块。

Class.forName得到的class是已经完成初始化的。完成了三步了已经。

Class class = Class.forName("类的全限名")；

ClassLoad.loadClass是只完成了第一步的。loadClass作用在用于一些延迟加载中，spring中为了提高速度，用到了很多延迟加载，没有进行初始化，在需要的时候才会进行初始化。



JVM三大性能调优参数

-Xss  规定了每个线程虚拟机栈大小

-Xms java初始容量大小

-Xmx 堆能达到的最大值



堆和栈的区别，Person p = new Person();堆中是一个实例，栈中是一个引用对象

栈可以自动释放，堆需要GC，栈比堆控件小，栈产生的碎片远小于堆。栈支持静态动态分配，堆只有动态分配。栈的效率比堆高

内存分配策略：静态存储，在编译时就确定了每个数据目标在运行时的存储控件需求，不能有可变，嵌套递归的存在

栈式存储：动态存储分配，数据区在编译时位置，在运行时必须要知道大小才可以分配

堆式存储，在编译和运行时模块入口都无法确定，动态分配。



String的intern()方法，手动加到常量池中

jdk6，调用如果常量池中存在对象，返回引用，否则创建添加到常量池，并返回引用。6中放到常量池为副本，两个不同

jdk6+，常量池中闲钱已经创建了字符串对象，返回翅中的引用，否则如果对象在java堆中存在，则将对应引用添加到字符串常量池中，并返回引用，如果对中不存在，在常量池中创建字符串并返回。6+放的是引用相同。

常量池在6中存在永久带中，7以后移动到了堆中。