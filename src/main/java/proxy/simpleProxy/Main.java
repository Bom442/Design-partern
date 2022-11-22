package proxy.simpleProxy;

public class Main {

    public static void main(String[] args) {
        SmsService smsService = new SmsServiceImpl();
        SmsProxy proxy = new SmsProxy(smsService);
        proxy.send("java");
    }

}
