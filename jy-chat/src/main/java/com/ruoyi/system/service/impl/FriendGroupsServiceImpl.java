package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.FriendGroupsMapper;
import com.ruoyi.system.domain.FriendGroups;
import com.ruoyi.system.service.IFriendGroupsService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
@Service
public class FriendGroupsServiceImpl implements IFriendGroupsService 
{
    @Autowired
    private FriendGroupsMapper friendGroupsMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param fgId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public FriendGroups selectFriendGroupsByFgId(Long fgId)
    {
        return friendGroupsMapper.selectFriendGroupsByFgId(fgId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param friendGroups 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<FriendGroups> selectFriendGroupsList(FriendGroups friendGroups)
    {
        return friendGroupsMapper.selectFriendGroupsList(friendGroups);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param friendGroups 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertFriendGroups(FriendGroups friendGroups)
    {
        return friendGroupsMapper.insertFriendGroups(friendGroups);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param friendGroups 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateFriendGroups(FriendGroups friendGroups)
    {
        return friendGroupsMapper.updateFriendGroups(friendGroups);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param fgIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFriendGroupsByFgIds(Long[] fgIds)
    {
        return friendGroupsMapper.deleteFriendGroupsByFgIds(fgIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param fgId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFriendGroupsByFgId(Long fgId)
    {
        return friendGroupsMapper.deleteFriendGroupsByFgId(fgId);
    }
}
