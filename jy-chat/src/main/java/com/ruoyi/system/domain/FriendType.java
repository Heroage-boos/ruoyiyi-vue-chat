package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 friend_type
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
public class FriendType extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** （类型ID）    主键 */
    private Long ftId;

    /** 类型名称 */
    @Excel(name = "类型名称")
    private String ftName;

    public void setFtId(Long ftId) 
    {
        this.ftId = ftId;
    }

    public Long getFtId() 
    {
        return ftId;
    }
    public void setFtName(String ftName) 
    {
        this.ftName = ftName;
    }

    public String getFtName() 
    {
        return ftName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("ftId", getFtId())
            .append("ftName", getFtName())
            .toString();
    }
}
