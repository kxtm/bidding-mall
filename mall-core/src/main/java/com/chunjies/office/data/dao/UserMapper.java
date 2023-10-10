package com.chunjies.office.data.dao;

import com.chunjies.office.data.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/15
 * {@code @description}
 */
@Mapper
public interface UserMapper {
    User selectByUserId(String userId);

    int insertUser(User user);

    int updateByUserId(User user);

    int deleteByUserId(String userId);


}
