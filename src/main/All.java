package main;

import frame.mqtt.MqttClientUtil;

import java.util.Scanner;

/**
 * @author zx
 */
public class All {
    public static void main(String[] args){
        //mqtt服务启动
        MqttClientUtil.createClient();
        try {
            Thread.sleep(3000);
            MqttClientUtil.publish_common("xxxxxxxx","{\"msgType\":192,\"addr\":3,\"msg\":\"Helloworld!\"}");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                try {
                    //释放工作
                    //...

                } catch (Throwable e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
