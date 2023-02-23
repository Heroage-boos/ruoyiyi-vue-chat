package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 friends
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
public class Friends extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID    主键 */
    private Long fId;

    /** 朋友的ID    外键 */
    @Excel(name = "朋友的ID    外键")
    private Long fFirendid;

    /** 自己的ID    外键 */
    @Excel(name = "自己的ID    外键")
    private Long fUserid;

    /**  备注昵称    Null */
    @Excel(name = " 备注昵称    Null")
    private String fName;

    /**   (好友类型)    外键 */
    @Excel(name = "  (好友类型)    外键")
    private Long fFriendtypeid;

    /**  (所属分组ID)    外键   */
    @Excel(name = " (所属分组ID)    外键  ")
    private Long fFriendgroupsid;

    public void setfId(Long fId) 
    {
        this.fId = fId;
    }

    public Long getfId() 
    {
        return fId;
    }
    public void setfFirendid(Long fFirendid) 
    {
        this.fFirendid = fFirendid;
    }

    public Long getfFirendid() 
    {
        return fFirendid;
    }
    public void setfUserid(Long fUserid) 
    {
        this.fUserid = fUserid;
    }

    public Long getfUserid() 
    {
        return fUserid;
    }
    public void setfName(String fName) 
    {
        this.fName = fName;
    }

    public String getfName() 
    {
        return fName;
    }
    public void setfFriendtypeid(Long fFriendtypeid) 
    {
        this.fFriendtypeid = fFriendtypeid;
    }

    public Long getfFriendtypeid() 
    {
        return fFriendtypeid;
    }
    public void setfFriendgroupsid(Long fFriendgroupsid) 
    {
        this.fFriendgroupsid = fFriendgroupsid;
    }

    public Long getfFriendgroupsid() 
    {
        return fFriendgroupsid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("fId", getfId())
            .append("fFirendid", getfFirendid())
            .append("fUserid", getfUserid())
            .append("fName", getfName())
            .append("fFriendtypeid", getfFriendtypeid())
            .append("fFriendgroupsid", getfFriendgroupsid())
            .toString();
    }
}
