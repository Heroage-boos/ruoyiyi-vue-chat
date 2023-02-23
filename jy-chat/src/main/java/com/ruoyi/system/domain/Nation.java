package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 nation
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
public class Nation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  (国家ID)    主键 */
    private Long nId;

    /** (名字)     */
    @Excel(name = "(名字)    ")
    private String nName;

    public void setnId(Long nId) 
    {
        this.nId = nId;
    }

    public Long getnId() 
    {
        return nId;
    }
    public void setnName(String nName) 
    {
        this.nName = nName;
    }

    public String getnName() 
    {
        return nName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("nId", getnId())
            .append("nName", getnName())
            .toString();
    }
}
