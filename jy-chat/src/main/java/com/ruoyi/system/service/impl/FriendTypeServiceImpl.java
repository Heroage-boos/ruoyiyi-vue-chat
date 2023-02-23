package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.FriendTypeMapper;
import com.ruoyi.system.domain.FriendType;
import com.ruoyi.system.service.IFriendTypeService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
@Service
public class FriendTypeServiceImpl implements IFriendTypeService 
{
    @Autowired
    private FriendTypeMapper friendTypeMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param ftId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public FriendType selectFriendTypeByFtId(Long ftId)
    {
        return friendTypeMapper.selectFriendTypeByFtId(ftId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param friendType 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<FriendType> selectFriendTypeList(FriendType friendType)
    {
        return friendTypeMapper.selectFriendTypeList(friendType);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param friendType 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertFriendType(FriendType friendType)
    {
        return friendTypeMapper.insertFriendType(friendType);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param friendType 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateFriendType(FriendType friendType)
    {
        return friendTypeMapper.updateFriendType(friendType);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ftIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFriendTypeByFtIds(Long[] ftIds)
    {
        return friendTypeMapper.deleteFriendTypeByFtIds(ftIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param ftId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFriendTypeByFtId(Long ftId)
    {
        return friendTypeMapper.deleteFriendTypeByFtId(ftId);
    }
}
