package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 user_groups
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
public class UserGroups extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**   群ID    主键 */
    private Long ugId;

    /** 群名称 */
    @Excel(name = "群名称")
    private String ugName;

    /**   创建时间    默认值 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "  创建时间    默认值", width = 30, dateFormat = "yyyy-MM-dd")
    private Date ugCreatetime;

    /** 群主ID（指向用户表) */
    @Excel(name = "群主ID", readConverterExp = "群主ID（指向用户表)")
    private Long ugAdminid;

    /** 群图标 */
    @Excel(name = "群图标")
    private String ugIcon;

    /** 群公告 */
    @Excel(name = "群公告")
    private String ugNotice;

    /** 群简介 */
    @Excel(name = "群简介")
    private String ugIntro;

    public void setUgId(Long ugId) 
    {
        this.ugId = ugId;
    }

    public Long getUgId() 
    {
        return ugId;
    }
    public void setUgName(String ugName) 
    {
        this.ugName = ugName;
    }

    public String getUgName() 
    {
        return ugName;
    }
    public void setUgCreatetime(Date ugCreatetime) 
    {
        this.ugCreatetime = ugCreatetime;
    }

    public Date getUgCreatetime() 
    {
        return ugCreatetime;
    }
    public void setUgAdminid(Long ugAdminid) 
    {
        this.ugAdminid = ugAdminid;
    }

    public Long getUgAdminid() 
    {
        return ugAdminid;
    }
    public void setUgIcon(String ugIcon) 
    {
        this.ugIcon = ugIcon;
    }

    public String getUgIcon() 
    {
        return ugIcon;
    }
    public void setUgNotice(String ugNotice) 
    {
        this.ugNotice = ugNotice;
    }

    public String getUgNotice() 
    {
        return ugNotice;
    }
    public void setUgIntro(String ugIntro) 
    {
        this.ugIntro = ugIntro;
    }

    public String getUgIntro() 
    {
        return ugIntro;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("ugId", getUgId())
            .append("ugName", getUgName())
            .append("ugCreatetime", getUgCreatetime())
            .append("ugAdminid", getUgAdminid())
            .append("ugIcon", getUgIcon())
            .append("ugNotice", getUgNotice())
            .append("ugIntro", getUgIntro())
            .toString();
    }
}
