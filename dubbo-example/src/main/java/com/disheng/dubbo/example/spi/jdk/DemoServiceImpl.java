package com.disheng.dubbo.example.spi.jdk;

/**
 * Created by qi.yin at 2019-10-15.
 */
public class DemoServiceImpl implements DemoService {

    public String invoke(String value) {
        return "Hello JDK SPI " + value;
    }
}
