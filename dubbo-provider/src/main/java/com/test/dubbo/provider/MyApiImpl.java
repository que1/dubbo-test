package com.test.dubbo.provider;

import com.test.dubbo.common.MyApi;
import org.springframework.stereotype.Service;

/**
 * ProjectName: com.test.dubbox.provider
 * ClassName:   MyApi
 * Copyright:
 * Company:     xunlei
 *
 * @author:     queyiwen
 * @version:    1.0
 * @since:      jdk 1.7
 * Create at:   2018/5/25
 * Description:
 * <p>
 * <p>
 * Modification History:
 * Date       Author      Version      Description
 * -------------------------------------------------------------
 *
 *
 */
@Service("myApi")
public class MyApiImpl implements MyApi {

    @Override
    public String sayHello(String name) {
        System.out.println("provider say hello " + name);
        return "hello " + name + "!";
    }

}
