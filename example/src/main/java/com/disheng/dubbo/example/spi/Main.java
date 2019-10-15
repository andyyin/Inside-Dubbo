package com.disheng.dubbo.example.spi;

import com.sun.tools.javac.util.ServiceLoader;
import java.util.function.Consumer;

/**
 * Created by qi.yin at 2019-10-15.
 */
public class Main {

    public static void main(String[] args) {

        ServiceLoader<DemoService> loader = ServiceLoader.load(DemoService.class);
        loader.forEach(new Consumer<DemoService>() {
            @Override
            public void accept(DemoService demoService) {
                System.out.println(demoService.invoke("test"));
            }
        });

    }
}
