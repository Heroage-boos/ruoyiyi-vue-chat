package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.MessagesTypeMapper;
import com.ruoyi.system.domain.MessagesType;
import com.ruoyi.system.service.IMessagesTypeService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
@Service
public class MessagesTypeServiceImpl implements IMessagesTypeService 
{
    @Autowired
    private MessagesTypeMapper messagesTypeMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param mtId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public MessagesType selectMessagesTypeByMtId(Long mtId)
    {
        return messagesTypeMapper.selectMessagesTypeByMtId(mtId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param messagesType 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<MessagesType> selectMessagesTypeList(MessagesType messagesType)
    {
        return messagesTypeMapper.selectMessagesTypeList(messagesType);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param messagesType 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertMessagesType(MessagesType messagesType)
    {
        return messagesTypeMapper.insertMessagesType(messagesType);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param messagesType 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateMessagesType(MessagesType messagesType)
    {
        return messagesTypeMapper.updateMessagesType(messagesType);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param mtIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteMessagesTypeByMtIds(Long[] mtIds)
    {
        return messagesTypeMapper.deleteMessagesTypeByMtIds(mtIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param mtId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteMessagesTypeByMtId(Long mtId)
    {
        return messagesTypeMapper.deleteMessagesTypeByMtId(mtId);
    }
}
