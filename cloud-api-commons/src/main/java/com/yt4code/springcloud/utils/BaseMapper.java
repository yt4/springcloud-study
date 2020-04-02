package com.yt4code.springcloud.utils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author liuwentao
 * @date 2019/5/14
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
