package com.likejian.test.test.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.likejian.test.test.dubbo.DubboServie;

/**
 * @author likejian
 * @date 2019/6/23
 */
@Service(version = "1.0.0")
public class DubboServieImpl implements DubboServie {
    @Override
    public String hellDubbo() {
        return "dubbo service";
    }
}
