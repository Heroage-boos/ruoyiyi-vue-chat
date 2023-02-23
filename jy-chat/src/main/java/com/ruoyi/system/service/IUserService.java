package com.ruoyi.system.service;

import java.util.List;

import com.ruoyi.system.domain.User;
import com.ruoyi.system.domain.User;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
public interface IUserService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param uId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public User selectUserByUId(Long uId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param user 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<User> selectUserList(User user);

    /**
     * 新增【请填写功能名称】
     * 
     * @param user 【请填写功能名称】
     * @return 结果
     */
    public int insertUser(User user);

    /**
     * 修改【请填写功能名称】
     * 
     * @param user 【请填写功能名称】
     * @return 结果
     */
    public int updateUser(User user);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param uIds 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteUserByUIds(Long[] uIds);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param uId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteUserByUId(Long uId);
}
