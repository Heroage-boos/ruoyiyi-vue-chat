package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Friends;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
public interface FriendsMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param fId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Friends selectFriendsByFId(Long fId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param friends 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Friends> selectFriendsList(Friends friends);

    /**
     * 新增【请填写功能名称】
     * 
     * @param friends 【请填写功能名称】
     * @return 结果
     */
    public int insertFriends(Friends friends);

    /**
     * 修改【请填写功能名称】
     * 
     * @param friends 【请填写功能名称】
     * @return 结果
     */
    public int updateFriends(Friends friends);

    /**
     * 删除【请填写功能名称】
     * 
     * @param fId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteFriendsByFId(Long fId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param fIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFriendsByFIds(Long[] fIds);
}
