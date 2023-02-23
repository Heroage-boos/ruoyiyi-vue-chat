package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Messages;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
public interface MessagesMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param mId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Messages selectMessagesByMId(Long mId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param messages 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Messages> selectMessagesList(Messages messages);

    /**
     * 新增【请填写功能名称】
     * 
     * @param messages 【请填写功能名称】
     * @return 结果
     */
    public int insertMessages(Messages messages);

    /**
     * 修改【请填写功能名称】
     * 
     * @param messages 【请填写功能名称】
     * @return 结果
     */
    public int updateMessages(Messages messages);

    /**
     * 删除【请填写功能名称】
     * 
     * @param mId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteMessagesByMId(Long mId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param mIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMessagesByMIds(Long[] mIds);
}
