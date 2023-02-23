package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 province
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
public class Province extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** （省份ID）     */
    @Excel(name = "", readConverterExp = "省=份ID")
    private Long pId;

    /**  (名字)     */
    @Excel(name = " (名字)    ")
    private String pName;

    /**  所属国家ID    外键 */
    @Excel(name = " 所属国家ID    外键")
    private Long pNationid;

    public void setpId(Long pId) 
    {
        this.pId = pId;
    }

    public Long getpId() 
    {
        return pId;
    }
    public void setpName(String pName) 
    {
        this.pName = pName;
    }

    public String getpName() 
    {
        return pName;
    }
    public void setpNationid(Long pNationid) 
    {
        this.pNationid = pNationid;
    }

    public Long getpNationid() 
    {
        return pNationid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pId", getpId())
            .append("pName", getpName())
            .append("pNationid", getpNationid())
            .toString();
    }
}
