package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.UserGroupsMapper;
import com.ruoyi.system.domain.UserGroups;
import com.ruoyi.system.service.IUserGroupsService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
@Service
public class UserGroupsServiceImpl implements IUserGroupsService 
{
    @Autowired
    private UserGroupsMapper userGroupsMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param ugId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public UserGroups selectUserGroupsByUgId(Long ugId)
    {
        return userGroupsMapper.selectUserGroupsByUgId(ugId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param userGroups 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<UserGroups> selectUserGroupsList(UserGroups userGroups)
    {
        return userGroupsMapper.selectUserGroupsList(userGroups);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param userGroups 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertUserGroups(UserGroups userGroups)
    {
        return userGroupsMapper.insertUserGroups(userGroups);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param userGroups 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateUserGroups(UserGroups userGroups)
    {
        return userGroupsMapper.updateUserGroups(userGroups);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ugIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteUserGroupsByUgIds(Long[] ugIds)
    {
        return userGroupsMapper.deleteUserGroupsByUgIds(ugIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param ugId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteUserGroupsByUgId(Long ugId)
    {
        return userGroupsMapper.deleteUserGroupsByUgId(ugId);
    }
}
