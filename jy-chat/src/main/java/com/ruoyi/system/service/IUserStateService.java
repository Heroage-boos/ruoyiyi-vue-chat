package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.UserState;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
public interface IUserStateService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param usId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public UserState selectUserStateByUsId(Long usId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param userState 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<UserState> selectUserStateList(UserState userState);

    /**
     * 新增【请填写功能名称】
     * 
     * @param userState 【请填写功能名称】
     * @return 结果
     */
    public int insertUserState(UserState userState);

    /**
     * 修改【请填写功能名称】
     * 
     * @param userState 【请填写功能名称】
     * @return 结果
     */
    public int updateUserState(UserState userState);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param usIds 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteUserStateByUsIds(Long[] usIds);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param usId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteUserStateByUsId(Long usId);
}
