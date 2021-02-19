package com.hezhan.redisdemo.util;

import org.springframework.stereotype.Component;

/**
 * 类型转换工具类
 * @Date 2021/2/19 17:58
 * @Author hezhan
 */
@Component
public class ConversionUtil {

    /**
     * Object类型转为String类型
     * @param o 要转换的值
     * @return
     */
    public String toString(Object o){
        return o == null ? null : o.toString();
    }
}
