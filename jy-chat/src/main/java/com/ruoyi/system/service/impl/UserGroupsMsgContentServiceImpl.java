package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.UserGroupsMsgContentMapper;
import com.ruoyi.system.domain.UserGroupsMsgContent;
import com.ruoyi.system.service.IUserGroupsMsgContentService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
@Service
public class UserGroupsMsgContentServiceImpl implements IUserGroupsMsgContentService 
{
    @Autowired
    private UserGroupsMsgContentMapper userGroupsMsgContentMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param gmId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public UserGroupsMsgContent selectUserGroupsMsgContentByGmId(Long gmId)
    {
        return userGroupsMsgContentMapper.selectUserGroupsMsgContentByGmId(gmId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param userGroupsMsgContent 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<UserGroupsMsgContent> selectUserGroupsMsgContentList(UserGroupsMsgContent userGroupsMsgContent)
    {
        return userGroupsMsgContentMapper.selectUserGroupsMsgContentList(userGroupsMsgContent);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param userGroupsMsgContent 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertUserGroupsMsgContent(UserGroupsMsgContent userGroupsMsgContent)
    {
        return userGroupsMsgContentMapper.insertUserGroupsMsgContent(userGroupsMsgContent);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param userGroupsMsgContent 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateUserGroupsMsgContent(UserGroupsMsgContent userGroupsMsgContent)
    {
        return userGroupsMsgContentMapper.updateUserGroupsMsgContent(userGroupsMsgContent);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param gmIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteUserGroupsMsgContentByGmIds(Long[] gmIds)
    {
        return userGroupsMsgContentMapper.deleteUserGroupsMsgContentByGmIds(gmIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param gmId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteUserGroupsMsgContentByGmId(Long gmId)
    {
        return userGroupsMsgContentMapper.deleteUserGroupsMsgContentByGmId(gmId);
    }
}
