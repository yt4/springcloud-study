package com.yt4code.springcloud.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yt
 * @date 2020/4/1 9:49
 * 功能说明
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {

    private Integer code;
    private String msg;
    private T data;

    public CommonResult(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }


}
