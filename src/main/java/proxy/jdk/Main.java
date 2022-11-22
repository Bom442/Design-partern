package proxy.jdk;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        SmsService proxyInstance = (SmsService) Proxy.newProxyInstance(ServiceImpl.class.getClassLoader(),
            new Class[]{SmsService.class},
            new DebugInvocationHandler(new ServiceImpl()));
        /**
         * 1.目标类的类加载器
         * 2.代理需要实现的接口
         * 3.代理对象对应的自定义InvocationHandler
         */
        proxyInstance.send("hello");

    }

}
