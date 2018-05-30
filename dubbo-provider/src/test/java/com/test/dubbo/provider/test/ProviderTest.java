package com.test.dubbo.provider.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * ProjectName: com.test.dubbox.provider.test
 * ClassName:   ProviderTests
 * Copyright:
 * Company:     xunlei
 * @author:     queyiwen
 * @version:    1.0
 * @since:      jdk 1.7
 * Create at:   2018/5/26
 * Description:
 * <p>
 * <p>
 * Modification History:
 * Date       Author      Version      Description
 * -------------------------------------------------------------
 *
 *
 */
public class ProviderTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:dubbo-provider-spring.xml"});
        context.start();

        System.out.println("dubbo-provider start...");

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
