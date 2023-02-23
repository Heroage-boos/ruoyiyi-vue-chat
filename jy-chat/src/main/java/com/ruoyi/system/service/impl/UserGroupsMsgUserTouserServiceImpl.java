package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.UserGroupsMsgUserTouserMapper;
import com.ruoyi.system.domain.UserGroupsMsgUserTouser;
import com.ruoyi.system.service.IUserGroupsMsgUserTouserService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
@Service
public class UserGroupsMsgUserTouserServiceImpl implements IUserGroupsMsgUserTouserService 
{
    @Autowired
    private UserGroupsMsgUserTouserMapper userGroupsMsgUserTouserMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param gmId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public UserGroupsMsgUserTouser selectUserGroupsMsgUserTouserByGmId(Long gmId)
    {
        return userGroupsMsgUserTouserMapper.selectUserGroupsMsgUserTouserByGmId(gmId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param userGroupsMsgUserTouser 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<UserGroupsMsgUserTouser> selectUserGroupsMsgUserTouserList(UserGroupsMsgUserTouser userGroupsMsgUserTouser)
    {
        return userGroupsMsgUserTouserMapper.selectUserGroupsMsgUserTouserList(userGroupsMsgUserTouser);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param userGroupsMsgUserTouser 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertUserGroupsMsgUserTouser(UserGroupsMsgUserTouser userGroupsMsgUserTouser)
    {
        return userGroupsMsgUserTouserMapper.insertUserGroupsMsgUserTouser(userGroupsMsgUserTouser);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param userGroupsMsgUserTouser 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateUserGroupsMsgUserTouser(UserGroupsMsgUserTouser userGroupsMsgUserTouser)
    {
        return userGroupsMsgUserTouserMapper.updateUserGroupsMsgUserTouser(userGroupsMsgUserTouser);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param gmIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteUserGroupsMsgUserTouserByGmIds(Long[] gmIds)
    {
        return userGroupsMsgUserTouserMapper.deleteUserGroupsMsgUserTouserByGmIds(gmIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param gmId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteUserGroupsMsgUserTouserByGmId(Long gmId)
    {
        return userGroupsMsgUserTouserMapper.deleteUserGroupsMsgUserTouserByGmId(gmId);
    }
}
