地址栏键入http的url，按下回车后的流程。

> DNS解析，解析url对应的IP地址，浏览器缓存，系统缓存，路由器缓存。。。找到ip后直接返回
>
> 根据目标IP 建立TCP连接，3次握手
>
> 发起读取文件的http请求，发送给服务器
>
> 服务器处理请求并返回带有html的http报文
>
> 浏览器接收html信息，解析渲染页面，链接结束，4次挥手.



### HTTP 状态码：

- 具体看图片，上传在md中出现了问题



### 常见的状态码：

- 200 OK： 正常返回
- 400 Bad Resquest： 客户端请求有语法错误，不能被服务器理解
- 401 Unauthorized ：请求未授权，该状态码必须和WWW-Authenticate 报头域一起使用
- 403 Forbidden：服务器收到请求，由于某种原因但是拒绝访问，如IP被禁
- 404 Not Found：请求资源不存在，或者错误URL
- 500 Internal Server Error： 服务器发生不可预期的错误，server错误
- 503 Server Unavailable： 服务器当前不能处理客户端的请求，比如服务器连接池满了



### GET请求与POST请求区别

- Http 报文层面：GET将请求信息，参数放在URL，POST放在报文体中，请求正文中会有相关信息，安全性上post会稍微好一点，但是实际上获取报文体也很简单，主要安全还是要看https。但是注意 url有长度限制
- 数据库层面，GET符合幂等性和安全性，做的是查询操作。POST请求不符合，POST在数据库中提交数据，且每次请求结果都有可能不一样。幂等性对数据库一次多次操作结果一样。安全性不改变数据库数据。
- GET请求可以被缓存，POST不行



#### Cookie 与 Session的区别

- cookie是由服务器发送给客户端的特殊信息，以文本文件存在客户端上。客户端以后向服务器发送请求都会带着这些特殊信息。服务器接受到客户端的cookie，解析生成客户端对应的内容。

![1547085188830](C:\Users\xuanyupan\AppData\Roaming\Typora\typora-user-images\1547085188830.png)



- session是服务端的机制，服务器利用类似散列表结构存储session信息，服务器检查这个请求中是否包含sessionid，存在服务器就检索这个seesion的信息，如果没有则创建并会发给客户端。session实现两种方式，cookie和url回写，都与jsessionid参数相关
- cookie存放在客户端浏览器上，session存放在服务器上，所以session相对与cookie更安全，cookie可以减轻服务器负担



### HTTTP 与 HTTPS

HTTPS 需要得到CA证书，HTTP不需要

HTTPS 有SSL 协议，使用SSL密文传输，http明文传输

HTTPS 默认 443 端口，HTTP 默认 80 端口

HTTPS = HTTP + 加密 + 认证 + 完整性保护，更安全