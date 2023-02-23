package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.FriendGroups;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
public interface IFriendGroupsService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param fgId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public FriendGroups selectFriendGroupsByFgId(Long fgId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param friendGroups 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<FriendGroups> selectFriendGroupsList(FriendGroups friendGroups);

    /**
     * 新增【请填写功能名称】
     * 
     * @param friendGroups 【请填写功能名称】
     * @return 结果
     */
    public int insertFriendGroups(FriendGroups friendGroups);

    /**
     * 修改【请填写功能名称】
     * 
     * @param friendGroups 【请填写功能名称】
     * @return 结果
     */
    public int updateFriendGroups(FriendGroups friendGroups);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param fgIds 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteFriendGroupsByFgIds(Long[] fgIds);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param fgId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteFriendGroupsByFgId(Long fgId);
}
