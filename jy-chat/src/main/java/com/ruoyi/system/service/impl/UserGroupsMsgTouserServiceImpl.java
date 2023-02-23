package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.UserGroupsMsgTouserMapper;
import com.ruoyi.system.domain.UserGroupsMsgTouser;
import com.ruoyi.system.service.IUserGroupsMsgTouserService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
@Service
public class UserGroupsMsgTouserServiceImpl implements IUserGroupsMsgTouserService 
{
    @Autowired
    private UserGroupsMsgTouserMapper userGroupsMsgTouserMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param gmId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public UserGroupsMsgTouser selectUserGroupsMsgTouserByGmId(Long gmId)
    {
        return userGroupsMsgTouserMapper.selectUserGroupsMsgTouserByGmId(gmId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param userGroupsMsgTouser 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<UserGroupsMsgTouser> selectUserGroupsMsgTouserList(UserGroupsMsgTouser userGroupsMsgTouser)
    {
        return userGroupsMsgTouserMapper.selectUserGroupsMsgTouserList(userGroupsMsgTouser);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param userGroupsMsgTouser 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertUserGroupsMsgTouser(UserGroupsMsgTouser userGroupsMsgTouser)
    {
        return userGroupsMsgTouserMapper.insertUserGroupsMsgTouser(userGroupsMsgTouser);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param userGroupsMsgTouser 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateUserGroupsMsgTouser(UserGroupsMsgTouser userGroupsMsgTouser)
    {
        return userGroupsMsgTouserMapper.updateUserGroupsMsgTouser(userGroupsMsgTouser);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param gmIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteUserGroupsMsgTouserByGmIds(Long[] gmIds)
    {
        return userGroupsMsgTouserMapper.deleteUserGroupsMsgTouserByGmIds(gmIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param gmId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteUserGroupsMsgTouserByGmId(Long gmId)
    {
        return userGroupsMsgTouserMapper.deleteUserGroupsMsgTouserByGmId(gmId);
    }
}
