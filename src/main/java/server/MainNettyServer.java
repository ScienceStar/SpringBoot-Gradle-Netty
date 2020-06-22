package server;

/**
 * @ClassName MainNettyServer
 * @Description: TODO
 * @Author lxc
 * @Date 2020/6/22 12:01
 * @Version V1.0
 **/
public class MainNettyServer {
    /**
     * 端口
     */
    private static int port = 8686;
    public static void main(String[] args) throws Exception {
        /**
         * 启动netty服务器
         */
        NettyServer nettyServer = new NettyServer(port);
        nettyServer.run();
    }
}
