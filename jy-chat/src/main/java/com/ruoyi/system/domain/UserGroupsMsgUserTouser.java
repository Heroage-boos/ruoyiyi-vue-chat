package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 user_groups_msg_user_touser
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
public class UserGroupsMsgUserTouser extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  主键 */
    private Long gmId;

    /** 发送者ID */
    @Excel(name = "发送者ID")
    private Long gmFromuserid;

    /** 发送者昵称   */
    @Excel(name = "发送者昵称  ")
    private String gmFromusername;

    /**  接收者ID */
    @Excel(name = " 接收者ID")
    private Long gmTouserid;

    /** 消息内容     */
    @Excel(name = "消息内容    ")
    private String gmMsgcontent;

    /** 接收状态 */
    @Excel(name = "接收状态")
    private Integer gmState;

    /** 发送时间     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发送时间    ", width = 30, dateFormat = "yyyy-MM-dd")
    private Date gmCreatetime;

    /** 所属群ID  */
    @Excel(name = "所属群ID ")
    private Long gmUsergroupid;

    public void setGmId(Long gmId)
    {
        this.gmId = gmId;
    }

    public Long getGmId()
    {
        return gmId;
    }
    public void setGmFromuserid(Long gmFromuserid)
    {
        this.gmFromuserid = gmFromuserid;
    }

    public Long getGmFromuserid()
    {
        return gmFromuserid;
    }
    public void setGmFromusername(String gmFromusername)
    {
        this.gmFromusername = gmFromusername;
    }

    public String getGmFromusername()
    {
        return gmFromusername;
    }
    public void setGmTouserid(Long gmTouserid)
    {
        this.gmTouserid = gmTouserid;
    }

    public Long getGmTouserid()
    {
        return gmTouserid;
    }
    public void setGmMsgcontent(String gmMsgcontent)
    {
        this.gmMsgcontent = gmMsgcontent;
    }

    public String getGmMsgcontent()
    {
        return gmMsgcontent;
    }
    public void setGmState(Integer gmState)
    {
        this.gmState = gmState;
    }

    public Integer getGmState()
    {
        return gmState;
    }
    public void setGmCreatetime(Date gmCreatetime)
    {
        this.gmCreatetime = gmCreatetime;
    }

    public Date getGmCreatetime()
    {
        return gmCreatetime;
    }
    public void setGmusergroupid(Long gmUsergroupid)
    {
        this.gmUsergroupid = gmUsergroupid;
    }

    public Long getGmUsergroupid()
    {
        return gmUsergroupid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("gmId", getGmId())
            .append("gmFromuserid", getGmFromuserid())
            .append("gmFromusername", getGmFromusername())
            .append("gmTouserid", getGmTouserid())
            .append("gmMsgcontent", getGmMsgcontent())
            .append("gmState", getGmState())
            .append("gmCreatetime", getGmCreatetime())
            .append("gmUsergroupid", getGmUsergroupid())
            .toString();
    }
}
