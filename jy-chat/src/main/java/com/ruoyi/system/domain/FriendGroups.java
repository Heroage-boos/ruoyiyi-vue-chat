package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 friend_groups
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
public class FriendGroups extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  (分组ID)    主键 */
    @Excel(name = " (分组ID)    主键")
    private Long fgId;

    /** (分组名字)   */
    @Excel(name = "(分组名字)  ")
    private String fgName;

    /** 外键 */
    @Excel(name = "外键")
    private Long fgUserid;

    public void setFgId(Long fgId) 
    {
        this.fgId = fgId;
    }

    public Long getFgId() 
    {
        return fgId;
    }
    public void setFgName(String fgName) 
    {
        this.fgName = fgName;
    }

    public String getFgName() 
    {
        return fgName;
    }
    public void setFgUserid(Long fgUserid) 
    {
        this.fgUserid = fgUserid;
    }

    public Long getFgUserid() 
    {
        return fgUserid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("fgId", getFgId())
            .append("fgName", getFgName())
            .append("fgUserid", getFgUserid())
            .toString();
    }
}
