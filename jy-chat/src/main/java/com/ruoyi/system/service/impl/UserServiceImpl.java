package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.UserMapper;
import com.ruoyi.system.domain.User;
import com.ruoyi.system.service.IUserService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
@Service
public class UserServiceImpl implements IUserService 
{
    @Autowired
    private UserMapper userMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param uId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public User selectUserByUId(Long uId)
    {
        return userMapper.selectUserByUId(uId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param user 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<User> selectUserList(User user)
    {
        return userMapper.selectUserList(user);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param user 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertUser(User user)
    {
        return userMapper.insertUser(user);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param user 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateUser(User user)
    {
        return userMapper.updateUser(user);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param uIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteUserByUIds(Long[] uIds)
    {
        return userMapper.deleteUserByUIds(uIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param uId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteUserByUId(Long uId)
    {
        return userMapper.deleteUserByUId(uId);
    }
}
