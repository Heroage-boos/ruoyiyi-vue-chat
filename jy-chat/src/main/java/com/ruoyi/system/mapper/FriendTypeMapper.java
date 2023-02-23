package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.FriendType;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
public interface FriendTypeMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param ftId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public FriendType selectFriendTypeByFtId(Long ftId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param friendType 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<FriendType> selectFriendTypeList(FriendType friendType);

    /**
     * 新增【请填写功能名称】
     * 
     * @param friendType 【请填写功能名称】
     * @return 结果
     */
    public int insertFriendType(FriendType friendType);

    /**
     * 修改【请填写功能名称】
     * 
     * @param friendType 【请填写功能名称】
     * @return 结果
     */
    public int updateFriendType(FriendType friendType);

    /**
     * 删除【请填写功能名称】
     * 
     * @param ftId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteFriendTypeByFtId(Long ftId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ftIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFriendTypeByFtIds(Long[] ftIds);
}
