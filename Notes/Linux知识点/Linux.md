### Linux

体系结构分为用户态和内核态。

内核：实质是一段管理计算机硬件设备的程序。

用户态：就是上层应用



#### 常用指令

##### find

- 如何找到名为xx的文件。 利用 **find**指令在指定目录下查找文件。 find -name “target3.java”   会递归查找当前目录下叫target3.java的文件。
- find / -name "target3.java"   后面跟个 / 就会在根目录进行全局查找。
- find ~  -name "target*"    ~ 是home目录下， * 是表达式可以任意匹配，所以得到的是所有以target开头的，如果还要不区分大小写，需要用iname，find ~  -iname "target*"



##### grep

- grep可以查找文件里符合条件的字符串，打印这一行
- grep “moo” target*，在以target打头的文件中查找 moo所在的行
- grep 'abc' target* | grep -o ‘正则’  过滤出符合正则的内容
- ps -ef | grep tomcat | grep -v '123'   -v过滤掉123的内容，ps是看线程的



##### 管道操作符 |  

- 管道是将左边正确输出 作为右边的输入。并且右边命令需要接收数据，否则左边数据会被抛弃

- 可以利用  find ~ | grep ”target“，这句就会先找到所有 ~ 下的，然后再查找target



##### awk 指令

一次读取一行文本，按输入分隔符进行切片，切成多个组成部分，将切片直接保存在变量中。默认分隔符为空格,切片号从1开始,

- awk '{print $1,$4}' abc.txt  就是列出每一行第一块和第四块的内容
- awk '$1=="tcp" && $2==1 {print $0}' abc.txt
- awk '($1=="tcp" && $2==1 {print $0}) || NR==1' abc.txt，NR就是对应行号。
- awk -F "," '{print $2}' abc.txt   自定义分隔符，-F就是将以，为分割符
- awk '{a[$1]++}END{FOR(i in a)print i "\t" a[i]}'  END是扫描结束，执行后面花括号的内容，前面awk '{a[$1]++}' 就进行了统计放在了一个数组里