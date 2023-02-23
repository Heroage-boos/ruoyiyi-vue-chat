package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.UserStateMapper;
import com.ruoyi.system.domain.UserState;
import com.ruoyi.system.service.IUserStateService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
@Service
public class UserStateServiceImpl implements IUserStateService 
{
    @Autowired
    private UserStateMapper userStateMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param usId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public UserState selectUserStateByUsId(Long usId)
    {
        return userStateMapper.selectUserStateByUsId(usId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param userState 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<UserState> selectUserStateList(UserState userState)
    {
        return userStateMapper.selectUserStateList(userState);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param userState 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertUserState(UserState userState)
    {
        return userStateMapper.insertUserState(userState);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param userState 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateUserState(UserState userState)
    {
        return userStateMapper.updateUserState(userState);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param usIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteUserStateByUsIds(Long[] usIds)
    {
        return userStateMapper.deleteUserStateByUsIds(usIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param usId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteUserStateByUsId(Long usId)
    {
        return userStateMapper.deleteUserStateByUsId(usId);
    }
}
