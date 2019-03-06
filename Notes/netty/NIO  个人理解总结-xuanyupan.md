## NIO  个人理解总结 - xuanyupan

原始的IO操作是面向流的，当有一个事件要处理，为了达到非阻塞IO就要开启一个专门线程去进行处理；

NIO是面向channel来处理的，利用了buffer缓冲区，数据都是通过channel 和 buffer之间的读写操作完成。利用selector对多个channel进行管理

Selector 与 SelectionKey：Selector 就是一个选择器，可以通道的一个时间处理分发的组件，设置注册我们想要类型的事件，当Selector中有我们想要的类型的时间，就会去执行我们要执行的操作。 SelectionKey 是满足符合事件的一个辅助类，可以通过这个获取通道Channel和Selector ，获取通道和selector对于数据读写有用。



**服务端流程：**

> 1、打开ServerSocketChannel通道 ServerSocketChannel.open()， ServerSocketChannel 是TCP的服务端的通道。
>
> 2、设置为非阻塞。 configureBlocking(false); 其中注意 FileChannle 不能注册
>
> 3、bind 绑定 ip 端口
>
> 4、获取 selector 对象 Selector.open()
>
> 5、将ServerSocketChannel的目标事件注册到 selector 中，serverSocketChannel.register(this.selector, SelectionKey.OP_ACCEPT); 
>
> 这里一共有四种 OP_CONNECT，OP_ACCEPT，OP_READ，OP_WRITE，
>
> 6、 设置轮询监听 selector.select();  有满足的条件时就会去进行相对应的操作，后面读写操作的话还是要建立 channel 和 buffer 进行读写。

**客户端流程：**

> 1、创建通道，直接链接ip和端口，并设置为非阻塞通道
>
> 2、创建选择器，并把想触发事件的通道注册进去
>
> 3、也是利用channel和buffer进行数据读写，达到与服务端数据的通信。



### 客户端与服务端通信

实际上就是 客户端把数据写到一个buffer中，然后用一个channel A读取这个buffer中的数据，再有一个channel B和A进行交互，B再把数据写到一个buffer中，服务端读取。

client ——》 buffer A ——》 channel A《——》channel B——》buffer B——》server

- client  向 buffer A 写数据 就是 buffer A 调用 put 方法写入数据，channel A 调用 write方法写入刚才的buffer 完成了数据从写到 channel的过程。服务端设置监听和选择器，得到符合条件的selectedKeys，再从中获取符合的 channel，调用 channel.read(buffer) 将传过来的通道中的 buffer 读取出来。

- 服务端向客户端发送数据的话，对应 服务端写数据，创建buffer数据，符合可以写条件的 channel调用write方法写入数据。 客户端找到满足读条件的channel，进行读 chananel.read（buffer）。

- 这里面，我理解的中间过程中Selector 和SelectionKey  就起到一个找满足条件通道的一个中间件工具。

- 客户端用的是 SocketChannel ，只能进行connect链接服务器，服务端用的是ServerSocketChannel，是用bind进行绑定，accept 监听接收客户端传来的SocketChannel进行读写操作的也是用SocketChannel