package com.disheng.dubbo.example.spi.dubbo;

import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * Created by qi.yin at 2019-10-16.
 */
public class Main {
    public static void main(String[] args) {
        ExtensionLoader<DemoService> extensionLoader =
                ExtensionLoader.getExtensionLoader(DemoService.class);

        DemoService demoService = extensionLoader.getExtension("demoService");
        System.out.println(demoService.invoke("test"));

    }
}
