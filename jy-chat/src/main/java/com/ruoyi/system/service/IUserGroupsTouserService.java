package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.UserGroupsTouser;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
public interface IUserGroupsTouserService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param ugId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public UserGroupsTouser selectUserGroupsTouserByUgId(Long ugId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param userGroupsTouser 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<UserGroupsTouser> selectUserGroupsTouserList(UserGroupsTouser userGroupsTouser);

    /**
     * 新增【请填写功能名称】
     * 
     * @param userGroupsTouser 【请填写功能名称】
     * @return 结果
     */
    public int insertUserGroupsTouser(UserGroupsTouser userGroupsTouser);

    /**
     * 修改【请填写功能名称】
     * 
     * @param userGroupsTouser 【请填写功能名称】
     * @return 结果
     */
    public int updateUserGroupsTouser(UserGroupsTouser userGroupsTouser);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ugIds 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteUserGroupsTouserByUgIds(Long[] ugIds);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param ugId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteUserGroupsTouserByUgId(Long ugId);
}
