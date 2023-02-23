package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.system.mapper.MessagesMapper;
import com.ruoyi.system.service.IMessagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.domain.Messages;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
@Service
public class MessagesServiceImpl implements IMessagesService
{
    @Autowired
    private MessagesMapper messagesMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param mId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Messages selectMessagesByMId(Long mId)
    {
        return messagesMapper.selectMessagesByMId(mId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param messages 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Messages> selectMessagesList(Messages messages)
    {
        return messagesMapper.selectMessagesList(messages);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param messages 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertMessages(Messages messages)
    {
        return messagesMapper.insertMessages(messages);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param messages 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateMessages(Messages messages)
    {
        return messagesMapper.updateMessages(messages);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param mIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteMessagesByMIds(Long[] mIds)
    {
        return messagesMapper.deleteMessagesByMIds(mIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param mId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteMessagesByMId(Long mId)
    {
        return messagesMapper.deleteMessagesByMId(mId);
    }
}
