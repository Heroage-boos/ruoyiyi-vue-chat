package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 user_groups_touser
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
public class UserGroupsTouser extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long ugId;

    /** 用户ID    外键 */
    @Excel(name = "用户ID    外键")
    private Long ugUserid;

    /**  群ID    外键 */
    @Excel(name = " 群ID    外键")
    private Long ugGroupid;

    /** 发送时间    Null */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发送时间    Null", width = 30, dateFormat = "yyyy-MM-dd")
    private Date ugCreatetime;

    /** 群内用户昵称    Null */
    @Excel(name = "群内用户昵称    Null")
    private String ugGroupnick;

    public void setUgId(Long ugId) 
    {
        this.ugId = ugId;
    }

    public Long getUgId() 
    {
        return ugId;
    }
    public void setUgUserid(Long ugUserid)
    {
        this.ugUserid = ugUserid;
    }

    public Long getUgUserid()
    {
        return ugUserid;
    }
    public void setUgGroupid(Long ugGroupid)
    {
        this.ugGroupid = ugGroupid;
    }

    public Long getUgGroupid()
    {
        return ugGroupid;
    }
    public void setUgCreatetime(Date ugCreatetime)
    {
        this.ugCreatetime = ugCreatetime;
    }

    public Date getUgCreatetime()
    {
        return ugCreatetime;
    }
    public void setUgGroupnick(String ugGroupnick)
    {
        this.ugGroupnick = ugGroupnick;
    }

    public String getUgGroupnick()
    {
        return ugGroupnick;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("ugId", getUgId())
            .append("ugUserid", getUgUserid())
            .append("ugGroupid", getUgGroupid())
            .append("ugCreatetime", getUgCreatetime())
            .append("ugGroupnick", getUgGroupnick())
            .toString();
    }
}
