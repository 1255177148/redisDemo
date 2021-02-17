package com.hezhan.redisdemo;

import com.hezhan.redisdemo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

@SpringBootTest
class RedisdemoApplicationTests {

    @Resource
    private RedisTemplate redisTemplate;

    @Test
    void contextLoads() {
        /**
         * opsForValue  操作字符串 String类型
         * opsForList 操作List
         * opsForSet 操作Set类型
         * opsForZSet 操作ZSet类型
         * opsForHash 操作Hash类型
         * opsForGeo 操作Geospatial类型
         * opsForHyperLogLog 操作HyperLogLog类型
         */
        redisTemplate.opsForHyperLogLog();

        // 创建事务
        redisTemplate.multi();

        // 放弃事务
        redisTemplate.discard();
    }

    @Test
    void test() {
        User user = new User("瞻", 3);
        redisTemplate.opsForValue().set("user", user);
        System.out.println(redisTemplate.opsForValue().get("user"));
    }
}
