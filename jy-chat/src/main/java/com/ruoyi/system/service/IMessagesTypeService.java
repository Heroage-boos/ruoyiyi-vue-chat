package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.MessagesType;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
public interface IMessagesTypeService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param mtId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public MessagesType selectMessagesTypeByMtId(Long mtId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param messagesType 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<MessagesType> selectMessagesTypeList(MessagesType messagesType);

    /**
     * 新增【请填写功能名称】
     * 
     * @param messagesType 【请填写功能名称】
     * @return 结果
     */
    public int insertMessagesType(MessagesType messagesType);

    /**
     * 修改【请填写功能名称】
     * 
     * @param messagesType 【请填写功能名称】
     * @return 结果
     */
    public int updateMessagesType(MessagesType messagesType);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param mtIds 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteMessagesTypeByMtIds(Long[] mtIds);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param mtId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteMessagesTypeByMtId(Long mtId);
}
