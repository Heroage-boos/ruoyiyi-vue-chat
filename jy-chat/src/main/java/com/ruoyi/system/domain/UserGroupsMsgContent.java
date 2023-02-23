package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 user_groups_msg_content
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
public class UserGroupsMsgContent extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 群消息ID    主键 */
    private Long gmId;

    /** 消息内容  */
    @Excel(name = "消息内容 ")
    private String gmContent;

    /** 发送者ID   */
    @Excel(name = "发送者ID  ")
    private Long gmFromid;

    /** 发送者昵称  */
    @Excel(name = "发送者昵称 ")
    private String gmFromuname;

    /** 发送时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发送时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date gmCreatetime;

    public void setGmId(Long gmId)
    {
        this.gmId = gmId;
    }

    public Long getGmId()
    {
        return gmId;
    }
    public void setGmContent(String gmContent)
    {
        this.gmContent = gmContent;
    }

    public String getGmContent()
    {
        return gmContent;
    }
    public void setGmFromid(Long gmFromid)
    {
        this.gmFromid = gmFromid;
    }

    public Long getGmFromid()
    {
        return gmFromid;
    }
    public void setGmFromuname(String gmFromuname)
    {
        this.gmFromuname = gmFromuname;
    }

    public String getGmFromuname()
    {
        return gmFromuname;
    }
    public void setGmCreatetime(Date gmCreatetime)
    {
        this.gmCreatetime = gmCreatetime;
    }

    public Date getGmCreatetime()
    {
        return gmCreatetime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("gmId", getGmId())
            .append("gmContent", getGmContent())
            .append("gmFromid", getGmFromid())
            .append("gmFromuname", getGmFromuname())
            .append("gmCreatetime", getGmCreatetime())
            .toString();
    }
}
