package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.UserFriendshipPolicyMapper;
import com.ruoyi.system.domain.UserFriendshipPolicy;
import com.ruoyi.system.service.IUserFriendshipPolicyService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
@Service
public class UserFriendshipPolicyServiceImpl implements IUserFriendshipPolicyService 
{
    @Autowired
    private UserFriendshipPolicyMapper userFriendshipPolicyMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param uFpId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public UserFriendshipPolicy selectUserFriendshipPolicyByUFpId(Long uFpId)
    {
        return userFriendshipPolicyMapper.selectUserFriendshipPolicyByUFpId(uFpId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param userFriendshipPolicy 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<UserFriendshipPolicy> selectUserFriendshipPolicyList(UserFriendshipPolicy userFriendshipPolicy)
    {
        return userFriendshipPolicyMapper.selectUserFriendshipPolicyList(userFriendshipPolicy);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param userFriendshipPolicy 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertUserFriendshipPolicy(UserFriendshipPolicy userFriendshipPolicy)
    {
        return userFriendshipPolicyMapper.insertUserFriendshipPolicy(userFriendshipPolicy);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param userFriendshipPolicy 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateUserFriendshipPolicy(UserFriendshipPolicy userFriendshipPolicy)
    {
        return userFriendshipPolicyMapper.updateUserFriendshipPolicy(userFriendshipPolicy);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param uFpIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteUserFriendshipPolicyByUFpIds(Long[] uFpIds)
    {
        return userFriendshipPolicyMapper.deleteUserFriendshipPolicyByUFpIds(uFpIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param uFpId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteUserFriendshipPolicyByUFpId(Long uFpId)
    {
        return userFriendshipPolicyMapper.deleteUserFriendshipPolicyByUFpId(uFpId);
    }
}
