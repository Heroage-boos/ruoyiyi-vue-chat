package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 user_state
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
public class UserState extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long usId;

    /** 状态名字 */
    @Excel(name = "状态名字")
    private String usName;

    public void setUsId(Long usId) 
    {
        this.usId = usId;
    }

    public Long getUsId() 
    {
        return usId;
    }
    public void setUsName(String usName)
    {
        this.usName = usName;
    }

    public String getUsName()
    {
        return usName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("usId", getUsId())
            .append("us Name", getUsName())
            .toString();
    }
}
