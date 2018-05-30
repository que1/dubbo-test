package com.test.dubbo.consumer.test;

import com.test.dubbo.api.TestApi;
import com.test.dubbo.common.MyApi;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * ProjectName: com.test.dubbox.consumer.test
 * ClassName:   ConsumerTest
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
public class ConsumerTest {

    //
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:dubbo-consumer-spring.xml"});
        context.start();

        for (int i = 0; i < 10; i++) {
            MyApi myApi = (MyApi) context.getBean("myApi");
            String result = myApi.sayHello("Jack");
            System.out.println(result);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("------------------------------------");

        for (int i = 0; i < 10; i++) {
            TestApi testApi = (TestApi) context.getBean("testApi");
            String execute = testApi.execute("abc");
            System.out.println(execute);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
