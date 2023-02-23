package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.UserGroupsTouserMapper;
import com.ruoyi.system.domain.UserGroupsTouser;
import com.ruoyi.system.service.IUserGroupsTouserService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
@Service
public class UserGroupsTouserServiceImpl implements IUserGroupsTouserService 
{
    @Autowired
    private UserGroupsTouserMapper userGroupsTouserMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param ugId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public UserGroupsTouser selectUserGroupsTouserByUgId(Long ugId)
    {
        return userGroupsTouserMapper.selectUserGroupsTouserByUgId(ugId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param userGroupsTouser 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<UserGroupsTouser> selectUserGroupsTouserList(UserGroupsTouser userGroupsTouser)
    {
        return userGroupsTouserMapper.selectUserGroupsTouserList(userGroupsTouser);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param userGroupsTouser 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertUserGroupsTouser(UserGroupsTouser userGroupsTouser)
    {
        return userGroupsTouserMapper.insertUserGroupsTouser(userGroupsTouser);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param userGroupsTouser 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateUserGroupsTouser(UserGroupsTouser userGroupsTouser)
    {
        return userGroupsTouserMapper.updateUserGroupsTouser(userGroupsTouser);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ugIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteUserGroupsTouserByUgIds(Long[] ugIds)
    {
        return userGroupsTouserMapper.deleteUserGroupsTouserByUgIds(ugIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param ugId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteUserGroupsTouserByUgId(Long ugId)
    {
        return userGroupsTouserMapper.deleteUserGroupsTouserByUgId(ugId);
    }
}
