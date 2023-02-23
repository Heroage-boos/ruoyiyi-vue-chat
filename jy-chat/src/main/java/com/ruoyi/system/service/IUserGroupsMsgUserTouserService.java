package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.UserGroupsMsgUserTouser;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
public interface IUserGroupsMsgUserTouserService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param gm Id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public UserGroupsMsgUserTouser selectUserGroupsMsgUserTouserByGmId(Long gmId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param userGroupsMsgUserTouser 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<UserGroupsMsgUserTouser> selectUserGroupsMsgUserTouserList(UserGroupsMsgUserTouser userGroupsMsgUserTouser);

    /**
     * 新增【请填写功能名称】
     * 
     * @param userGroupsMsgUserTouser 【请填写功能名称】
     * @return 结果
     */
    public int insertUserGroupsMsgUserTouser(UserGroupsMsgUserTouser userGroupsMsgUserTouser);

    /**
     * 修改【请填写功能名称】
     * 
     * @param userGroupsMsgUserTouser 【请填写功能名称】
     * @return 结果
     */
    public int updateUserGroupsMsgUserTouser(UserGroupsMsgUserTouser userGroupsMsgUserTouser);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param gm Ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteUserGroupsMsgUserTouserByGmIds(Long[] gmIds);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param gm Id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteUserGroupsMsgUserTouserByGmId(Long gmId);
}
