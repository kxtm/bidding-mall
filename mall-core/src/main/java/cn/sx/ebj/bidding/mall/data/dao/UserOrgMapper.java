package cn.sx.ebj.bidding.mall.data.dao;

import cn.sx.ebj.bidding.mall.data.entity.UserOrg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserOrgMapper {
    UserOrg selectByUserId(String userId);
    int insertUserOrg(UserOrg userOrg);
    int updateUserOrg(UserOrg record);
    int deleteUserOrg(@Param("userId") String userId, @Param("orgId") String orgId);

}