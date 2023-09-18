package com.chunjies.office.common.base;

import java.util.Date;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/15
 * {@code @description}
 */
public abstract class IEntity {
    //序列主键 无意义不要当业务主键，不要传给接口
    private Long id;
    private String createPk;
    private String createBy;

    private Date createTime;

    private String modifyPk;
    private String modifyBy;
    private Date modifyTime;


}
