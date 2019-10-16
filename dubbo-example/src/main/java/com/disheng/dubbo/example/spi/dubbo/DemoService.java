package com.disheng.dubbo.example.spi.dubbo;

import org.apache.dubbo.common.extension.SPI;

/**
 * Created by qi.yin at 2019-10-15.
 */
@SPI
public interface DemoService {

    String invoke(String value);

}
