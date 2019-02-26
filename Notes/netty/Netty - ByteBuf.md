Netty - ByteBuf

ByteBuf  有三个重要的参数，当前读指针的位置readIndex，当前写指针的位置writeIndex, capacity 具体当前最大容量， 突破最大容量会进行扩容。

ByteBuf，可以分为堆内内存，堆外内存；或者可以分为 

 

再次理解netty中pipline与ChannnelHandler以及Bytebuf，了解。现在ByteToMessageDecoder对SimpleChannelInboundHandler，ChannelInboundHandlerAdapter 这些类运用还不是很熟练。

完成对项目中自定义的pdu协议的解析。

利用FixedChannelPool完成通道复用。服务端不需进行改动。需在客户端创建连接池。

客户端：创建bootstrap启动器，设置对应的属性等。创建连接池，这里需要实现AbstractChannelPoolMap，绑定我们刚才创建的bootstrap（需要绑定地址），我们自定义的连接池处理（实现ChannelPoolHandler接口），设置最大的channel连接数。

实现的ChannelPoolHandler接口中，我们需要完成三个方法的重写，分别对应 channel创建，获取，释放时对应的事件。在channel创建中，我们需要给channel的pipeline中添加具体的handle（对数据的读写在这里实现）。 这里测试数据发现，第一次获取通道时走的是通道创建，而不会再次获取，用完会直接释放。在通道完成后，需要及时调用pool.release(channel)完成对通道的释放。注意拆包和粘包过程中，需要在服务端和客户端的handle中都要加上对应处理数据的拆包器。



1、是实现一个模块
2、完成自定义协议的传输，
3、正确处理拆包粘包问题，需重构自己实现拆包方法。
4、实现多线程通讯
5、完成服务端channel复用，最大化合理创建释放资源。
6、如何选择最优的方式写入kafka。

重写拆包器，累积重传。服务端的channel复用。