package com.test.dubbo.provider;

import com.test.dubbo.api.TestApi;
import org.springframework.stereotype.Service;

/**
 * ProjectName: com.test.dubbox.provider
 * ClassName:   TestApiImpl
 * Copyright:
 * Company:     xunlei
 *
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
@Service("testApi")
public class TestApiImpl implements TestApi {

    @Override
    public String execute(String name) {
        System.out.println("provider execute: " + name);
        return "execute: " + name;
    }

}
