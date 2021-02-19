package com.hezhan.redisdemo.service.impl;

import com.hezhan.redisdemo.entity.User;
import com.hezhan.redisdemo.service.TestService;
import com.hezhan.redisdemo.util.ConversionUtil;
import com.hezhan.redisdemo.util.RedisUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Date 2021/2/19 17:54
 * @Author hezhan
 */
@Service
public class TestServiceImpl implements TestService {

    @Resource
    private RedisUtil redisUtil;

    @Resource
    private ConversionUtil conversionUtil;

    @Override
    public String test() {
        String key = "user";
        String value = conversionUtil.toString(redisUtil.get(key));
        if (value != null){
            return value;
        }
        User user = new User("瞻", 3);
        redisUtil.set(key, user, 3);
        return conversionUtil.toString(redisUtil.get(key));
    }
}
