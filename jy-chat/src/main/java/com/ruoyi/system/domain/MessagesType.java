package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 messages_type
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
public class MessagesType extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** (类型ID)    主键 */
    private Long mtId;

    /** 类型名称     */
    @Excel(name = "类型名称    ")
    private String mtName;

    public void setMtId(Long mtId) 
    {
        this.mtId = mtId;
    }

    public Long getMtId() 
    {
        return mtId;
    }
    public void setMtName(String mtName) 
    {
        this.mtName = mtName;
    }

    public String getMtName() 
    {
        return mtName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("mtId", getMtId())
            .append("mtName", getMtName())
            .toString();
    }
}
