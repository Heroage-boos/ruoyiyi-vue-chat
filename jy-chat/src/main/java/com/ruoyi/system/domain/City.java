package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 city
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
public class City extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 城市ID */
    @Excel(name = "城市ID")
    private Long cId;

    /**  (名字)     */
    @Excel(name = " (名字)    ")
    private String cName;

    /** 所属省份ID    外键 */
    @Excel(name = "所属省份ID    外键")
    private Long cProvinceid;

    public void setcId(Long cId) 
    {
        this.cId = cId;
    }

    public Long getcId() 
    {
        return cId;
    }
    public void setcName(String cName) 
    {
        this.cName = cName;
    }

    public String getcName() 
    {
        return cName;
    }
    public void setcProvinceid(Long cProvinceid) 
    {
        this.cProvinceid = cProvinceid;
    }

    public Long getcProvinceid() 
    {
        return cProvinceid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("cId", getcId())
            .append("cName", getcName())
            .append("cProvinceid", getcProvinceid())
            .toString();
    }
}
