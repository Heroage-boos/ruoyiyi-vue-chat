package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.FriendsMapper;
import com.ruoyi.system.domain.Friends;
import com.ruoyi.system.service.IFriendsService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
@Service
public class FriendsServiceImpl implements IFriendsService 
{
    @Autowired
    private FriendsMapper friendsMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param fId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Friends selectFriendsByFId(Long fId)
    {
        return friendsMapper.selectFriendsByFId(fId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param friends 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Friends> selectFriendsList(Friends friends)
    {
        return friendsMapper.selectFriendsList(friends);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param friends 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertFriends(Friends friends)
    {
        return friendsMapper.insertFriends(friends);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param friends 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateFriends(Friends friends)
    {
        return friendsMapper.updateFriends(friends);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param fIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFriendsByFIds(Long[] fIds)
    {
        return friendsMapper.deleteFriendsByFIds(fIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param fId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFriendsByFId(Long fId)
    {
        return friendsMapper.deleteFriendsByFId(fId);
    }
}
