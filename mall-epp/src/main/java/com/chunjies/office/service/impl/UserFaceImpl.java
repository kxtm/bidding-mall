package com.chunjies.office.service.impl;

import com.chunjies.office.service.IUserFace;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/19
 * {@code @description}
 */
@Service("userFace")
public class UserFaceImpl implements IUserFace {








    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
