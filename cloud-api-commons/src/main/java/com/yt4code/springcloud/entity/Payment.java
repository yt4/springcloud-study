package com.yt4code.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author yt
 * @date 2020/4/1 10:57
 * 功能说明
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    private static final long serialVersionUID = 171409507960586264L;
    /**
     * 主键
     */
    @Id
    private Long id;
    /**
     * 支付流水号
     */
    private String serial;
}
